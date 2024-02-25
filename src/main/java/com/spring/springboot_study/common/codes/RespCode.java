package com.spring.springboot_study.common.codes;

import lombok.Getter;


@Getter
public enum RespCode {
    SUCCESS_OK(0),
    SUCCESS_OK_LIST(10),
    ERROR_FAIL(-1),
    ERROR_FATAL(-1000),
    ERROR_FAIL_LIST(-10),
    ;

    private final int respCodeno;

    RespCode(final int respCodeno){
        this.respCodeno = respCodeno;
    }
}
