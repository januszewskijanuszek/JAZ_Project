package com.example.demo.item;

import java.util.Date;

public class Item {
    private Long id;
    private String name;
    private Date release;
    private String author;
    private boolean taken;

    public Item(String name, Date release, String author, boolean taken) {
        this.name = name;
        this.release = release;
        this.author = author;
        this.taken = taken;
    }

    public Item() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRelease() {
        return release;
    }

    public void setRelease(Date release) {
        this.release = release;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isTaken() {
        return taken;
    }

    public void setTaken(boolean taken) {
        this.taken = taken;
    }
}
