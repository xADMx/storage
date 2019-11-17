package com.storage.db.design.task;

import java.net.Socket;

public interface ITask extends Runnable {

    public TypeTask getTypeTask();
    public void setClient(Socket client);

}
