import com.demo.dao.UserDAO;
import com.demo.model.User;
import com.demo.service.UserService;
import org.junit.Test;
import org.junit.internal.runners.JUnit38ClassRunner;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;

/**
 * Created by huangsiqian on 2017/2/28 0028.
 */

public class TEst1 {

    private static UserService userService;

    static {
        String[] xmls=new String[]{"classpath:spring-mvc.xml","classpath:spring-mybatis.xml"};
        ApplicationContext context = new ClassPathXmlApplicationContext(xmls);
        BeanFactory factory = new ClassPathXmlApplicationContext(xmls);
        userService = (UserService) factory.getBean("userServiceImpl");
    }


    @Test
    public void test1() {

        System.out.println("11");
        User user = new User();
        user.setName("123");
        user.setPassword("456");
        userService.insertUser(user);

    }

}
