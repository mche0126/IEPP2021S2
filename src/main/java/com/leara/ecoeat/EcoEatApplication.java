package com.leara.ecoeat;

import com.leara.dtoclasses.FoodItem;
import com.leara.dtoclasses.QueryFoodRequest;
import com.leara.dtoclasses.QueryFoodResponse;
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



@SpringBootApplication
@Controller
public class EcoEatApplication {

    private static final Logger log = LoggerFactory.getLogger(EcoEatApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(EcoEatApplication.class, args);
    }
    private static String queryFoodUrl = "http://47.113.179.46:8080/food/queryFoodMessage";
    @Autowired
    RestTemplate restTemplate;


    /*
        Mapping for View tips
     */
    @RequestMapping("/tips")
    public String viewTips() {
        return "tips";
    }

    /*
        Mapping for View emissions
     */
    @GetMapping("/emissions")
    public String foodForm(Model model) {
        model.addAttribute("foodItem", new FoodItem());
        return "emissions";
    }

    /*
        Mapping for View emissions - invoke service to get details on food emissions
        and map to model attribute.
     */
    @PostMapping("/emissions")
    public String foodSubmit(@ModelAttribute FoodItem foodItem, Model model) {
        model.addAttribute("foodItem", foodItem);
        log.info(foodItem.toString());
        QueryFoodRequest request = new QueryFoodRequest(foodItem.getFoodName());
        QueryFoodResponse response[] = postFoodEmissions(request);
        log.info(response[0].toString());
        model.addAttribute("response", response[0]);
        return "results";
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @PostMapping("/foodemissions")
    public QueryFoodResponse[] postFoodEmissions(@RequestBody QueryFoodRequest request) {

        QueryFoodResponse response[] = restTemplate.postForObject(
                queryFoodUrl, request, QueryFoodResponse[].class);
        return response;
    }


    /*
    Iteration one Mapping section
    Page include index (home page), tips, emissions, results
     */

//    Homepage Mapping
    @RequestMapping("/iteration1")
    public String viewIteration1Home(){
        return "/iteration1/index";
    }

//    Tips page Mapping
    @RequestMapping("/iteration1/tips")
    public String viewIteration1Tips() {
        return "/iteration1/tips";
    }

    /*
    Mapping for View emissions
 */
    @GetMapping("/iteration1/emissions")
    public String Iteration1FoodForm(Model model) {
        model.addAttribute("foodItem", new FoodItem());
        return "iteration1/emissions";
    }

    /*
       Mapping for View emissions - invoke service to get details on food emissions
       and map to model attribute.
    */
    @PostMapping("/iteration1/emissions")
    public String iteration1FoodSubmit(@ModelAttribute FoodItem foodItem, Model model) {
        model.addAttribute("foodItem", foodItem);
        log.info(foodItem.toString());
        QueryFoodRequest request = new QueryFoodRequest(foodItem.getFoodName());
        QueryFoodResponse response[] = postFoodEmissions(request);
        log.info(response[0].toString());
        model.addAttribute("response", response[0]);
        return "iteration1/results";
    }

    @Bean
    public RestTemplate iteration1RestTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }


}
