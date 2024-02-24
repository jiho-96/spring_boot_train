package com.spring.springboot_study.board.controller;

import com.spring.springboot_study.board.dto.*;
import com.spring.springboot_study.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RestController
public class BoardController {
    private final BoardService boardService;

    // 게시판 목록 조회
    @PostMapping(value = "/list")
    public List<BoardDTO> BoardList(){
       return boardService.viewAllList();
    }

    // 게시판 제목 조회
    @PostMapping(value = "/searchTitle")
    public List<BoardSearchResponseDTO> BoardSearchList(@RequestBody BoardSearchRequestDTO boardSearchRequestDTO){
        return boardService.viewSearchList(boardSearchRequestDTO);
    }

    // 게시판 글 업데이터
    @PostMapping(value = "/update")
    public Integer BoardUpdate(@RequestBody BoardUpdateRequestDTO boardUpdateRequestDTO){
        return boardService.updateBoardList(boardUpdateRequestDTO);
    }
}
