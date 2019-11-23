package com.storage.db.design.task;

import java.util.List;

public interface IResult {
    void addResult(Object result);
    void setResult(List<Object> result);
    void setErrMsg(String errMsg);
    void setErrMsg(boolean err, String errMsg);
}
