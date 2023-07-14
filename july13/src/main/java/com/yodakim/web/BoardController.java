package com.yodakim.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {
	
//	서비스와 연결하기
	@Autowired
	private BoardService boardService;

//	사용자가 /board를 호출하면 동작할 메소드를 만들기
	@GetMapping("/board")
	public ModelAndView board() {
//								.JSP 파일명 board
		ModelAndView mv = new ModelAndView("board");
//		서비스를 작동하기
		List<BoardDTO> list = boardService.boardList();
		mv.addObject("list", list);
		
		return mv;
	}
	
	@GetMapping("/board2")
	public String board2 (Model model) {
		model.addAttribute("name", "야놀자");
		
		List<BoardDTO> list = new ArrayList<BoardDTO>();
		for (int i = 1; i < 11; i++) {
			BoardDTO dto = new BoardDTO(i, "Title", "티웨이", "2023-07-24", i);
			list.add(dto);
		}
		
		model.addAttribute("list", list);
		
		return "board2";
	}

}

/**
 * CTRL + Shift + o: 안쓰는 임포트 정리 숏컷
 * 
 **/