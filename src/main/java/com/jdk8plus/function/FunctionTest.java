package com.jdk8plus.function;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
    @DisplayName("定义匿名函数")
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

    /**
     * 定义一个function检查名字中是否包含
     * @param key
     * @return
     */
    public static Function<String,String> checkName(String key){
        return name->{
            if (name.contains(key)){
                return "正确";
            }else {
                return "错误";
            }
        };
    }

    @Test
    @DisplayName("你的名字是否包含?")
    void testName(){
        assertEquals(checkName("李").apply("李四一"),"正确");
        assertEquals(checkName("李").apply("张三"),"错误");
    }


}
