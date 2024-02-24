package com.spring.springboot_study.board.dto;

import lombok.*;

import java.util.Date;

@Getter @Setter @ToString

public class BoardDTO {
    private Integer idx;
    private String title;
    private Date createTime;
}
