/**
 * 监听所有
 */
function listenAll(){
    /**
     * menu鼠标悬停事件
     */
    $('.nav').mouseover(function(){
        $(this).find('a').eq(0).css('color','#019ccf');
    });
    /**
     * menu鼠标移出事件
     */
    $('.nav').mouseout(function(){
        $(this).find('a').eq(0).css('color','#979797');
    });
    /**
     * submenu鼠标悬停事件
     */
    $('.nav a').mouseover(function(){
        $(this).css('color','#019ccf');
    });
    /**
     * submenu鼠标移出事件
     */
    $('.nav a').mouseout(function(){
        $(this).css('color','#979797');
    });
}
/**
 * 开始*****************************************
 */
$(function(){
    listenAll();
});