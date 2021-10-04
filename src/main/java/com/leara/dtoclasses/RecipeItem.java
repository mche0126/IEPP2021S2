package com.leara.dtoclasses;

public class RecipeItem {
    private String name;
    private String category;


    public RecipeItem() {
        this.name = "";
        this.category = "";
    }

    public RecipeItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "RecipeItem{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
