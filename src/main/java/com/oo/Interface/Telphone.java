package com.oo.Interface;

/**
 * @author lihaocheng
 * @create 2019-02-02 11:32 AM
 **/

public class Telphone implements IPhoto,INet{

    public static int time=321;

    @Override
    public void photo() {

    }

    @Override
    public void connection() {

    }

    @Override
    public void network() {

    }

    //INet中的collection方法使用了default关键字，所以可以不进行重写
}
