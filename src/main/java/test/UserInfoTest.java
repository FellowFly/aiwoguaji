package test;

import com.springMvc.myBatis.service.impl.BookServiceImpl;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

/**
 * 测试类
 *
 * @author 王晓安
 */
public class UserInfoTest extends BaseTest {
    private static Logger logger = Logger.getLogger(UserInfoTest.class);
    @Autowired
    private BookServiceImpl bookService;
//    @Test
//    public void test1() {
//        UserInfo userInfo = new UserInfo();
//        userInfo.setUserId("0000000000");
//        userInfoService.add(userInfo);
//    }
//
//    @Test
//    public void test2() {
//        System.out.println(1);
//    }
//
//    @Test
//    public void test3(){
//
//    }
//
    @Test
    public void test4(){
//        picServiceItemDetailedEvaluateDao.isSame("1","3201");
//        String[] s={"33301"};
//        specificEvaluationDao.updateCheck(s,"1");
//       picServiceItemGeneralEvaluateDao.isSame("1","1");
    }

    @Test
    public void test5(){
       bookService.getAllBooks();
    }

    public static void main(String[] args) {
//        PropertyConfigurator.configure(ClassLoader.getSystemResource("rescue/log4j.properties"));
        logger.info("this is info message");
        logger.debug("this is debug message");
        logger.warn("this is warn message");
        logger.error("this is error message");

    }

}
