package com.leara.dtoclasses;

public class RecipeItem {
    private String name;


    public RecipeItem() {
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

    @Override
    public String toString() {
        return "RecipeItem{" +
                "name='" + name + '\'' +
                '}';
    }
}
