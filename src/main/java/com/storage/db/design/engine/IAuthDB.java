package com.storage.db.design.engine;

public interface IAuthDB {
    public boolean isAuth();
    public boolean auth(String login, String password);
    public boolean add(String login, String password);
    public boolean delete(String login);
}
