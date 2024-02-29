package com.jdk8plus.DateUtil;


import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

import static java.time.temporal.TemporalAdjusters.nextOrSame;
import static java.time.temporal.TemporalAdjusters.previousOrSame;

/**
 * * @author lihaocheng
 * * @createtime 2021/8/25
 */
public class LocalAndDate {
    @Test
    public void localdateTime(){
        LocalDate localDate=LocalDate.now();
        LocalDateTime localDateTime=localDate.atTime(1,35,29);
        System.out.println(localDateTime);
    }

    /**
     * 返回当前周的起止日期
     */
    @Test
    public void weekUtil(){
        LocalDate localDate=LocalDate.of(2021,8,26);
        LocalDate startDate=localDate.with(previousOrSame(DayOfWeek.MONDAY));
        LocalDate endDate=localDate.with(nextOrSame(DayOfWeek.SUNDAY));
        System.out.println(startDate);
        System.out.println(endDate);

    }

    /**
     * LocalDateTime 转 LocalDate
     */
    @Test
    void dateTimeToDate(){
        LocalDateTime localDateTime=LocalDateTime.now();
        LocalDate today=localDateTime.toLocalDate();
    }
}
