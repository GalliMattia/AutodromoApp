package com.example;

import java.time.LocalDate;

public class Eventi {
    private int id;
    private String name;
    private LocalDate date;

    public Eventi(int id, String name, LocalDate date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }
    
}

