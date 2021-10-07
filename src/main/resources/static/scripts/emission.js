const FOOD_URL = "https://ieppfood-2004.restdb.io/rest/all-food",
    APIKEY = "615d37458597142da174544d";

var foodNameList;

var foodListCall = {
    "async": true,
    "crossDomain": true,
    "url": FOOD_URL,
    "method": "GET",
    "headers": {
        "content-type": "application/json",
        "x-apikey": APIKEY,
        "cache-control": "no-cache"
    }
}

$.ajax(foodListCall).done(function (response) {
    foodNameList = response
});

console.log(foodNameList)