// JavaScript Document

$(function(){
	//左侧菜单展开出现三级标题
	$(".leftsidebar_box dt").css({"background-color":"#3992d0"});
	$(".leftsidebar_box dd").hide();

	$(".leftsidebar_box dt").click(function(){
		$(".leftsidebar_box dt").css({"background-color":"#3992d0"})
		$(this).css({"background-color": "#317eb4"});
		$("hr").hide("fast",function(){$(this).css("display","none")});
		$(this).parent().find('dd').removeClass("menu_chioce");
		$(".menu_chioce").slideUp(); 
		$(this).parent().find('dd').slideToggle();
		$(this).parent().find('hr').show();
		$(this).parent().find('dd').addClass("menu_chioce");
	});
	//左侧菜单收起和隐藏，扩展body部分
	$(".togglemenu_show").live("click",function(){
		$(".leftsidebar_box").hide();
		$(this).attr("class","togglemenu_hide");
		$(".myhome").css("margin-left","0");
		$(".tri").css("margin-left","6%");
		$(".index").css("margin-left","10%");
		$(".togglemenu_hide").css("left","0");
	})
	$(".togglemenu_hide").live("click",function(){
		$(".leftsidebar_box").show();
		$(this).attr("class","togglemenu_show");
		$(".myhome").css("margin-left","15%");
		$(".tri").css("margin-left","21%");
		$(".index").css("margin-left","25%");
		$(".togglemenu_show").css("left","15%");
	})

	$(".leftsidebar_box dt")[0].click();

	
})
