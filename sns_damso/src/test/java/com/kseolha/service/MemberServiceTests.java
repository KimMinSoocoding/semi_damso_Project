package com.kseolha.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kseolha.domain.MemberVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class MemberServiceTests {
	/*
	 * 04.05
	 * 회원가입, 로그인 테스트
	 */
	
    @Autowired
    private MemberService memberService;
    
    @Test
    public void testSelectOne() throws Exception {
    	MemberVO vo = new MemberVO();
    	vo.setEmail("test1");
    	vo.setPw("1234");
    	log.info(memberService.login(vo));
    }
    
    @Test
    public void testInsert() throws Exception {
    	MemberVO vo = new MemberVO();
    	vo.setEmail("memberTest");
    	vo.setId("memberId");
    	vo.setPw("memberPw");
    	vo.setName("memberName");
    	vo.setIntro("memberIntro");
    	vo.setTel("memberTel");
    	vo.setAddr("memberAddr");
    	memberService.register(vo);
    }
    
    @Test
    public void testIdCheck() throws Exception{
        String email ="test1";
        String email2= "test100";
        memberService.idCheck(email);
        memberService.idCheck(email2);
    }
    
    @Test
    public void testFindId() throws Exception {
    	MemberVO vo = new MemberVO();
    	vo.setId("id1");
    	vo.setName("김민수");
    	log.info(memberService.selectId(vo));
    }
    
    @Test
 	public void testUpdate() {
 		MemberVO vo = memberService.get("kimfglk321@gmail.com");
 		vo.setPw("12341234");
 		
 		log.info(vo);
 		memberService.modifyPw(vo);
 	}
    
}
