import com.demo.dao.LogDAO;
import com.demo.model.Log;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * Created by huangsiqian on 2017/2/28 0028.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mvc.xml","classpath:spring-mybatis.xml"})
public class LogDAOTest {
    @Resource
    LogDAO logDAO;

//    static {
//        String[] xmls=new String[]{"classpath:spring-mvc.xml","classpath:spring-mybatis.xml"};
//        ApplicationContext context = new ClassPathXmlApplicationContext(xmls);
//        BeanFactory factory = new ClassPathXmlApplicationContext(xmls);
//        logDAO = (LogDAO) factory.getBean("logDAO");
//    }

    @Test
    public void insertLogATest() {
        Log log = new Log();
        log.setAccountA("mason11");
        log.setAccountB("owei12");
        log.setMoneyChange(BigDecimal.valueOf(1000));
        logDAO.insertLogA(log);
    }

    @Test
    public void getLogATest() {
        System.out.println(logDAO.getLogA(1));
    }

    @Test
    public void deleteLogATest() {
        logDAO.deleteLogAWithId(1);
    }




}
