package com.site.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.site.dto.Board;

@Mapper
public interface BoardMapper {
   //전체리스트
	List<Board> findAll();
    //뷰 1개 
	Board findByBno();
	
	//write 저장 
	void save(Board b);
	
	//삭제
	void delete(int bno);

}
