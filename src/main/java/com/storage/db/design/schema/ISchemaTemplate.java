package com.storage.db.design.schema;

import com.sun.tools.javac.util.Pair;

import java.util.List;

public interface ISchemaTemplate {
    void addFiled(String name, TypeSchemaField type);
    void setSchemaName(String name);
    List<Pair<String, TypeSchemaField>> getAllField();
    String getNameSchema();
}
