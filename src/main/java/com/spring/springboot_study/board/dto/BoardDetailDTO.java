package com.spring.springboot_study.board.dto;

import lombok.Data;

@Data
public class BoardDetailDTO {
    private Integer idx;
    private String title;
    private String contents;
}
