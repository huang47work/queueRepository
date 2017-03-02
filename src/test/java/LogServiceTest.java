import com.demo.model.Log;
import com.demo.service.LogService;
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
public class LogServiceTest {

    @Resource
    LogService logService;

//    static {
//        String[] xmls=new String[]{"spring-mvc.xml","classpath:spring-mybatis.xml"};
//        ApplicationContext context = new ClassPathXmlApplicationContext(xmls);
//        BeanFactory factory = new ClassPathXmlApplicationContext(xmls);
//        logService = (LogService) context.getBean("logServiceImpl");
//    }
    @Test
    public void testLogAInsert() {
        Log log = new Log();
        log.setAccountA("haha");
        log.setAccountB("hehe");
        log.setMoneyChange(BigDecimal.valueOf(10000));
        logService.insertLogA(log);

    }


}
