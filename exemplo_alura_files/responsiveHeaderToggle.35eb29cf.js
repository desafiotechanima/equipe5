"use strict";function dropdownMenu(e){e.stopPropagation(),e.preventDefault();var t=$(this).closest(".content-menu-section").find(".header-nav");$(".header-nav--active").not(t).removeClass("header-nav--active"),t.toggleClass("header-nav--active");var n=t.attr("aria-hidden"),e=t.find(".header-nav-link");e.attr("tabindex",0),t.attr("aria-hidden","false"===n),$(this).attr("aria-expanded","true"===n),"true"===n&&t.focus(),"false"===n&&e.attr("tabindex",-1)}function toggleMobileHeaderSection(e){$(e).toggleClass("button-mobile--expanded"),$(e).closest(".content-menu-section").find(".header-nav").slideToggle()}$(".menu-button-mobile").on("click",function(e){var t=$(".button-mobile--expanded").get(0);t!==this&&void 0!==t&&toggleMobileHeaderSection(t),toggleMobileHeaderSection(this)}),$(".menu-button-desktop").on("click",function(e){dropdownMenu.call(this,e)}),$(".menu-button-desktop").on("keypress",function(e){"Enter"===e.key&&dropdownMenu.call(this,e)}),$(".header-nav").on("click",function(e){e.stopPropagation()}),$("html").click(function(){$(".header-nav--active").removeClass("header-nav--active")});