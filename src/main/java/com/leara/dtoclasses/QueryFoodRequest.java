package com.leara.dtoclasses;
/*
    Class to store request to food emission query service.
 */
public class QueryFoodRequest {

    private String keyWords;
    private String categories;

    public QueryFoodRequest(String keyWords) {
        this.keyWords = keyWords;
        this.categories="";
    }

    public QueryFoodRequest(String keyWords, String categories) {
        this.keyWords = keyWords;
        this.categories = categories;
    }

    public QueryFoodRequest() {
        this.keyWords = "";
        this.categories = "";
    }

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }
}
