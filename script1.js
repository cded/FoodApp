$(document).ready(main);
function main(){

menuSlide();
counter();
learnMore();
orderNow();
$(".bottom").click(test);

}
function menuSlide(){
	$('.icon-menu').toggle(hideBot,showBot);
	$("body").click(pushBody);
}
function hideBot(){
	$('.menu').animate({left: "0px"}, 100);
    $('body').animate({left: "285px"}, 100);
}
function showBot(){
	$('.menu').animate({left: "-285px"}, 100);
    $('body').animate({left: "0px"}, 100);
}
function pushBody(){
	$('.menu').animate({left: "-285px"}, 100);
    $('body').animate({left: "0px"}, 100);
}
function test(){
	alert("Hello");
}

function counter(){
	var num;
	$("#countUp1").click(function(){
		num = parseInt($("#count1").text(),10) + 1;
    	$("#count1").text(num);
	});
	$('#countDown1').click(function(){
    num = parseInt($("#count1").text(),10) - 1;
    $("#count1").text(num);
  });
}
function learnMore(){
	$(".learnmore").toggle(learnShow,learnHide);
}
function learnShow(){
	$('.learnmore div').hide();
    $(this).children('div').show();
}
function learnHide(){
	$(this).children('div').hide();
}
function orderNow(){
	$('.bottom').click(function(){
      
  });
}