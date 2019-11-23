package com.storage.db.impl.task;

import com.storage.db.design.task.TypeTask;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.ExecutorService;

public class TaskReadSocket extends AHeadTask {

    public TaskReadSocket(Socket client, ExecutorService serviceTheaderPool) {
        super(client, serviceTheaderPool);
    }

    public AHeadTask call() throws Exception {
        AHeadTask headTask = null;
        try {

            JAXBContext jaxbContextHeadTask = JAXBContext.newInstance(AHeadTask.class);
            Unmarshaller jaxbUnmarshallerHeadTask = jaxbContextHeadTask.createUnmarshaller();

            Object typeTask = jaxbUnmarshallerHeadTask.unmarshal(client.getInputStream());

            if(typeTask instanceof TypeTask) {
                headTask = AHeadTask.getHeadTask((TypeTask) typeTask, client, serviceTheaderPool);
            } else {
                throw new IOException("Ошибка: не верная команда.");
            }

        } catch (IOException e) {
            headTask = new ErrHeadTask(client, serviceTheaderPool, e.getMessage());
        }

        return headTask;
    }
}
