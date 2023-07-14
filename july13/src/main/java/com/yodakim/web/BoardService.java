package com.yodakim.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//	business logic
@Service
public class BoardService {
	
//	DAO와 연결하기
	@Autowired
	private BoardDAO boardDAO;

	public List<BoardDTO> boardList() {

		return boardDAO.boardList();
	}
}
