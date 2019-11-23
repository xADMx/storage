package com.storage.db.impl.task;

import com.storage.db.design.task.TypeTask;

import java.net.Socket;
import java.util.concurrent.ExecutorService;

public class CreateSchemaHeadTask extends AHeadTask {


    public CreateSchemaHeadTask(Socket client, ExecutorService serviceTheaderPool) {
        super(client, serviceTheaderPool);
        this.typeTask = TypeTask.CREATE_SCHEMA;
    }

    public AHeadTask call() throws Exception {
        return null;
    }
}
