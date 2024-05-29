package com.haiyang.campusrunner.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Result<T> {
    private Integer code;
    private String msg;
    private T data;
    /**
     * 创建成功结果
     *
     * @param data 结果数据
     * @return 成功结果
     */
    public static <E> Result<E> success(E data){
        return new Result<>(200,"success",data);
    }
    /**
     * 创建错误结果
     * @param data 结果信息
     * @return 错误结果
     */
    public static <E> Result<E> error(E data){
        return new Result<>(500,"failed",data);
    }
}
