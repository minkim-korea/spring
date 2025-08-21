package com.site.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.site.dto.Member;

@Mapper
public interface MemberMapper {
    //전체
	List<Member> selectAll();
    //로그인
	Member selectLogin(String id, String pw);
	//상세
	Member selectOne(String id);

}
