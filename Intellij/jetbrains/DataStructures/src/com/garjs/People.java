package com.garjs;

import java.util.UUID;

public class People {

    private String fName;
    private String lName;
    private UUID id;

    public People(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
        id = UUID.randomUUID();
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public String toString() {
        return fName + " " + lName + " ID : " + id.toString();
    }
}
