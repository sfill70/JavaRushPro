package com.javarush.task.jdk13.task34.task3409;

import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generator<T> {

    private Class<T> aClass;

    public Generator(Class<T> aClass) {
        this.aClass = aClass;
    }

    T newInstance() throws Exception {
        Constructor<T> declaredConstructor = (Constructor<T>) aClass.getDeclaredConstructors()[0];
        T instance = (T) declaredConstructor.newInstance(new Object[declaredConstructor.getParameterCount()]);
        return instance;
    }
//   Так тоже создпется объект с пустым полями не null.
    /*T newInstance() throws Exception {
        Constructor<T> declaredConstructor = (Constructor<T>) aClass.getDeclaredConstructors()[0];
        Object[] objects = new Object[declaredConstructor.getParameterCount()];
        for (int i = 0; i < declaredConstructor.getParameterTypes().length; i++) {
            if (declaredConstructor.getParameterTypes()[i].toString().endsWith("Boolean")) {
                objects[i] = true;
                continue;
            }
            objects[i] = declaredConstructor.getParameterTypes()[i].newInstance();
        }
        T instance1 = (T) declaredConstructor.newInstance(objects);
        return instance1;
    }*/

    static List<Type> getConstructorParametersGenerics(Constructor<?> c) {
        return new ArrayList<>(Arrays.asList(c.getGenericParameterTypes()));
    }

    public <T> Object newInstanceT(Constructor<T> c, List<Type> list) {
//        Constructor<?> employeeConstructor2 = c(String...st);
        return null;
    }

    static List<Class<?>> getConstructorParameterTypes(Constructor<?> c) {
        return new ArrayList<>(Arrays.asList(c.getParameterTypes()));
    }
}
