package com.site.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.site.dto.Board;
import com.site.service.BService;

@Controller
public class BController {

    @Autowired BService bService;

    
	@GetMapping("/bList")
   public String bList(Model model) {
	   //리스트보내기 
		List<Board> list = bService.findAll(); 
		model.addAttribute("list",list);
	   return "bList";
   }
	
	@GetMapping("/bView")
	public String bView(Board b ,Model model) {
		//1개만 가져
		int bno= b.getBno();
		Board board = bService.findByBno(bno);
		model.addAttribute("board", board);
		return "bView";
	}
	//2개만들어야됨 get -글쓰기 post -글쓰기저장 
	@GetMapping("/bWrite")//글쓰기  
	public String bWrite() {
		return "bWrite";
	}
	@PostMapping("/bWrite") //게시글 글쓰기저장
	public String bWrite(Board b, Model model) {
		// 게시글저장
		bService.save(b);
		return "redirect:/bList?flag=1";
	}
	
	@GetMapping("/bDelete")//게시글삭제
	public String bDelete(@RequestParam(name="bno",defaultValue="0") int bno ) {
		bService.delete(bno);
		return "redirect:/bList?flag=2"; //flag:2 삭제
	}
	
	
}
