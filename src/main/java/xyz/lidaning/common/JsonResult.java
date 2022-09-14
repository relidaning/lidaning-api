package xyz.lidaning.common;

import lombok.Data;

import java.io.Serializable;

@Data
public class JsonResult implements Serializable {

    int code;
    String msg;
    Object data;

    public JsonResult() {
    }

    public JsonResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public JsonResult(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        if (data!=null) {
            this.data = data;
        }

    }

    public static JsonResult success() {
        return success("操作成功");
    }

    public static JsonResult success(Object data) {
        return success("操作成功", data);
    }

    public static JsonResult success(String msg) {
        return success(msg, (Object)null);
    }

    public static JsonResult success(String msg, Object data) {
        return new JsonResult(200, msg, data);
    }

    public static JsonResult error() {
        return error("操作失败");
    }

    public static JsonResult error(String msg) {
        return error(msg, (Object)null);
    }

    public static JsonResult error(String msg, Object data) {
        return new JsonResult(500, msg, data);
    }

    public static JsonResult error(int code, String msg) {
        return new JsonResult(code, msg, (Object)null);
    }
}
