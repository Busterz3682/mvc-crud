package com.mvc.board.service;

import java.util.List;

import com.mvc.board.domain.BoardVO;

public interface BoardService {

	//�Խù� ���
	public List<BoardVO> list() throws Exception;
	
	//�Խù� �ۼ�
	public void write(BoardVO vo) throws Exception;

}
