package com.storage.db.impl.task;

import com.storage.db.design.task.ITask;
import com.storage.db.design.task.TypeTask;

import java.io.*;
import java.net.Socket;

public class Task implements ITask {

    private Socket client;

    public TypeTask getTypeTask() {
        return null;
    }

    public void setClient(Socket client) {
        this.client = client;
    }

    public void run() {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
