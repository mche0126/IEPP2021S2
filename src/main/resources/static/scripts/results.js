<!--        get data from html-->

/*<![CDATA[*/

var response = [[${response}]];

/*]]>*/

delete response.calcium;
delete response.calories;
delete response.category;
delete response.chole_sterol;
delete response.dietaryFiber;
delete response.emissionsTotal;
delete response.waterUsed;
delete response.landUsed;
delete response.food;
delete response.id;
delete response.iron;
delete response.keyWords;
delete response.landUsed;
delete response.potassium;
delete response.protein;
delete response.saturatedFat;
delete response.sodium;
delete response.sugars;
delete response.totalCarbohydrate;
delete response.totalFat;
delete response.vitaminA;
delete response.vitaminC;
delete response.waterUsed;
delete response.emissionsFrom;


var values = Object.values(response),
    keys = Object.keys(response);
let data = [],
    maximum = 0;
for (let i = 0; i< 6; i++){
    if (values[i] > maximum) {maximum = values[i];}
    data[i] = {name : keys[i].split("emissions").pop(), score : values[i]}
}


// Set dimenssions and margins of the graph
var margin = {top: 20, right: 30, bottom: 40, left: 90},
    width = 800 - margin.left - margin.right,
    height = 400 - margin.top - margin.bottom;

// append the svg object to the body of the page
var svg = d3.select("#barChart")
    .append('svg')
    .attr('width', width - margin.left - margin.right)
    .attr('height', height - margin.top - margin.bottom)
    .attr("viewBox", [0, 0, width, height]);


// Set X
const x = d3.scaleBand()
    .domain(d3.range(data.length))
    .range([margin.left, width - margin.right])
    .padding(0.1)

// Set Y
const y = d3.scaleLinear()
    .domain([0, maximum])
    .range([height - margin.bottom, margin.top])

// set SVG
svg
    .append("g")
    .attr("fill", 'royalblue')
    .selectAll("rect")
    .data(data.sort((a, b) => d3.descending(a.score, b.score)))
    .join("rect")
    .attr("x", (d, i) => x(i))
    .attr("y", d => y(d.score))
    .attr('title', (d) => d.score)
    .attr("class", "rect")
    .attr("height", d => y(0) - y(d.score))
    .attr("width", x.bandwidth());

// add title
svg
    .append("text")
    .attr("x", width/2)
    .attr("y", 0 - (margin.top/2))
    .text("Emission Breakdown Bar Chart");

// x Axis
function xAxis(g) {
    g.attr("transform", `translate(0,${height - margin.bottom})`)
        .call(d3.axisBottom(x).tickFormat(i => data[i].name))
        .attr("font-size", '10px')
}

// y axis
function yAxis(g) {
    g.attr("transform", `translate(${margin.left}, 0)`)
        .call(d3.axisLeft(y).ticks(null, data.format))
        .attr("font-size", '10px')
}



svg.append("g").call(xAxis);
svg.append("g").call(yAxis);
svg.node();
