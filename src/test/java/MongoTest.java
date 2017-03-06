import com.demo.mongo.MongoDBDao;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import org.bson.BSONObject;
import org.bson.BasicBSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.*;

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
        mongoDBDao.inSert("mason", "mason", new String[]{"test","count"}, new Object[]{"first_insert",1});
    }

    @Test
    public void mongoFindAllTest() {
        List<DBObject> objectList =  mongoDBDao.find("mason", "mason", new String[]{"name"}, new Object[]{"mason"},-1);
        System.out.println(objectList);
        System.out.println(objectList.size());
    }

    @Test
    public void mongoFindOneTest() {
        List<DBObject> objectList =  mongoDBDao.find("mason", "mason", new String[]{"name"}, new Object[]{"mason"},1);
        System.out.println(objectList);
        System.out.println(objectList.size());
    }

    @Test
    public void mongoDeleteTest() {
        mongoDBDao.delete("mason", "mason", new String[]{"test"}, new Object[]{"first_insert"});
    }


    @Test
    public void mongoExistTest() {
        System.out.println(mongoDBDao.isExist("mason",
                "mason","test","first_insert"));
    }


    @Test
    public void mongoUpdateTest() {

        //就转个map玩
        /*ArrayList<DBObject> dbObjectArrayList = mongoDBDao.find("mason","mason",
                new String[]{"name"},new Object[]{"mason"},-1);
        System.out.println(dbObjectArrayList);
        Map<String, Object> map = new HashMap<>();
//        DBObject object = dbObjectArrayList.get(0);
        for (DBObject object1 : dbObjectArrayList) {
            Set<String> keySet = object1.keySet();
            for (String key : keySet) {
//            map = (Map<String, Object>) object.get(key);
                map.put(key, object1.get(key));
            }

        }
        System.out.println(map);*/

        ArrayList<DBObject> dbObjectArrayList = mongoDBDao.find("mason", "mason", new String[]{"name"}, new Object[]{"mason"}, -1);
        System.out.println(dbObjectArrayList);

        DBObject dbObject = dbObjectArrayList.get(0);
        DBObject newValue = new BasicDBObject();


        newValue.putAll(dbObject);
        newValue.put("age", 110);
        System.out.println(dbObject.get("age"));

        mongoDBDao.update("mason", "mason", dbObject, newValue);
        ArrayList<DBObject> dbObjectArrayListNew = mongoDBDao.find("mason", "mason", new String[]{"name"}, new Object[]{"mason"}, -1);
        System.out.println(dbObjectArrayListNew.get(0).get("age"));



//        dbObject.removeField("age");





//        mongoDBDao.update("mason","mason",dbObjectArrayList.get(0),)


    }



    }
