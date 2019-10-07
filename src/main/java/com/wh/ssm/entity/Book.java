package com.wh.ssm.entity;

/**
 * Created by rememberthelesson on 2019/10/2.
 */


public class Book {
    private int bookid;
    private String name;
    private String cnt;

    public Book(int bookid,String name, String cnt){
        this.bookid = bookid;
        this.name = name;
        this.cnt = cnt;
    }

    public int getBookid() {
        return bookid;
    }

    @Override
     public String toString() {
        return "Book{" + "bookid=" + bookid + ", name='" + name + '\'' + ", cnt=" + cnt + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnt() {
        return cnt;
    }

    public void setCnt(String cnt) {
        this.cnt = cnt;
    }

    public void setBookid(int bookid) {

        this.bookid = bookid;
    }
}
