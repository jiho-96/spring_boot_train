package com.spring.springboot_study.board.mapper;



import com.spring.springboot_study.board.dto.*;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface BoardMapper {
    List<BoardDTO> boardList();
    BoardDetailDTO boardDetail(BoardDetailRequestDTO boardDetailRequestDTO);
    List<BoardSearchResponseDTO> boardSearchList(BoardSearchRequestDTO boardSearchRequestDTO);
    Integer boardUpdate(BoardUpdateRequestDTO boardUpdateRequestDTO);
    Integer boardWrite(BoardWriteRequestDTO boardWriteRequestDTO);
    Integer boardDelete(BoardDeleteRequestDTO boardDeleteRequestDTO);
    Integer boardLogicalDelete(BoardLogicalDeleteRequestDTO boardLogicalDeleteRequestDTO);


}
