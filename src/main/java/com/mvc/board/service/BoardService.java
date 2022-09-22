package com.mvc.board.service;

import java.util.List;

import com.mvc.board.domain.BoardVO;

public interface BoardService {

	List<BoardVO> list() throws Exception;

}
