package com.bean.factory;

import java.util.HashMap;
import java.util.Map;

public class InstanceBeanFactory {
    private Map<String,Car> cars = null;

    public InstanceBeanFactory(){
        cars = new HashMap<>();
        cars.put("audi",new Car("audi",22));
        cars.put("baoma",new Car("baoma",333));
    }
    public Car getCar(String brand){
        return cars.get(brand);
    }
}
