package com.everis.microservicioreniec.models.entity;

public class Reniec {
    private String document;
    private String entityName;
    private Boolean success;

    public void setDocument(String document) {
        this.document = document;
    }

    public String getEntityName() {
        return "Reniec";
    }

    public Boolean getSuccess() {
        return true;
    }
}
