package com.storage.db.impl.schema;


import com.storage.db.design.schema.ISchemaCreateDB;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SchemaCreateDB implements ISchemaCreateDB {

    private SchemaTemplate schema;
    private final String catalogSchemas;

    public SchemaCreateDB() {
        this.catalogSchemas = "./";
    }

    public SchemaCreateDB(String catalogSchemas) {
        this.catalogSchemas = catalogSchemas;
    }

    public boolean createFolderSchema() {
        Path path = Paths.get(catalogSchemas + schema.getNameSchema());
        try {
            if (!Files.exists(path) || !Files.isDirectory(path)) {
                Files.createDirectory(path, null);
            }
        } catch (IOException e) {
            return false;
        }

        return true;
    }

    public boolean createClassSchema() {
        return false;
    }

    public void setSchema(SchemaTemplate schema) {
        this.schema = schema;
    }

    @Override
    public Path getPathToDirDB() {
        return Paths.get(catalogSchemas + schema.getNameSchema());
    }

    @Override
    public Path getPathToDirSettingsDB() {
        return Paths.get(catalogSchemas + schema.getNameSchema() + "/setting/");
    }

    @Override
    public Path getPathToDirClassDB() {
        return Paths.get(catalogSchemas + schema.getNameSchema() + "/class/");
    }
}
