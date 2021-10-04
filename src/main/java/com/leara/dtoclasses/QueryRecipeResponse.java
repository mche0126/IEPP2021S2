package com.leara.dtoclasses;

import java.util.Arrays;

public class QueryRecipeResponse {
    private RecipeRecord[] records;
    private int total;
    private int size;
    private int current;
    private String[] orders;
    boolean searchCount;
    private int pages;

    public QueryRecipeResponse() {
    }

    public RecipeRecord[] getRecords() {
        return records;
    }

    public void setRecords(RecipeRecord[] records) {
        this.records = records;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public String[] getOrders() {
        return orders;
    }

    public void setOrders(String[] orders) {
        this.orders = orders;
    }

    public boolean isSearchCount() {
        return searchCount;
    }

    public void setSearchCount(boolean searchCount) {
        this.searchCount = searchCount;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "QueryRecipeResponse{" +
                "records=" + Arrays.toString(records) +
                ", total=" + total +
                ", size=" + size +
                ", current=" + current +
                ", orders=" + Arrays.toString(orders) +
                ", searchCount=" + searchCount +
                ", pages=" + pages +
                '}';
    }
}
