const CATEGORY_URL = "https://ieppfood-2004.restdb.io/rest/all-category",
    FOOD_URL = "https://ieppfood-2004.restdb.io/rest/all-food",
    APIKEY = "615d37458597142da174544d";

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
    console.log(response[1]);
});

var categoryListCall = {
    "async": true,
    "crossDomain": true,
    "url": CATEGORY_URL,
    "method": "GET",
    "headers": {
        "content-type": "application/json",
        "x-apikey": APIKEY,
        "cache-control": "no-cache"
    }
}

$.ajax(categoryListCall).done(function (response) {
    console.log(response);
});

