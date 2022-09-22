package com.mvc.board.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mvc.board.domain.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Inject
	private SqlSession sql;

	private static String namespace = "com.mvc.board.mappers.board";

	// �Խù� ���
	@Override
	public List<BoardVO> list() throws Exception { 

		return sql.selectList(namespace + ".list");
	}

	//�Խù� �ۼ�
	@Override
	public void write(BoardVO vo) throws Exception {
		
		sql.insert(namespace + ".write", vo);

	}


}