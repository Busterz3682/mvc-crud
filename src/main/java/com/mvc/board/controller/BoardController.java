package com.mvc.board.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvc.board.domain.BoardVO;
import com.mvc.board.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	@Inject
	private BoardService service;

	//게시물 리스트페이지
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void getList(Model model) throws Exception {

		List<BoardVO> list = null;
		list = service.list();
		model.addAttribute("list", list);
	}
	
	//게시물 작성페이지
	@GetMapping("write")
	public String getWrite() {
		return "/board/write";
	}
	
	//게시물 작성
	@PostMapping
	public String write(BoardVO vo) throws Exception {
		service.write(vo);
		return "redirect:/board/list";
	}
	
	//게시물 조회
	@GetMapping
	public String getView(@RequestParam("bno") int bno, Model model) throws Exception {
		BoardVO vo = service.view(bno);
		model.addAttribute("view", vo);
		return "/board/view";
	}
	
	//게시물 수정페이지
	@GetMapping("modify")
	public String getModify(@RequestParam("bno") int bno, Model model) throws Exception {
		BoardVO vo = service.view(bno);
		model.addAttribute("view",vo);
		return "/board/modify";
	}
	
	//게시물 수정
		@PostMapping("modify")
		public String modify(BoardVO vo) throws Exception {
			service.modify(vo);
			return "redirect:/board/list";
		}
	
}
