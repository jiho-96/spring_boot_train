package com.spring.springboot_study.board.service;
import com.spring.springboot_study.board.dto.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BoardService {
    public List<BoardDTO> viewAllList();

    List<BoardSearchResponseDTO> viewSearchList(BoardSearchRequestDTO boardSearchRequestDTO);

    Integer updateBoardList(BoardUpdateRequestDTO boardUpdateRequestDTO);
}
