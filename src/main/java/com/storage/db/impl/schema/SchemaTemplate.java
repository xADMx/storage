package com.storage.db.impl.schema;

import com.storage.db.design.schema.ISchemaTemplate;
import com.storage.db.design.schema.TypeSchemaField;
import com.sun.tools.javac.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class SchemaTemplate implements ISchemaTemplate {

    private List<Pair<String, TypeSchemaField>> field = new ArrayList<Pair<String, TypeSchemaField>>();
    private String name;

    public SchemaTemplate(String name) {
        this.name = name;
    }

    public void addFiled(String name, TypeSchemaField type) {
        field.add(Pair.of(name, type));
    }

    public void setSchemaName(String name) {
        this.name = name;
    }

    public List<Pair<String, TypeSchemaField>> getAllField() {
        return field;
    }

    public String getNameSchema() {
        return name;
    }
}
