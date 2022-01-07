package com.jdk8plus.stream;

import java.time.LocalDate;

/**
 * * @author lihaocheng
 * * @createtime 2021/8/25
 */
public class Vo{
    private LocalDate localDate;
    private Integer value;

    public Vo(LocalDate localDate, Integer value) {
        this.localDate = localDate;
        this.value = value;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
