package com.leara.dtoclasses;

public class RecipeRecord {
    private int id;
    private String name;
    private String ingredients;
    private String directions;
    private String link;
    private String cookTime;
    private String prepTime;
    private String totalTime;
    private String recipeCategory;
    private String images;
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

    private String cholesterol;

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

    public RecipeRecord() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getCookTime() {
        return cookTime;
    }

    public void setCookTime(String cookTime) {
        this.cookTime = cookTime;
    }

    public String getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(String prepTime) {
        this.prepTime = prepTime;
    }

    public String getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(String totalTime) {
        this.totalTime = totalTime;
    }

    public String getRecipeCategory() {
        return recipeCategory;
    }

    public void setRecipeCategory(String recipeCategory) {
        this.recipeCategory = recipeCategory;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
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

    public String getCholesterol() {
        return cholesterol;
    }

    public void setCholesterol(String cholesterol) {
        this.cholesterol = cholesterol;
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
        return "RecipeRecord{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
