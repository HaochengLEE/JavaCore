package com.oo.generic;

/**
 * @author lihaocheng
 * @create 2019-03-03 15:25
 **/

public class ClearCar {
    //静态内部类
    static class ClearSrevice{
        public static void main(String[] args) {
            Car a=new BMW();
            Car b=new Benze();
            ClearCar wash=new ClearCar();
            wash.clear(a);
            wash.clear(b);



        }

    }

    public  <Car> void clear(Car c){
        System.out.println(c.getClass()+" Car is clear");

    }


}
