package com.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.dto.Member;
//<객체리턴타입, 리턴객체타입의 pk 변수타입>
public interface MemberRepository extends JpaRepository<Member, String>{

	Member findByIdAndPw(String id, String pw);


	//findAll(), findById() , save delete update 
	//pageable : 자동하단 넘버링 페이지처리 , Sort 정렬도가능  
}