package com.site.service;

import java.util.List;

import com.site.dto.Member;

public interface MService {
    //전체
	List<Member> selectAll();
	// 로그인정보
	Member selectLogin(String id ,String pw);
	
	//상세
	Member selectOne(String id);
}
