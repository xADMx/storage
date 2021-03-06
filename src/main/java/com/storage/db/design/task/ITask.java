package com.storage.db.design.task;

import com.storage.db.impl.task.AHeadTask;

import java.net.Socket;
import java.util.concurrent.Callable;

public interface ITask extends Callable<AHeadTask> {

    void setClient(Socket client);

}
