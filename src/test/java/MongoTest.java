import com.demo.mongo.MongoDBDao;
import com.mongodb.DB;
import com.mongodb.DBCallback;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by huangsiqian on 2017/3/6 0006.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mvc.xml","classpath:spring-mybatis.xml"})
public class MongoTest {

    @Resource
    MongoDBDao mongoDBDao;


    @Test
    public void mongoDAOTest() {
        System.out.println("+++++++++++++++++++++++++++++++++"+mongoDBDao);

        DB db = mongoDBDao.getDb("mason");
        System.out.println(db);

    }

    @Test
    public void getCollectionTest() {
        DBCollection dbCollection = mongoDBDao.getCollection("mason", "mason");
        System.out.println(dbCollection);

        List<DBObject> dbObjectList = dbCollection.getHintFields();
        System.out.println(dbObjectList);
    }

    @Test
    public void mongoFindTest() {
//        List<DBObject> objectList = mongoDBDao.find("mason", "mason", new String[]{"name","age"},new String[]{"mason","18"},-1 );
        List<DBObject> objectList = mongoDBDao.find("mason", "mason", new String[]{"name","age"},new Object[]{"mason",18},-1 );
        System.out.println(objectList);
        System.out.println(objectList.size());
    }


    @Test
    public void mongoInsertTest() {
//        mongoDBDao.inSert("");
    }







}
