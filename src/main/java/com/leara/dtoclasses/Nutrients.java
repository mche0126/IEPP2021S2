package com.leara.dtoclasses;

public class Nutrients {
    private String calories;
    private String totalFat;
    private String sodium;
    private String potassium;
    private String totalCarbohydrate;
    private String dietaryFiber;
    private String sugars;
    private String protein;
    private String vitaminA;
    private String vitaminC;
    private String calcium;
    private String iron;
    private String saturatedFat;
    private String chole_sterol;

    public Nutrients(String calories, String totalFat, String sodium, String potassium, String totalCarbohydrate,
                     String dietaryFiber, String sugars, String protein, String vitaminA, String vitaminC,
                     String calcium, String iron, String saturatedFat, String chole_sterol) {
        this.calories = calories;
        this.totalFat = totalFat;
        this.sodium = sodium;
        this.potassium = potassium;
        this.totalCarbohydrate = totalCarbohydrate;
        this.dietaryFiber = dietaryFiber;
        this.sugars = sugars;
        this.protein = protein;
        this.vitaminA = vitaminA;
        this.vitaminC = vitaminC;
        this.calcium = calcium;
        this.iron = iron;
        this.saturatedFat = saturatedFat;
        this.chole_sterol = chole_sterol;
    }

    public String getCalories() {
        return calories;
    }

    public void setCalories(String calories) {
        this.calories = calories;
    }

    public String getTotalFat() {
        return totalFat;
    }

    public void setTotalFat(String totalFat) {
        this.totalFat = totalFat;
    }

    public String getSodium() {
        return sodium;
    }

    public void setSodium(String sodium) {
        this.sodium = sodium;
    }

    public String getPotassium() {
        return potassium;
    }

    public void setPotassium(String potassium) {
        this.potassium = potassium;
    }

    public String getTotalCarbohydrate() {
        return totalCarbohydrate;
    }

    public void setTotalCarbohydrate(String totalCarbohydrate) {
        this.totalCarbohydrate = totalCarbohydrate;
    }

    public String getDietaryFiber() {
        return dietaryFiber;
    }

    public void setDietaryFiber(String dietaryFiber) {
        this.dietaryFiber = dietaryFiber;
    }

    public String getSugars() {
        return sugars;
    }

    public void setSugars(String sugars) {
        this.sugars = sugars;
    }

    public String getProtein() {
        return protein;
    }

    public void setProtein(String protein) {
        this.protein = protein;
    }

    public String getVitaminA() {
        return vitaminA;
    }

    public void setVitaminA(String vitaminA) {
        this.vitaminA = vitaminA;
    }

    public String getVitaminC() {
        return vitaminC;
    }

    public void setVitaminC(String vitaminC) {
        this.vitaminC = vitaminC;
    }

    public String getCalcium() {
        return calcium;
    }

    public void setCalcium(String calcium) {
        this.calcium = calcium;
    }

    public String getIron() {
        return iron;
    }

    public void setIron(String iron) {
        this.iron = iron;
    }

    public String getSaturatedFat() {
        return saturatedFat;
    }

    public void setSaturatedFat(String saturatedFat) {
        this.saturatedFat = saturatedFat;
    }

    public String getChole_sterol() {
        return chole_sterol;
    }

    public void setChole_sterol(String chole_sterol) {
        this.chole_sterol = chole_sterol;
    }

}
