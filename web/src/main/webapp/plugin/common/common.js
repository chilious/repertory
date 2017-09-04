/**
 * 设置未来(全局)的AJAX请求默认选项
 * 解决AJAX请求遇到Session过期的问题
 */
$.ajaxSetup({
    complete: function(xhr,status) {
        var sessionStatus = xhr.getResponseHeader('sessionStatus');
        if(sessionStatus == 'timeout') {
            window.top.location.replace('admin/login');
        }
    }
});
/**
 * 阻止网页元素被选中
 * @returns {boolean}
 */
document.body.onselectstart = function(){
    return false;
};
/**
 * 屏蔽鼠标右键
 */
document.oncontextmenu = function(){
    return false;
}

/**
 * 字符串工具类
 * @type {{isNone: StringUtil.isNone}}
 */
var StringUtil = {
    isNone : function(s){
        if(s == null || (typeof s == 'undefined') || s == '') return true;
        return false;
    }
}