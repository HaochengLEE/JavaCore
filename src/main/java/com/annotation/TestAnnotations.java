package com.annotation;

/**
 * * @author lihaocheng
 * * @createtime 2021/5/5
 */
public class TestAnnotations {
    public static void main(String[] args) {
        Class<?> cls=MethodAnnotations.class;
        cls.getMethods();
        cls.getFields();
        System.out.println(cls.getAnnotations());

    }
}
