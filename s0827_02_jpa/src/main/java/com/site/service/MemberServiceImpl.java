package com.site.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.site.dto.Member;
import com.site.repository.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService {
	
   @Autowired MemberRepository memberRepository;
   
	@Override//로그인확인
	public Member findByIdAndPw(String id, String pw) {
		Member member = memberRepository.findByIdAndPw(id,pw).orElseGet(()->{ return new Member(); }
				);
		return member;
	}
	// findAll()-예외처리가 없음 리턴타입:List, findById()-예외처리
	
	// get() : 데이터를 검색하지 못했을 시, 에러발생
	// orElseGet() : 빈객체 리턴
	// orElseThrow() : 예외처리를 진행해서 예외코드 리턴
	
	@Override//id 확인  얘는 빨간줄이 길게생김 뒤에 3중에하나넣어주면사라짐 
	public Member findById(String id) {
      Member member = memberRepository.findById(id).orElseGet( 
    		  ()->{return new Member();}
    		  );
//	 Member member = memberRepository.findById(id).orElseThrow(
//		    ()->{ return new IllegalArgumentException();  }
//           );
		return member;
		
	}
  
	@Override  //임의로 
	public Member findLogin(String id, String pw) {
		Member member = memberRepository.findLogin(id,pw).get();
		return member;
	}

	@Override //회원전체리스트 
	public List<Member> findAll() {
		List<Member> list =memberRepository.findAll(
				Sort.by(Sort.Order.desc("gender"),Sort.Order.asc("name")));
		return list;
	}

	@Override //회원정보저장 
	public void save(Member m) {
     memberRepository.save(m);		
	}

	@Override //회원정보삭제 
	public void delete(String id) {
     Member member = memberRepository.findById(id).get();
     memberRepository.delete(member);
	}

	
}
