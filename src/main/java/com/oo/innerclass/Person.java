package com.oo.innerclass;

/**
 * @author lihaocheng
 * @create 2019-02-03 3:14 PM
 **/

public class Person {
    int age=123;
    static String name="lhc";
    boolean sex=true;

    public Heart getHeart(){
        return new Heart();
    }

    public void add(){
        System.out.println("anpai");
    }

    public Object initHeart3(){
        class Heart3{
            int c=1;
            public void add(){


            }


        }
        return new Heart3();
    }


    //成员内部类
    class Heart{
        int age=233;

        public String beat(){
            return Person.this.age+"Heart is beating";
        }

        public void add(){
            System.out.println("anpaixiaolaodi");
        }
    }
    //静态内部类
    public static class Heart2{
        public static int age=13;

        public void say(){
            System.out.println("hello");
        }
        public void bye(){
            //静态内部类中，只能直接访问外部类的静态方法，如果需要调用非静态方法，可以通过对象实例实现
            System.out.println(new Person().sex);
            System.out.println(name);
        }



    }
}
