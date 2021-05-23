package com.oo.Interface;

/**
 * @author lihaocheng
 * @create 2019-02-02 9:55 PM
 **/

public interface IPhone extends IPhoto,INet {


    @Override
    default void network() {

    }

    @Override
    default void photo() {

    }

    @Override
    default void connection() {

    }
}
