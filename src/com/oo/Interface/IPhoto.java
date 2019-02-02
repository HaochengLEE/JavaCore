package com.oo.Interface;

/**
 * @author lihaocheng
 * @create 2019-02-02 11:43 AM
 **/

public interface IPhoto {
    public void photo();


    default void showphoto(){
        System.out.println("photo is beauty");
    }

}
