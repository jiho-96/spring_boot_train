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

    // 게시판 글 업데이트
    @PostMapping(value = "/update")
    public Integer BoardUpdate(@RequestBody BoardUpdateRequestDTO boardUpdateRequestDTO){
        return boardService.updateBoardList(boardUpdateRequestDTO);
    }

    // 게시판 글 작성
    @PostMapping(value = "/write")
    public Integer BoardWrite(@RequestBody BoardWriteRequestDTO boardWriteRequestDTO){
        return boardService.writeBoard(boardWriteRequestDTO);
    }

    // 게시판 글 삭제 (물리적 삭제)
    @PostMapping(value = "/delete")
    public Integer BoardDelete(@RequestBody BoardDeleteRequestDTO boardDeleteRequestDTO){
        return boardService.deleteBoard(boardDeleteRequestDTO);
    }

    // 게시판 글 삭제 (논리적 삭제)
    @PostMapping(value = "/delete2")
    public Integer BoardDelete2(@RequestBody BoardLogicalDeleteRequestDTO boardLogicalDeleteRequestDTO){
        return boardService.deleteLogicalBoard(boardLogicalDeleteRequestDTO);
    }
}
