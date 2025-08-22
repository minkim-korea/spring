package com.site.service;

import java.util.List;

import com.site.dto.Board;

public interface BService {
    //전체
	List<Board> findAll();
    //view 1개 
	Board findByBno(int bno);
	//write저장
	void save(Board b);
	//삭제
	void delete(int bno);

}
