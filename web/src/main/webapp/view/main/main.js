/**
 * 监听所有
 */
function listenAll(){
    /**
     * menu鼠标悬停事件
     */
    $('.nav').mouseover(function(){
        $(this).find('a').eq(0).css('color','#019ccf');
        var newHeight = ($(this).find('a').length - 1) * 35 + 80;
        $(this).height(newHeight);
    });
    /**
     * menu鼠标移出事件
     */
    $('.nav').mouseout(function(){
        $(this).find('a').eq(0).css('color','#C9C9C9');
        $(this).height(80);
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
        $(this).css('color','#C9C9C9');
    });
}
/**
 * 初始化**********************************************
 */
function init(){
    var defaultLink = $('.nav').eq(0).find('a').eq(0);
    $('#bodyIframe').attr('src',defaultLink.attr('href'));
}
/**
 * 跳转到更新密码页面
 */
function update_password(){
    //iframe层
    layer.open({
        type: 2,
        title: '修改密码',
        shadeClose: true,
        shade: 0.5,
        area: ['380px', '220px'],
        content: '/admin/password'
    });
}
/**
 * 开始*****************************************
 */
$(function(){
    listenAll();
    init();
});