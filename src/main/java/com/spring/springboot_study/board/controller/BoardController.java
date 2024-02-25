package com.spring.springboot_study.board.controller;

import com.spring.springboot_study.board.dto.*;
import com.spring.springboot_study.board.service.BoardService;
import com.spring.springboot_study.common.codes.RespCode;
import com.spring.springboot_study.common.response.ApiResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
public class BoardController {
    private final BoardService boardService;

    // 게시판 목록 조회
/*    @PostMapping(value = "/list")
    public List<BoardDTO> BoardList(){
       return boardService.viewAllList();
    }*/

    // 게시판 목록 조회
    @PostMapping(value = "/list")
    public ApiResponse<List<BoardDTO>> boardList() throws Exception {
        try {
            List<BoardDTO> boardList = boardService.viewAllList();
            return new ApiResponse<>(RespCode.SUCCESS_OK, boardList);
        } catch (Exception e) {
            log.error("Error occurred while fetching board list", e);
            return new ApiResponse<>(RespCode.ERROR_FAIL, null);
        }
    }


    @PostMapping(value = "/detail")
    public ApiResponse<BoardDetailDTO> boardDetail(@RequestBody BoardDetailRequestDTO boardDetailRequestDTO) throws Exception {
        try {
            BoardDetailDTO boardDetail = boardService.detailView(boardDetailRequestDTO);
            return new ApiResponse<>(RespCode.SUCCESS_OK, boardDetail);
        } catch (Exception e) {
            log.error("Error occurred while fetching board list", e);
            return new ApiResponse<>(RespCode.ERROR_FAIL, null);
        }
    }


    // 게시판 제목 조회
    @PostMapping(value = "/searchTitle")
    public List<BoardSearchResponseDTO> boardSearchList(@RequestBody BoardSearchRequestDTO boardSearchRequestDTO){
        return boardService.viewSearchList(boardSearchRequestDTO);
    }

    // 게시판 글 업데이트
    @PostMapping(value = "/update")
    public Integer boardUpdate(@RequestBody BoardUpdateRequestDTO boardUpdateRequestDTO){
        return boardService.updateBoardList(boardUpdateRequestDTO);
    }

    // 게시판 글 작성
    @PostMapping(value = "/write")
    public Integer boardWrite(@RequestBody BoardWriteRequestDTO boardWriteRequestDTO){
        return boardService.writeBoard(boardWriteRequestDTO);
    }

    // 게시판 글 삭제 (물리적 삭제)
    @PostMapping(value = "/delete")
    public Integer boardDelete(@RequestBody BoardDeleteRequestDTO boardDeleteRequestDTO){
        return boardService.deleteBoard(boardDeleteRequestDTO);
    }

    // 게시판 글 삭제 (논리적 삭제)
    @PostMapping(value = "/delete2")
    public Integer boardDelete2(@RequestBody BoardLogicalDeleteRequestDTO boardLogicalDeleteRequestDTO){
        return boardService.deleteLogicalBoard(boardLogicalDeleteRequestDTO);
    }
}
