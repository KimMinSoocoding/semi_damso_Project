package com.kseolha.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kseolha.domain.ClubVO;
import com.kseolha.domain.MemberVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ClubMapperTests {
	
	@Autowired
	private ClubMapper clubMapper;
	
	@Test
	public void testGetMyClubList() {
		clubMapper.getMyClubList("test8");
	}
	
	
/*	@Test
	public void testInsert() {
		ClubVO vo = new ClubVO();
		vo.setCname("��� ����");
		vo.setIntro("å �׸��� ��ȭ");
		vo.setCleader("test2");
		vo.setTown("���α�");
		vo.setStatus(true);
		clubMapper.insert(vo);
		log.info(vo);
	}*/

	@Test
	public void testGetList() {
		clubMapper.getList().forEach(log::info);
	}
	
	
/*	@Test
	public void testUpdate() {
		ClubVO vo = clubMapper.read(1L);
		vo.setIntro("���� ���� �����ؿ�^^");
		clubMapper.update(vo);
		log.info(vo);
	}*/
	
	@Test
	public void testGet() {
		clubMapper.read(116L);
	}

/*	@Test
	public void testDelete() {
		log.info(clubMapper.delete(4L));
	}*/
	
	
	
	
	
}
