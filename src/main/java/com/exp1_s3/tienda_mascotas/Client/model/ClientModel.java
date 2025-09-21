package com.exp1_s3.tienda_mascotas.Client.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CLIENTE")
public class ClientModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String run;

    public ClientModel() {
    }

    public ClientModel(int id, String name, String run) {
        this.id = id;
        this.name = name;
        this.run = run;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRun() {
        return run;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRun(String run) {
        this.run = run;
    }
}
