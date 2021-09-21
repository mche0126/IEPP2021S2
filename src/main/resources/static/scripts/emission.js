$( document ).ready(function() {
    let endpoint = "http://47.113.179.46:8080/food/queryFoodMessage",

    $( ".content a" ).each(function( index, element ) {

        $.ajax({
            url: endpoint,
            contentType: "application/json",
            dataType: 'json',
            success: function(result){
                console.log(result);
            }
        })
    });
});