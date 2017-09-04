/**
 * 监听所有************************************
 */
function listenAll(){
    $('p').mouseover(function() {
        $(this).css('background-color', '#DDDDDD');
        $(this).find('input').css('background-color', '#DDDDDD');
    });
    $('p').mouseout(function() {
        $(this).css('background-color','white');
        $(this).find('input').css('background-color','white');
    });
    $('#submit').click(function(){
        update();
    });
    //回车键点击事件
    $(document).keyup(function(event){
        if(event.keyCode ==13){
            update();
        }
    });
}
/**
 * 检查表单
 */
function checkForm(){
    var errArr = [];
    var oldPassword = $('#old_password').val();
    var newPassword = $('#new_password').val();
    var renewPassword = $('#renew_password').val();
    if(StringUtil.isNone(oldPassword)){
        errArr.push(ERROR.old_password_none);
    }
    if(StringUtil.isNone(newPassword)){
        errArr.push(ERROR.new_password_none);
    }
    if(newPassword != renewPassword){
        errArr.push(ERROR.renew_password_diffrent);
    }
    var msg = '';
    for(var i=0 ; i<errArr.length ; i++){
        msg += errArr[i];
        if(i != errArr.length - 1){
            msg += '<br/>';
        }
    }
    if(msg != ''){
        layer.msg(msg);
        return false;
    }
    return true;
}
/**
 * 初始化**************************************
 */
function init(){
    $('input:first').focus();
}
/**
 * 更新密码
 */
function update(){
    if(!checkForm()) return;
    var oldPassword = $('#old_password').val();
    var newPassword = $('#new_password').val();
    var renewPassword = $('#renew_password').val();
    $.ajax({
        url: '/admin/password',
        type: 'PUT',
        data:{
            oldPassword : oldPassword,
            newPassword : newPassword,
            renewPassword : renewPassword
        },
        success: function(json) {
            if(json.success){
                layer.msg('修改成功！', {icon: 1},function(){
                    window.top.location.replace("/admin/login");
                });
            }else{
                layer.msg(ERROR[json.msg]);
            }
        }
    });
}
/**
 * 开始****************************************
 */
$(function(){
    init();
    listenAll();
});