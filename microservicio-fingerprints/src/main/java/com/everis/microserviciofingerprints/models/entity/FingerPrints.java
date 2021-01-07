package com.everis.microserviciofingerprints.models.entity;

public class FingerPrints {
    private String document;
    private String entityName;
    private Boolean success;

    public void setDocument(String document) {
        this.document = document;
    }

    public String getEntityName() {
        return "Core";
    }

    public Boolean getSuccess() {
        return true;
    }
}
