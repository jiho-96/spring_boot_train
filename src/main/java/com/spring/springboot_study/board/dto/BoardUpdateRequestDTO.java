package com.spring.springboot_study.board.dto;

import lombok.Data;

import java.util.Date;

@Data
public class BoardUpdateRequestDTO {
    private Integer idx;
    private String title;
    private String contents;
    private Date updateDate;
}
