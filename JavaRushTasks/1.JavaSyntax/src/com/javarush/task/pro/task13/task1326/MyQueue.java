package com.javarush.task.pro.task13.task1326;

import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyQueue extends AbstractQueue<String> {

    private final List<String> values = new ArrayList<>();

    @Override
    public Iterator<String> iterator() {
//        Iterator<String> iterator = values.iterator();
        return values.iterator();
    }

    @Override
    public int size() {
        return values.size();
    }

    @Override
    public boolean offer(String o) {
        return values.add(o);
    }



    @Override
    public String poll() {
        return values.size() > 0 ? values.remove(0) : null;
    }

    @Override
    public String peek() {
        return values.size() > 0 ? values.get(0) : null;
    }

  /*  @Override
    public String poll() {
        if(values.isEmpty()){
            return  null;
        }
        String result = values.get(0);
        values.remove(0);
        return result;
    }

    @Override
    public String peek() {
        if(values.isEmpty()){
            return  null;
        }
        return values.get(0);
    }*/
}
