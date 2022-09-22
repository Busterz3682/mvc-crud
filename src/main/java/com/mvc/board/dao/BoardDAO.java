package com.mvc.board.dao;

import java.util.List;

import com.mvc.board.domain.BoardVO;

public interface BoardDAO {
 
 public List<BoardVO> list() throws Exception; 

}