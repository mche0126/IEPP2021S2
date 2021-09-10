package com.leara.dtoclasses;

public class QueryRecipeResponse {
    private int id;
    private String name;
    private String ingredients;
    private String directions;
    private String link;
    private String cook_time;
    private String prep_time;
    private String total_time;
    private String recipe_category;
    private String images;
    private String calories;
    private String total_fat;
    private String sodium;
    private String potassium;
    private String total_carbohydrate;
    private String dietary_fiber;
    private String sugars;
    private String protein;
    private String vitamin_a;
    private String vitamin_c;
    private String calcium;
    private String iron;
    private String saturated_fat;

    private String cholesterol;

    private String emissions_land_use;
    private String emissions_farm;
    private String emissions_animal_feed;
    private String emissions_processing;

    private String emissions_transport;

    private String emissions_retail;
    private String emissions_packaging;
    private String emissions_total;
    private String water_used;

    private String land_used;

    public QueryRecipeResponse() {
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

    public String getCook_time() {
        return cook_time;
    }

    public void setCook_time(String cook_time) {
        this.cook_time = cook_time;
    }

    public String getPrep_time() {
        return prep_time;
    }

    public void setPrep_time(String prep_time) {
        this.prep_time = prep_time;
    }

    public String getTotal_time() {
        return total_time;
    }

    public void setTotal_time(String total_time) {
        this.total_time = total_time;
    }

    public String getRecipe_category() {
        return recipe_category;
    }

    public void setRecipe_category(String recipe_category) {
        this.recipe_category = recipe_category;
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

    public String getTotal_fat() {
        return total_fat;
    }

    public void setTotal_fat(String total_fat) {
        this.total_fat = total_fat;
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

    public String getTotal_carbohydrate() {
        return total_carbohydrate;
    }

    public void setTotal_carbohydrate(String total_carbohydrate) {
        this.total_carbohydrate = total_carbohydrate;
    }

    public String getDietary_fiber() {
        return dietary_fiber;
    }

    public void setDietary_fiber(String dietary_fiber) {
        this.dietary_fiber = dietary_fiber;
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

    public String getVitamin_a() {
        return vitamin_a;
    }

    public void setVitamin_a(String vitamin_a) {
        this.vitamin_a = vitamin_a;
    }

    public String getVitamin_c() {
        return vitamin_c;
    }

    public void setVitamin_c(String vitamin_c) {
        this.vitamin_c = vitamin_c;
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

    public String getSaturated_fat() {
        return saturated_fat;
    }

    public void setSaturated_fat(String saturated_fat) {
        this.saturated_fat = saturated_fat;
    }

    public String getCholesterol() {
        return cholesterol;
    }

    public void setCholesterol(String cholesterol) {
        this.cholesterol = cholesterol;
    }

    public String getEmissions_land_use() {
        return emissions_land_use;
    }

    public void setEmissions_land_use(String emissions_land_use) {
        this.emissions_land_use = emissions_land_use;
    }

    public String getEmissions_farm() {
        return emissions_farm;
    }

    public void setEmissions_farm(String emissions_farm) {
        this.emissions_farm = emissions_farm;
    }

    public String getEmissions_animal_feed() {
        return emissions_animal_feed;
    }

    public void setEmissions_animal_feed(String emissions_animal_feed) {
        this.emissions_animal_feed = emissions_animal_feed;
    }

    public String getEmissions_processing() {
        return emissions_processing;
    }

    public void setEmissions_processing(String emissions_processing) {
        this.emissions_processing = emissions_processing;
    }

    public String getEmissions_transport() {
        return emissions_transport;
    }

    public void setEmissions_transport(String emissions_transport) {
        this.emissions_transport = emissions_transport;
    }

    public String getEmissions_retail() {
        return emissions_retail;
    }

    public void setEmissions_retail(String emissions_retail) {
        this.emissions_retail = emissions_retail;
    }

    public String getEmissions_packaging() {
        return emissions_packaging;
    }

    public void setEmissions_packaging(String emissions_packaging) {
        this.emissions_packaging = emissions_packaging;
    }

    public String getEmissions_total() {
        return emissions_total;
    }

    public void setEmissions_total(String emissions_total) {
        this.emissions_total = emissions_total;
    }

    public String getWater_used() {
        return water_used;
    }

    public void setWater_used(String water_used) {
        this.water_used = water_used;
    }

    public String getLand_used() {
        return land_used;
    }

    public void setLand_used(String land_used) {
        this.land_used = land_used;
    }

    @Override
    public String toString() {
        return "QueryRecipeResponse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
