package com.leara.dtoclasses;
/*
  Class to store user input for querying emissions related to food item.
 */
public class FoodItem {
    private String foodName;

    public FoodItem() {
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "foodName='" + foodName + '\'' +
                '}';
    }
}
