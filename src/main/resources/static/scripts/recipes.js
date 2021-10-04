$( document ).ready(function() {
    let endpoint = "http://54.153.203.248:8080/food/queryAllCategory ";

        $.ajax({
            url: endpoint,
            contentType: "application/json",
            dataType: 'json',
            success: function(result){
                console.log(result);
            }
        })

});