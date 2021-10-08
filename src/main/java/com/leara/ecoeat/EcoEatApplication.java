package com.leara.ecoeat;

import com.leara.dtoclasses.*;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;


/**
 * @author Leara
 */


@CrossOrigin(origins = "/**", allowCredentials = "true", maxAge = 3600)
@SpringBootApplication
@Controller
public class EcoEatApplication {

    private static final Logger log = LoggerFactory.getLogger(EcoEatApplication.class);

    private static final String ALL_FOOD_BASE_URL = "https://ieppfood-2004.restdb.io/rest/all-food";
    private static final String ALL_CATEGORY_BASE_URL = "https://ieppfood-2004.restdb.io/rest/all-category";
    private static final String APIKEY_FOOD = "2630bf41b33a68f101f4af580f4cb65d49d9a";



    private static String queryFoodUrl = "http://54.153.203.248:8080/food/queryFood";
    //private static String queryRecipeUrl = "http://54.153.203.248:8080/food/queryRecipe";
    private static String queryRecipeUrl = "http://47.113.179.46:8080/food/queryRecipe";
    public static void main(String[] args) {
        SpringApplication.run(EcoEatApplication.class, args);
    }



    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/project")
    public  String viewProject(){
        return "project";
    }


    /*
        Mapping for View tips
     */

    @RequestMapping("/tips")
    public String viewTips() {
        return "tips";
    }

    /*
        Mapping for View maps
     */
    @RequestMapping("/map")
    public String viewMap() {
        return "map";
    }

    /*
        Mapping for View emissions
     */

    @GetMapping("/emissions")
    public String viewEmissions(Model model) {
        return "emissions";
    }



    @GetMapping("/recipes")
    public String recipeForm(Model model) {
        model.addAttribute("recipeItem", new RecipeItem());
        return "recipes";
    }


    @PostMapping("/recipes")
    public String sendRecipeRequest(@ModelAttribute RecipeItem recipeItem, Model model) {
        model.addAttribute("recipeItem", recipeItem);
        log.info(recipeItem.toString());
        /*QueryRecipeRequest request = new QueryRecipeRequest(recipeItem.getName());

        QueryRecipeResponse response = postRecipes(request);
        log.info(response.toString());
        log.info("records " + response.getRecords()[0].getName());
        model.addAttribute("response", response);*/
        return "reciperesults";
    }

    @PostMapping("/recipescategories")
    public String sendRecipeCategoryRequest(@ModelAttribute RecipeItem recipeItem, Model model) {
        model.addAttribute("recipeItem", recipeItem);
        log.info("category " + recipeItem.toString());
        QueryRecipeRequest request = new QueryRecipeRequest(recipeItem.getCategory());

        QueryRecipeResponse response = postRecipes(request);
        log.info(response.toString());
        log.info("records category " + response.getRecords()[0].getName());
        model.addAttribute("response", response);
        return "reciperesults";
    }

    @PostMapping("/foodrecipes")
    public QueryRecipeResponse postRecipes(@RequestBody QueryRecipeRequest request) {

        QueryRecipeResponse response = restTemplate.postForObject(
                queryRecipeUrl, request, QueryRecipeResponse.class);
        return response;
    }




    /*
    Iteration one Mapping section
    Page include index (home page), tips, emissions, results
     */

    //    Homepage Mapping
    @GetMapping("/iteration1")
    public String viewIteration1Home() {
        return "iteration1Index";
    }

    //    Tips page Mapping
    @GetMapping("/iteration1/tips")
    public String viewIteration1Tips() {
        return "iteration1Tips";
    }

    /*
    Mapping for View emissions
 */
    @GetMapping("/iteration1/emissions")
    public String iteration1FoodForm(Model model) {
        model.addAttribute("foodItem", new FoodItem());
        return "iteration1Emission";
    }

    /*
       Mapping for View emissions - invoke service to get details on food emissions
       and map to model attribute.
    */
    @PostMapping("/iteration1/emissions")
    public String iteration1FoodSubmit(@ModelAttribute FoodItem foodItem, Model model) {
        model.addAttribute("foodItem", foodItem);

        QueryFoodRequest request = new QueryFoodRequest(foodItem.getFoodName());
        QueryFoodResponse response[] = iteration1PostFoodEmissions(request);

        model.addAttribute("response", response[0]);
        return "iteration1Results";
    }

    @PostMapping("/iteration1/foodemissions")
    public QueryFoodResponse[] iteration1PostFoodEmissions(@RequestBody QueryFoodRequest request) {

        QueryFoodResponse response[] = restTemplate.postForObject(
                queryFoodUrl, request, QueryFoodResponse[].class);
        return response;
    }


    /*
    Iteration two Mapping section
    Page include index (home page), tips, emissions, map
     */

    //    Homepage Mapping
    @GetMapping("/iteration2")
    public String viewIteration2Home() {
        return "iteration2Index";
    }

    /*
    Mapping for View tips
 */
    @RequestMapping("/iteration2/tips")
    public String viewIteration2Tips() {
        return "iteration2Tips";
    }

    /*
        Mapping for View maps
     */
    @RequestMapping("/iteration2/map")
    public String viewIteration2Map() {
        return "iteration2Map";
    }

    /*
        Mapping for View emissions
     */
    @GetMapping("/iteration2/emissions")
    public String viewIteration2Emissions(Model model) {
        log.info("start");
//        sendFoodRequest(model);
        log.info("Done");
        return "iteration2Emissions";
    }

    @PostMapping("/iteration2/emissions")
    public String sendIteration2FoodRequest(Model model) {
        FormattedFood newFood;
        //        Send request to database
//        QueryFoodRequest request = new QueryFoodRequest("");
//        QueryFoodResponse[] response = postFoodEmissions(request);
//
//        ArrayList<FormattedFood> data = new ArrayList<FormattedFood>();
//        for (QueryFoodResponse queryFoodResponse : response) {
//            newFood = new FormattedFood(queryFoodResponse);
//            data.add(newFood);
//        }
//
//        model.addAttribute("response", data);
//        log.info(String.valueOf(response.length));
//        log.info(String.valueOf(data.get(550).getFood()));

        return "iteration2Emissions";
    }


    @Bean
    public RestTemplate restIteration2Template(RestTemplateBuilder builder) {
        return builder.build();
    }

    @PostMapping("/iteration2/foodemissions")
    public QueryFoodResponse[] postIteration2FoodEmissions(@RequestBody QueryFoodRequest request) {

        QueryFoodResponse response[] = restTemplate.postForObject(
                queryFoodUrl, request, QueryFoodResponse[].class);
        return response;
    }


    //    work in progress page
    @GetMapping("/workinprogress")
    public String workInProgress() {
        return "workInProgress";
    }


    @GetMapping("/test")
    public String test() {
        return "test";
    }


}
