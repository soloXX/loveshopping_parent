package org.pengxx.loveshopping.util;

public class AjaxResult {
    private boolean success = true;
    private String massage = "成功";
    //返回到前台对象
    private Object resultObj;

    public boolean isSuccess() {
        return success;
    }

    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMassage() {
        return massage;
    }

    public AjaxResult setMessage(String message) {
        this.massage = message;
        return this;
    }

    public Object getResultObj() {
        return resultObj;
    }

    public AjaxResult setResultObj(Object resultObj) {
        this.resultObj = resultObj;
        return this;
    }
    //成功
    public static AjaxResult me(){
        return new AjaxResult();
    }
}
