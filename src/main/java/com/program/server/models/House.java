package com.program.server.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Houses")
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String address;
    private String fraction;

    public House(int id, String address, String fraction) {
        this.id = id;
        this.address = address;
        this.fraction = fraction;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFraction() {
        return fraction;
    }

    public void setFraction(String fraction) {
        this.fraction = fraction;
    }
}
