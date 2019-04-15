package com.project;

/**
 * @author lihaocheng
 * @create 2019-04-15 12:34
 **/

public class Book {
    private String name;
    private String writer;
    private String company;

    public Book(String name, String writer, String company) {
        this.name = name;
        this.writer = writer;
        this.company = company;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
