package com.example.erpserver.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

@Data
public class ErpResult<T> implements Serializable {

    private String requestId = UUID.randomUUID().toString();
    private Integer code = 20000;
    private Boolean success = true;
    private String message = "";
    private T data;


    public ErpResult() {
    }
    public ErpResult(T t) {
        setData(t);
    }

    public ErpResult(Integer err){
        setCode(err);
        setSuccess(false);
    }
    /**
     * @return PaasResult<T> 里面未做任何初始化
     */
    public static <T> ErpResult<T> create() {
        return new ErpResult<T>();
    }

    /**
     * 携带data的create，既然有data就是成功
     * @param data result data
     * @return Result<T>
     */
    public static <T> ErpResult<T> create(T data) {
        ErpResult<T> result = ErpResult.create();
        result.setSuccess(true);
        result.setData(data);
        result.setCode(20000);
        return result;
    }

    /**
     * 没有data就是fail
     *
     * @param code result code
     * @param message result msg
     * @return Result<T>
     */
    public static <T> ErpResult<T> create(int code, String message) {
        ErpResult<T> result = ErpResult.create();
        result.setSuccess(false);
        result.setCode(code);
        result.setMessage(message);
        return result;
    }
    /**
     * 有data证明成功，但接口调用成功时也需要code和message的场景
     *
     * @param data result data
     * @param code result code
     * @param message result msg
     * @return Result<T>
     */
    public static <T> ErpResult<T> create(T data, int code, String message) {
        ErpResult<T> result = ErpResult.create();
        result.setSuccess(true);
        result.setData(data);
        result.setCode(code);
        result.setMessage(message);
        return result;
    }

    /**
     * 大多数失败的场景
     * @param code  result code
     * @param message result msg
     * @return Result<T>
     */
    public static <T> ErpResult<T> fail(int code, String message) {
        ErpResult<T> result = ErpResult.create();
        result.setRequestId(UUID.randomUUID().toString());
        result.setSuccess(false);
        result.setCode(code);
        return result;
    }

    /**
     * 大多数成功情况下使用
     * @param data result data
     * @return Result<T>
     */
    public static <T> ErpResult<T> success(T data) {
        ErpResult<T> result = ErpResult.create();
        result.setRequestId(UUID.randomUUID().toString());
        result.setSuccess(true);
        result.setCode(20000);
        result.setMessage("Successful");
        result.setData(data);
        return result;
    }

}
