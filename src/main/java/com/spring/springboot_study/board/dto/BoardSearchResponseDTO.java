package com.spring.springboot_study.board.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class BoardSearchResponseDTO {
    private Integer idx;
    private String title;
    private Date createTime;
}

