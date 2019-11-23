package com.storage.db.impl.schema;

import com.storage.db.design.schema.ISchema;

import javax.xml.bind.annotation.XmlAttribute;

public class {nameSchema} implements ISchema {
    private {type} {nameField};

    @XmlAttribute
    public void set{nameField}({type} {nameField}) {
        this.{nameField} = {nameField};
    }

    public {type} get{nameField}() {
        return {nameField};
    }
}
