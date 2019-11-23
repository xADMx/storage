package com.storage.db.design.task;

public enum TypeTask {
    CREATE_SCHEMA("Создать таблицу"),
    ADD("Добавить данные в таблицу"),
    EDIT("Добавить данные в таблицу"),
    DELETE("Добавить данные в таблицу"),
    SELECT("Вывод данных"),
    CREATE_FUNCTION("Создание функции"),
    RESULT("Вернуть результат");

    private String desc;

    TypeTask(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
