package com.site.service;

import com.site.dto.Member;

public interface MemberService {
    //로그인확인
	Member findByIdAndPw(String id, String pw);
     // id확인 
	Member findById(String id);
	//임의
	Member findLogin(String id, String pw);

}
