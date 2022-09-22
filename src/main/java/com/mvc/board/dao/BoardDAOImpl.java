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

	// 게시물 목록
	@Override
	public List<BoardVO> list() throws Exception { 

		return sql.selectList(namespace + ".list");
	}

	//게시물 작성
	@Override
	public void write(BoardVO vo) throws Exception {
		
		sql.insert(namespace + ".write", vo);

	}


}