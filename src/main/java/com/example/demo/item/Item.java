package com.example.demo.item;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "items")
@Table
public class Item {
    @Id
    @SequenceGenerator(
            name = "item_sequence",
            sequenceName = "item_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "item_sequence"
    )
    @Column(name = "id",
            updatable = false)
    private Long id;

    @Column(name = "name",
           nullable = false)
    private String name;

    @Column(name = "release",
            nullable = false)
    private Date release;

    @Column(name = "author")
    private String author;

    @Column(name = "taken",
            nullable = false)
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
