package com.storage.db.design.engine;

import java.util.Properties;

public interface IServer {
    public boolean createServer();
    public void setPropertiesServer(Properties properties);
    public void start();
    public void stopServer();
}
