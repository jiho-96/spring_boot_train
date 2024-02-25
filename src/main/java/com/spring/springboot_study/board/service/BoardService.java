package com.spring.springboot_study.board.service;
import com.spring.springboot_study.board.dto.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BoardService {
    List<BoardDTO> viewAllList();

    BoardDetailDTO detailView(BoardDetailRequestDTO boardDetailRequestDTO);

    List<BoardSearchResponseDTO> viewSearchList(BoardSearchRequestDTO boardSearchRequestDTO);

    Integer updateBoardList(BoardUpdateRequestDTO boardUpdateRequestDTO);

    Integer writeBoard(BoardWriteRequestDTO boardWriteRequestDTO);

    Integer deleteBoard(BoardDeleteRequestDTO boardDeleteRequestDTO);

    Integer deleteLogicalBoard(BoardLogicalDeleteRequestDTO boardLogicalDeleteRequestDTO);

}
