$('#toggle-sidebar').on('click', function(e) {
    $('.sidebar-container').toggleClass("open");
    e.preventDefault();
})