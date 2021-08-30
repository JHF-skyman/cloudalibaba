package com.skyman.order.utils;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import org.springframework.util.CollectionUtils;

/**
 * Copyright © 2021 虎彩印艺股份有限公司. All rights reserved.
 *
 * @author JiaHF
 * @description
 * @since 2021/8/16
 */
public class PageUtil<T> {

  private Integer pageNum;

  private Integer pageSize;

  private Integer total;

  private Integer pages;

  private List<T> rows = new ArrayList<>();

  public PageUtil() {
  }

  public Integer getPageNum() {
    return pageNum;
  }

  public void setPageNum(Integer pageNum) {
    this.pageNum = pageNum;
  }

  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public Integer getPages() {
    return pages;
  }

  public void setPages(Integer pages) {
    this.pages = pages;
  }

  public List<T> getRows() {
    return rows;
  }

  public void setRows(List<T> rows) {
    this.rows = rows;
  }

  public static int init(Integer pageNum, Integer pageSize) {
    return (pageNum - 1) * pageSize;
  }

  /**
   * 将List分页(假分页)
   *
   * @param pageNum 当前页
   * @param pageSize 页大小
   * @param list 源List
   * @return 分页信息集合
   */
  public PageUtil<T> listToPage(Integer pageNum, Integer pageSize, List<T> list) {
    PageUtil<T> pageOut = new PageUtil<>();
    if (CollectionUtils.isEmpty(list)) {
      pageOut.setTotal(0);
      pageOut.setRows(Lists.newArrayList());
      return pageOut;
    }
    int limit = init(pageNum, pageSize);
    int size = list.size();
    int totalPage = getTotalPage(pageSize, size);
    pageOut.setPages(totalPage);
    pageOut.setTotal(size);
    if (pageNum > totalPage) {
      pageOut.setRows(Lists.newArrayList());
      return pageOut;
    }
    if (pageNum == totalPage) {
      list = list.subList(limit, size);
    } else {
      int end = limit + pageSize;
      list = list.subList(limit, end);
    }
    pageOut.setRows(list);
    pageOut.setPageNum(pageNum);
    pageOut.setPageSize(pageSize);
    return pageOut;
  }

  /**
   * 获取总的页数
   *
   * @param pageSize 页大小
   * @param totalSize 总大小
   * @return 总的页数
   */
  private static int getTotalPage(int pageSize, int totalSize) {
    int totalPage;
    if (totalSize % pageSize == 0) {
      totalPage = totalSize / pageSize;
    } else {
      totalPage = totalSize / pageSize + 1;
    }
    return totalPage;
  }

}
