package com.storage.db.design.schema;

import com.storage.db.impl.schema.SchemaTemplate;

import java.io.IOException;
import java.nio.file.Path;

public interface ISchemaCreateDB {
    boolean createFolderSchema();
    boolean createClassSchema();
    void setSchema(SchemaTemplate schema);
    Path getPathToDirDB();
    Path getPathToDirSettingsDB();
    Path getPathToDirClassDB();
}
