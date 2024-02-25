package com.spring.springboot_study.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/board")
public class BoardViewController {
    @GetMapping
    public String showBoardPage() {
        return "board/list";
    }

    @GetMapping("/detail/{idx}")
    public String detailPage(@PathVariable Integer idx) {
        return "board/detail";
    }
}
