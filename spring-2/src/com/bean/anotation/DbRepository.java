package com.bean.anotation;

public class DbRepository implements UserRepository {
    @Override
    public void save() {
        System.out.println("dbrepository... save");
    }
}
