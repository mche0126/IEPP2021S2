package com.leara.dtoclasses;

public class QueryRecipeRequest {
    private String name;
    private String recipeCategory;
    private String size;
    private String current;

    public QueryRecipeRequest() {
    }

    public QueryRecipeRequest(String name) {
        this.name = name;
        this.recipeCategory="";
        this.size="10";
        this.current="1";
    }

    public QueryRecipeRequest(String name, String recipeCategory) {
        this.name = name;
        this.recipeCategory = recipeCategory;
        this.size="10";
        this.current="1";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRecipeCategory() {
        return recipeCategory;
    }

    public void setRecipeCategory(String recipeCategory) {
        this.recipeCategory = recipeCategory;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }


}
