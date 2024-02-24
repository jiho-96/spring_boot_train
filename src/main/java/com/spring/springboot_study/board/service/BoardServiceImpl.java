package com.spring.springboot_study.board.service;

import com.spring.springboot_study.board.dto.*;
import com.spring.springboot_study.board.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{

    private final BoardMapper boardMapper;

    @Override
    public List<BoardDTO> viewAllList() {
        return boardMapper.boardList();
    }

    @Override
    public List<BoardSearchResponseDTO> viewSearchList(BoardSearchRequestDTO boardSearchRequestDTO) {
        return boardMapper.boardSearchList(boardSearchRequestDTO);
    }

    @Override
    public Integer updateBoardList(BoardUpdateRequestDTO boardUpdateRequestDTO) {
        return boardMapper.boardUpdate(boardUpdateRequestDTO);
    }
}
