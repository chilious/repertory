/**
 * 网页初始化执行
 */
function init(){
    $('#phone').focus();
}
/**
 * 监听所有
 */
function listenAll(){
    //登录按钮点击事件
    $('#loginBtn').click(function(){
       login();
    });
    //回车键点击事件
    $(document).keyup(function(event){
        if(event.keyCode ==13){
            login();
        }
    });
}
/**
 * 检查表单
 */
function checkForm(){
    var phoneNo = $.trim($('#phone').val());
    var password = $('#pw').val();
    var errArr = [];
    var phoneReg = /^1[34578]\d{9}$/;
    if(!phoneReg.test(phoneNo)){
        errArr.push('手机号码格式错误！');
    }
    if(StringUtil.isNone(password)){
        errArr.push('密码不能为空！');
    }
    if(errArr.length > 0){
        var s = '';
        for(var i = 0 ; i < errArr.length ; i++){
            s += errArr[i];
            if( i != errArr.length - 1) s += '<br/>';
        }
        layer.msg(s);
        return false;
    }
    return true;
}
/**
 * 登陆
 */
function login(){
    if(checkForm()){
        var phoneNo = $.trim($('#phone').val());
        var password = $('#pw').val();
        var url = '/admin/login/check';
        var data = {phone:phoneNo,password:password};
        $.get(url,data,function(json){
            if(json.success){
                var nextUrl = $('#nextUrl').val();
                window.location.replace('/admin/main');
            }else{
                // layer.alert(ERROR[json.msg], {
                //     icon: 0,
                //     skin: 'layer-ext-moon'
                // });
                layer.msg(ERROR[json.msg]);
            }
        });
    }
}
/**
 * 开始***********************************
 */
$(function(){
    init();
    listenAll();
});