package com.oo.innerclass;

/**
 * @author lihaocheng
 * @create 2019-02-07 11:21 PM
 **/

public class PeopleTest {
    public void getread(People p){
        p.read();

    }

    public static void main(String[] args) {
        PeopleTest pt=new PeopleTest();
        pt.getread(new People() {
            @Override
            public void read() {
                System.out.println("看流浪地球");
            }
        });

        pt.getread(new People() {
            @Override
            public void read() {
                System.out.println("看小猪佩奇");
            }
        });
    }

}
