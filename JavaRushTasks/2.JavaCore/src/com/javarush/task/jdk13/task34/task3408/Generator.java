package com.javarush.task.jdk13.task34.task3408;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Generator<T> {

    /*
    решение JavaRash
    private Class<T> aClass;

    public Generator(Class<T> aClass) {
        this.aClass = aClass;
    }

    T newInstance() throws Exception {
        return aClass.getDeclaredConstructor().newInstance();
    }*/

    private Class<T> aClass;
    public Generator(Class<T> aClass) {
    this.aClass = aClass;
    }

    T newInstance() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<T> eventConstructor = aClass.getConstructor();
//        System.out.println(eventConstructor);
        T newInstance = (T) eventConstructor.newInstance();
//        System.out.println(newInstance);
        return newInstance;
    }
}
