package com.leara.dtoclasses;

/**
 * @author Jason
 */
public class FormattedFood {
    private String food;
    private String category;
    private String keyWords;
    private Emission emission;
    private Nutrients nutrients;
    private String waterUsed;
    private String landUsed;


    public FormattedFood(String id, String food, String category, String keyWords, Emission emission, Nutrients nutrients, String waterUsed, String landUsed) {
        this.id = id;
        this.food = food;
        this.category = category;
        this.keyWords = keyWords;
        this.emission = emission;
        this.nutrients = nutrients;
        this.waterUsed = waterUsed;
        this.landUsed = landUsed;
    }

    //    create class from response
    public FormattedFood(QueryFoodResponse response) {
        this.id = response.getId();
        this.food = response.getFood();
        this.category = response.getCategory();
        this.keyWords = response.getKeyWords();
        this.emission = new Emission(response.getEmissionsLandUse(), response.getEmissionsFarm(), response.getEmissionsAnimalFeed(),
                response.getEmissionsProcessing(), response.getEmissionsTransport(), response.getEmissionsRetail(), response.getEmissionsPackaging(),
                response.getEmissionsTotal());
        this.nutrients = new Nutrients(response.getCalories(), response.getTotalFat(), response.getSodium(), response.getPotassium(),
                response.getTotalCarbohydrate(), response.getDietaryFiber(), response.getSugars(), response.getProtein(),
                response.getVitaminA(), response.getVitaminC(), response.getCalcium(), response.getIron(), response.getSaturatedFat(),
                response.getChole_sterol());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
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

    public Emission getEmission() {
        return emission;
    }

    public void setEmission(Emission emission) {
        this.emission = emission;
    }

    public Nutrients getNutrients() {
        return nutrients;
    }

    public void setNutrients(Nutrients nutrients) {
        this.nutrients = nutrients;
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
}
