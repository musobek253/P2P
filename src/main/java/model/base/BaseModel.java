package model.base;

import java.util.UUID;

public class BaseModel {

    private String name;
    private UUID id;

    public BaseModel(String name){
        this.name = name;
    }

    public BaseModel(String name, UUID id){
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = UUID.randomUUID();
    }
}

