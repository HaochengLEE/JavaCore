package com.util.exception;

/**
 * @author lihaocheng
 * @create 2019-02-10 2:56 PM
 **/

public class TryDemoFour {
    public static void main(String[] args) {
        try {
            EThree();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void EOne() throws HotelAgeException {
        throw new HotelAgeException();
    }

    public static void ETwo() throws Exception {
        try {
            EOne();
        } catch (HotelAgeException e) {
            throw new Exception("Exception by Etwo");
        }
    }

    public static void EThree() throws Exception {
        try {
            ETwo();
        } catch (Exception e) {
            throw new Exception("Exception by EThree");
        }
    }



}
