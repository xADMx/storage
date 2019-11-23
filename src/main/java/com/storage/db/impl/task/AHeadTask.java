package com.storage.db.impl.task;

import com.storage.db.design.task.IHeadTask;
import com.storage.db.design.task.IResult;
import com.storage.db.design.task.TypeTask;

import java.net.Socket;
import java.util.concurrent.ExecutorService;

public abstract class AHeadTask implements IHeadTask {
    protected IResult result = new Result();
    protected TypeTask typeTask;
    protected Socket client;
    protected ExecutorService serviceTheaderPool;

    public AHeadTask(Socket client, ExecutorService serviceTheaderPool) {
        this.client = client;
        this.serviceTheaderPool = serviceTheaderPool;
    }

    public void setClient(Socket client) {
        this.client = client;
    }

    public static AHeadTask getHeadTask(TypeTask typeTask, Socket client, ExecutorService serviceTheaderPool){
        switch (typeTask){
            case ADD:
                break;
            case EDIT:
                break;
            case DELETE:
                break;
            case RESULT:
                break;
            case SELECT:
                break;
            case CREATE_SCHEMA:
                return new CreateSchemaHeadTask(client, serviceTheaderPool);
            case CREATE_FUNCTION:
                break;
        }

        return null;
    }

    public TypeTask getTypeTask() {
        return typeTask;
    }

    public void setTypeTask(TypeTask typeTask) {
        this.typeTask = typeTask;
    }

    public IResult getResult() {
        return result;
    }

    public abstract AHeadTask call() throws Exception;
}
