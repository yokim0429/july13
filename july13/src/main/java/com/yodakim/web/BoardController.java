package com.yodakim.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

//	사용자가 /board를 호출하면 동작할 메소드를 만들기
	@GetMapping("/board")
	public String board() {
//		.JSP 파일명 board
		return "board";
	}
	
	
	
	
	
}

/**
 * CTRL + Shift + o: 안쓰는 임포트 정리 숏컷
 * 
 **/