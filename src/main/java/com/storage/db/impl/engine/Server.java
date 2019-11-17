package com.storage.db.impl.engine;

import com.storage.db.design.engine.IServer;
import com.storage.db.impl.task.Task;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server implements IServer {

    private int port = 1452;
    private int countTheard = 10;
    private ServerSocket serverSocket = null;
    private ExecutorService serviceTheaderPool = null;
    private boolean stop = false;

    public Server() {
    }

    public Server(int port) {
        this.port = port;
    }

    public boolean createServer() {
        try {
            serverSocket = new ServerSocket(port);
            serviceTheaderPool = Executors.newFixedThreadPool(countTheard);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void setPropertiesServer(Properties properties) {
        try {
            port = Integer.parseInt(properties.getProperty("port", "1452"));
        } catch (NumberFormatException ignored){
        }

        try {
            countTheard = Integer.parseInt(properties.getProperty("countTheard", "10"));
        } catch (NumberFormatException ignored){
        }
    }

    public void start(){

        if(serverSocket == null)
            createServer();

        stop = false;
        while (!stop){
            try {
                Socket socket = serverSocket.accept();
                Task task = new Task();
                task.setClient(socket);
                serviceTheaderPool.execute(task);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        serviceTheaderPool.shutdown();
    }

    public void stopServer() {
        stop = true;
    }
}
