package com.slmanju.reflection.com.slmanju.orm;

import java.lang.reflect.Field;

public class ColumnField {

    private final Field field;

    public ColumnField(Field field) {

        this.field = field;
    }

    public Field getField() {
        return field;
    }

    public String getName() {
        return field.getName();
    }

    public String getType() {
        return field.getClass().getSimpleName();
    }

}
