package com.kseolha.mapper;

import com.kseolha.domain.BoardVO;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
    @Autowired
    private BoardMapper boardMapper;
    @Autowired
    private NotificationMapper notificationMapper;
    @Autowired
    private AttachMapper attachMapper;

    @Test
    public void testGetList() {
        log.info(boardMapper.getList(Long.MAX_VALUE, null, "nhue630@gmail.com", null));
//        boardMapper.getList(1, 600L).forEach(log::info);
//        boardMapper.getList(2).forEach(log::info);
    }

    @Test
    public void testGet() {
//        boardMapper.read(665L, 'nhue630@gmail.com');
    }

    @Test
    public void testInsert() {
        BoardVO vo = new BoardVO();
        vo.setContent("테스트");
        vo.setWriter("ksha08@naver.com");
        boardMapper.insert(vo);
        log.info(vo);
    }

    @Test
    public void testDelete() {
        log.info(boardMapper.delete(2L));
    }

    @Test
    public void testUpdate() {
        BoardVO vo = new BoardVO();
        vo.setBno(3L);
        vo.setTitle("title update");
        vo.setContent("content update");
        vo.setWriter("ksha08@naver.com");
        log.info(boardMapper.update(vo));
//        log.info(boardMapper.read(3L));
    }

    @Test
    public void testInsertLike() {
        boardMapper.insertLike(644L, "ksha08@naver.com");
    }

    @Test
    public void testDeleteLike() {
        boardMapper.deleteLike(666L, "ksha08@naver.com");
    }

//    @Test
//    public void testGetLike() {
//        boardMapper.getLike("ksha08@naver.com");
//    }

    @Test
    public void testGetAllList() {
        boardMapper.getAllList(null, "nhue630@gmail.com");
    }

    @Test
    public void testGetUncheck() {
        notificationMapper.uncheckedList("nhue630@gmail.com");
    }

    @Test
    public void testAttachDelete() {
        attachMapper.deleteBAByEmail("ksha08@naver.com");
    }
}
