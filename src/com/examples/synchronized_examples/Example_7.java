package com.examples.synchronized_examples;

import java.lang.reflect.Method;

public class Example_7 {
    public static void main(String[] args) throws ReflectiveOperationException {
        Class<A> c = A.class;

        Class clazz = String.class;
        Class clazz2 = String.class;

        A a = new A();
        Class<?> c2 = a.getClass();
        System.out.println(c == c2);

        String caa = "A";
        Class<?> c3 = Class.forName(caa);
        System.out.println(c == c2);

//        Method m = c.getDeclaredMethods(caa);
//        m.invoke(null);
    }
}

class A {
    static void m(){
        System.out.println("A#m");
    }
}

