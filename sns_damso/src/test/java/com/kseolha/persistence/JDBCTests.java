package com.kseolha.persistence;

import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Connection;
import java.sql.DriverManager;

import static org.springframework.test.util.AssertionErrors.fail;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class JDBCTests {
    @Test
    public void testConnection(){
        try(Connection con = DriverManager.getConnection("jdbc:log4jdbc:mariadb://np.kseolha.com/damso","sample","1234")){
//            log.info(con);
        }catch (Exception e){
            fail(e.getMessage());
        }
    }
}
