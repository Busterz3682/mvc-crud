package com.mvc.board.dao;

import java.util.List;

import com.mvc.board.domain.BoardVO;

public interface BoardDAO {

	//�Խù� ���
	public List<BoardVO> list() throws Exception; 

	//�Խù� �ۼ�
	public void write(BoardVO vo) throws Exception;

}