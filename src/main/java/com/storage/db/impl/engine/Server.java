package com.storage.db.impl.engine;

import com.storage.db.design.engine.IServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;

public class Server implements IServer {

    private int port;
    private ServerSocket serverSocket = null;

    public Server() {
    }

    public Server(int port) {
        this.port = port;
    }

    public boolean createServer() {
        try {
            serverSocket = new ServerSocket(port);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void setPropertiesServer(Properties properties) {
        try {
            port = Integer.valueOf(properties.getProperty("port", "1452"));
        } catch (NumberFormatException e){
            port = 1452;
        }
    }

    public void start(){

        if(serverSocket == null)
            createServer();

        while (true){
            try {
                Socket socket = serverSocket.accept();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
