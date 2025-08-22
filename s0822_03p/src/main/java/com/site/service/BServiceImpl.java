package com.site.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.site.dao.BoardMapper;
import com.site.dto.Board;

@Service
public class BServiceImpl implements BService {
    
	@Autowired BoardMapper boardMapper;
	@Override//전체
	public List<Board> findAll() {
		List<Board> list =boardMapper.findAll();
		return list;
	}
	@Override//뷰 1개 
	public Board findByBno(int bno) {
		Board board = boardMapper.findByBno();
		return null;
	}
	@Override//write저장 
	public void save(Board b) {
		boardMapper.save(b);
	}
	@Override //삭제
	public void delete(int bno) {
	    boardMapper.delete(bno);
		
	}

}
