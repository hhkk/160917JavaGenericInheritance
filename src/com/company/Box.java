package com.company;

/**
 * Created by Owner on 9/17/2016.
 */
public class Box<T> {

    T t;

    public Box() {
    }

    public Box(T t) {
        set(t);
    }


    public void set (T tin) {
        t = tin;
        System.out.println("t:" + t);
    }
    public void print () {
        System.out.println("t.class:" + t.getClass().getName() );
    }
}
