package com.common.utils;

import com.common.object.Car;
import com.common.object.Chair;
import com.common.web.Response;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Jerax
 * @date 2019/10/27 11:49 AM
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class SerializerTest {

    @Test
    public void obj2Json() throws Exception {
        final Chair chair = new Chair("black", 6);
        final Car myCar = new Car("white", 10000, chair);
        final String myCarStr = JsonUtils.object2Json(myCar);

        final Response<Car> objResponse = Response.newSuccess(myCar);
        final Response<String> stringResponse = Response.newSuccess(myCarStr);

        final String json1 = JsonUtils.object2Json(objResponse);
        final String json2 = JsonUtils.object2Json(stringResponse);
        System.out.println(json1);
        System.out.println(json2);

        Assert.assertTrue(json1.equalsIgnoreCase(json2));
    }
}
