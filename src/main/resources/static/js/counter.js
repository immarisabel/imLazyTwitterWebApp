	(function($) {

          			$.fn.charCount = function(btnsub, options){

          				this.btnsub = btnsub;

          				// default configuration properties
          				var defaults = {
          					allowed: 280,
          					warning: 25,
          					css: 'counter',
          					counterElement: 'span',
          					cssWarning: 'warning',
          					cssExceeded: 'exceeded',
          					counterText: 'characters left: '
          				};

          				var options = $.extend(defaults, options);

          				function calculate(obj,btnsub){

          					btnsub.attr("disabled", "disabled");

          					var count = $(obj).val().length;
          					var available = options.allowed - count;
          					if(available <= options.warning && available >= 0){
          						$(obj).next().addClass(options.cssWarning);
          					} else {
          						$(obj).next().removeClass(options.cssWarning);
          					}
          					if(available < 0){
          						$(obj).next().addClass(options.cssExceeded);
          					} else {
          						$(obj).next().removeClass(options.cssExceeded);
          						btnsub.removeAttr("disabled");
          					}

          					$(obj).next().html(options.counterText + available);
          				};

          				this.each(function() {
          					$(this).after('<'+ options.counterElement +' class="' + options.css + '">'+ options.counterText +'</'+ options.counterElement +'>');

          					calculate(this, btnsub);

          					$(this).keyup(function(){calculate(this,btnsub)});
          					$(this).change(function(){calculate(this,btnsub)});
          				});

          			};

          		})(jQuery);

          		$(document).ready(function(){
          			$("#tweet").charCount($("#btnsub"));
          		});
