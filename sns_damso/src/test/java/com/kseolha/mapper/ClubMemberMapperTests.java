package com.kseolha.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kseolha.domain.ClubMemberVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ClubMemberMapperTests {
	
	@Autowired
	private ClubMemberMapper clubMemberMapper;
	
	@Test
	public void testInsert() {
		ClubMemberVO vo = new ClubMemberVO();
		clubMemberMapper.insert("test4", 1L, "");
	}
	
	@Test
	public void testGet() {
		clubMemberMapper.read("test3", 1L);
	}
	
	
	@Test
	public void testGetList() {
		clubMemberMapper.getList();
	}
	
	@Test
	public void testGetClubList(){
		clubMemberMapper.getClubList(1L);
	}

	@Test
	public void testGetMemberList(){
		clubMemberMapper.getMemberList("test3");
	}
	
	
	@Test
	public void testDelete() {
		log.info(clubMemberMapper.delete("test3", 2L));
	}
	
	
}
