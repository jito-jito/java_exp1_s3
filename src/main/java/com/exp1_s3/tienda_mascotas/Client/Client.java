package com.exp1_s3.tienda_mascotas.Client;

public class Client {
    private int id;
    private String name;
    private String run;

    public Client(int id, String name, String run) {
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
}
