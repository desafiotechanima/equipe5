"use strict";var Modal=function(){var o={toggleButtons:$(".modalToggle"),closeButtons:$(".modal-content-header-close, #fechar-modal"),window:$(window),showModal:function(o){o=$(o.target).data("target");$(o).show()},closeModal:function(o){o=$(o.target).closest(".modalContainer");$(o).hide()},closeOnEscape:function(o){27==o.keyCode&&$(".modalContainer").hide()},refreshListeners:function(){o.toggleButtons.on("click",o.showModal),o.closeButtons.on("click",o.closeModal),o.window.on("keyup",o.closeOnEscape)}};return{refreshListeners:o.refreshListeners}};