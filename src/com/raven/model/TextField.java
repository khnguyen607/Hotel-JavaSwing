package com.raven.model;

public class TextField {
    private String label;
    private String field;
    private String type;

    public TextField(String label, String field, String type) {
        this.label = label;
        this.field = field;
        this.type = type;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
