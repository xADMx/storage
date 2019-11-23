package com.storage.db.impl.task;

import com.storage.db.design.task.IResult;
import com.storage.db.design.task.TypeTask;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.net.Socket;
import java.util.concurrent.ExecutorService;

public class ErrHeadTask extends AHeadTask {

    public ErrHeadTask(Socket client, ExecutorService serviceTheaderPool, String errMsg) {
        super(client, serviceTheaderPool);
        this.typeTask = TypeTask.RESULT;
        this.result.setErrMsg(errMsg);
    }

    public AHeadTask call() throws Exception {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(IResult.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(result, client.getOutputStream());
        } finally {
            client.close();
        }

        return null;
    }
}
