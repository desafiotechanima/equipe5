"use strict";var Aria={expandingButton:function(a){var t="true"===a.attr("aria-expanded");a.attr("aria-expanded",!t),a=a.attr("aria-controls"),$("#"+a).attr("aria-hidden",t)}};