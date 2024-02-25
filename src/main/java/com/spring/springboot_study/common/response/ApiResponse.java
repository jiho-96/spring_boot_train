package com.spring.springboot_study.common.response;

import com.spring.springboot_study.common.codes.RespCode;
import lombok.Getter;

@Getter
public class ApiResponse<T> {

    // API 응답 결과
    private T data;

    // API 응답 코드
    private int code;

    public ApiResponse(final RespCode respCode, T result){
        this.data = result;
        this.code = respCode.getRespCodeno();
    }
}
