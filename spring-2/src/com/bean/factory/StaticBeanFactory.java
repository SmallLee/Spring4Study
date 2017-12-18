package com.bean.factory;

import java.util.HashMap;
import java.util.Map;

public class StaticBeanFactory {
    private static Map<String,Car> cars = new HashMap<String,Car>();

    static {
        cars.put("audi",new Car("audi",30));
    }
    public static Car getCar(String brand) {
        return cars.get(brand);
    }
}
