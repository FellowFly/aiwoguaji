package com.springMvc.myBatis.PoVo;

/**
 * Created with IntelliJ IDEA.
 * User: xiaoxi
 * Date: 15-4-20
 * Time: 下午4:37
 * To change this template use File | Settings | File Templates.
 */
public class JsonResult {

    private boolean success;
    private String  info;
    private Object  data;

    public JsonResult(){
        this(true, null, null);
    }

    public JsonResult(boolean success){
        this(success, null, null);
    }

    public JsonResult(boolean success, String info){
        this(success, info, null);
    }

    public JsonResult(boolean success, String info, Object data){
        this.success = success;
        this.info = info;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
