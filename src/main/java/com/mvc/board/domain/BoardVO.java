package com.mvc.board.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
 * CREATE TABLE board 
(
  BNO INT 
, TITLE VARCHAR2(50) not null
, CONTENT VARCHAR2(3000) not null
, WRITER VARCHAR2(50) not null
);
 */
@Getter
@Setter
@ToString
public class BoardVO {

	private int bno;
	private String title;
	private String content;
	private String writer;
	
}
