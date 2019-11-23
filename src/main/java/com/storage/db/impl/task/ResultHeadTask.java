package com.storage.db.impl.task;

import com.storage.db.design.task.IResult;
import com.storage.db.design.task.TypeTask;

import java.net.Socket;
import java.util.concurrent.ExecutorService;

public class ResultHeadTask extends AHeadTask {

    public ResultHeadTask(Socket client, ExecutorService serviceTheaderPool, IResult result) {
        super(client, serviceTheaderPool);
        this.typeTask = TypeTask.RESULT;
        this.result = result;
    }

    public AHeadTask call() throws Exception {
        return null;
    }
}
