package com.liumapp.schedule.demo;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * some unnecessary tests .
 * Created by liumapp on 1/2/18.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Main.class})
public class MainTest {

    @Ignore
    @Test
    public void getTimeTest () {
        Date currentTime = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = format.format(currentTime);

        String Hour = dateString.substring(11 , 13);
        String Min = dateString.substring(14 , 16);

        System.out.println(dateString);
        System.out.println(Hour);
        System.out.println(Min);
    }

    @Ignore
    @Test
    public void setTimeTest () {
        Date now = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println("距离现在5分钟的时间是: " + format.format(now.getTime() + 1000 * 60 * 5) );
    }

}
