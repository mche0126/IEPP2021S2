package com.leara.ecoeat;

import com.leara.dtoclasses.FoodItem;
import com.leara.dtoclasses.FormattedFood;
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

import java.util.ArrayList;


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
        log.info("start");
        sendFoodRequest(model);
        log.info("Done");
        return "emissions";
    }

    @PostMapping("/emissions")
    public String sendFoodRequest(Model model) {
        FormattedFood newFood;
        //        Send request to database
        QueryFoodRequest request = new QueryFoodRequest("");
        QueryFoodResponse[] response = postFoodEmissions(request);

        ArrayList<FormattedFood> data = new ArrayList<FormattedFood>();
        for (QueryFoodResponse queryFoodResponse : response) {
            newFood = new FormattedFood(queryFoodResponse);
            data.add(newFood);
        }

        model.addAttribute("response", data);
        log.info(String.valueOf(response.length));
        log.info(String.valueOf(data.get(550).getFood()));

        return "emissions";
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

    //    work in progress page
    @GetMapping("/workinprogress")
    public String workInProgress() {
        return "workInProgress";
    }


}
