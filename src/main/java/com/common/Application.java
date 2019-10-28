package com.common;

import com.common.object.Car;
import com.common.utils.JsonUtils;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Exception {
        Car car1 = new Car("Cadilac", 0);
        Car car2 = new Car("Honda", 0);
        System.out.println("car1:" + car1);
        System.out.println("car2:" + car2);

        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);

        final String json1 = JsonUtils.object2Json(car1);
        System.out.println("json1:" + json1);
        final String json2 = JsonUtils.object2Json(car2);
        System.out.println("json2:" + json2);
        final String jsonList = JsonUtils.object2Json(carList);
        System.out.println("jsonList:" + jsonList);

        Car json2Object = JsonUtils.json2Object(json1, Car.class);
        System.out.println("json2Object:" + json2Object.getClass());

        List<Car> json2List = JsonUtils.json2List(jsonList, Car.class);
        System.out.println("json2List" + json2List);
    }

}
