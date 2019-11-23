package com.storage.db.impl.task;


import com.storage.db.design.task.IResult;

import java.util.ArrayList;
import java.util.List;

public class Result implements IResult {

    private boolean err = false;
    private String errMsg;
    private List<Object> result = new ArrayList<Object>();

    public Result() {
    }

    public void addResult(Object result){
        this.result.add(result);
    }

    public void setResult(List<Object> result) {
        this.result = result;
    }

    public void setErrMsg(String errMsg) {
        this.err = true;
        this.errMsg = errMsg;
    }

    public void setErrMsg(boolean err, String errMsg) {
        this.err = err;
        this.errMsg = errMsg;
    }

    public boolean isErr() {
        return err;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public Object getResult() {
        return result;
    }
}
