package com.storage.db.design.task;


import com.storage.db.impl.task.AHeadTask;

import java.net.Socket;
import java.util.concurrent.Callable;

public interface IHeadTask extends Callable<AHeadTask> {
    TypeTask getTypeTask();
    void setTypeTask(TypeTask typeTask);
    IResult getResult();
    void setClient(Socket client);
}
