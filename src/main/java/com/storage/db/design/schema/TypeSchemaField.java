package com.storage.db.design.schema;

public enum TypeSchemaField {
    DOUBLE("Double"), LONG("Long"), STRING("String"), DATETIME("DateTime");

    private String desc;

    TypeSchemaField(String desc) {
        this.desc = desc;
    }
}
