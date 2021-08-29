package com.leara.dtoclasses;
/*
    Class to store response from food emission query service.
 */
public class QueryFoodResponse {

    private String id;
    private String food;
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
    private String emissionsFrom;
    private String category;
    private String keyWords;
    private String emissionsLandUse;
    private String emissionsFarm;
    private String emissionsAnimalFeed;
    private String emissionsProcessing;
    private String emissionsTransport;
    private String emissionsRetail;
    private String emissionsPackaging;
    private String emissionsTotal;
    private String waterUsed;
    private String landUsed;

    public QueryFoodResponse() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
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

    public String getEmissionsFrom() {
        return emissionsFrom;
    }

    public void setEmissionsFrom(String emissionsFrom) {
        this.emissionsFrom = emissionsFrom;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    public String getEmissionsLandUse() {
        return emissionsLandUse;
    }

    public void setEmissionsLandUse(String emissionsLandUse) {
        this.emissionsLandUse = emissionsLandUse;
    }

    public String getEmissionsFarm() {
        return emissionsFarm;
    }

    public void setEmissionsFarm(String emissionsFarm) {
        this.emissionsFarm = emissionsFarm;
    }

    public String getEmissionsAnimalFeed() {
        return emissionsAnimalFeed;
    }

    public void setEmissionsAnimalFeed(String emissionsAnimalFeed) {
        this.emissionsAnimalFeed = emissionsAnimalFeed;
    }

    public String getEmissionsProcessing() {
        return emissionsProcessing;
    }

    public void setEmissionsProcessing(String emissionsProcessing) {
        this.emissionsProcessing = emissionsProcessing;
    }

    public String getEmissionsTransport() {
        return emissionsTransport;
    }

    public void setEmissionsTransport(String emissionsTransport) {
        this.emissionsTransport = emissionsTransport;
    }

    public String getEmissionsRetail() {
        return emissionsRetail;
    }

    public void setEmissionsRetail(String emissionsRetail) {
        this.emissionsRetail = emissionsRetail;
    }

    public String getEmissionsPackaging() {
        return emissionsPackaging;
    }

    public void setEmissionsPackaging(String emissionsPackaging) {
        this.emissionsPackaging = emissionsPackaging;
    }

    public String getEmissionsTotal() {
        return emissionsTotal;
    }

    public void setEmissionsTotal(String emissionsTotal) {
        this.emissionsTotal = emissionsTotal;
    }

    public String getWaterUsed() {
        return waterUsed;
    }

    public void setWaterUsed(String waterUsed) {
        this.waterUsed = waterUsed;
    }

    public String getLandUsed() {
        return landUsed;
    }

    public void setLandUsed(String landUsed) {
        this.landUsed = landUsed;
    }

    @Override
    public String toString() {
        return "QueryFoodResponse{" +
                "id=" + id +
                ", food='" + food + '\'' +
                '}';
    }
}

