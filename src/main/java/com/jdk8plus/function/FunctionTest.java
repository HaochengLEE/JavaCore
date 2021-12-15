package com.jdk8plus.function;

import java.util.function.Function;

/**
 * @author lhc
 * @created 2021/12/15上午11:33
 */
public class FunctionTest {
    public static String pipei(String a,Function<String,String> function){
        return function.apply(a);
    }

    /**
     * 使用匿名函数
     */
    @Test
    public void test() {
        assertEquals(pipei("abc",s -> {
            if (s.equals("abc")){
                return s;
            }
            else {
                return "";
            }
        }),"abc");
    }


}
