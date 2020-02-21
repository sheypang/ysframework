package cn.pxy.ysframework;

import cn.pxy.ysframework.utils.DateTime;
import cn.pxy.ysframework.utils.DigistUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class YsframeworkApplicationTests {

    @Test
    public void testUtils() {
        System.out.println("============测试数据==========");
        System.out.println(System.currentTimeMillis());
        System.out.println(new DateTime(100000).Now);
        System.out.println();
        System.out.println(DigistUtils.getUUID64());
        System.out.println(DigistUtils.getUUID32());
        System.out.println(DigistUtils.MD5("123"));
        System.out.println("============测试数据==========");


    }

}
