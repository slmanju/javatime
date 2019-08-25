package com.slmanju.reflection.com.slmanju.orm;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class MetaModel<T> {

    private Class<T> cls;

    private MetaModel(Class<T> cls) {
        this.cls = cls;
    }

    public static <T> MetaModel<T> of(Class<T> cls) {
        return new MetaModel<>(cls);
    }

    public PrimaryKeyField getPrimaryKey() {
        Field[] declaredFields = cls.getDeclaredFields();
        return Arrays.stream(declaredFields)
                .filter(field -> null != field.getAnnotation(PrimaryKey.class))
                .findFirst()
                .map(PrimaryKeyField::new)
                .orElse(null);
    }

    public List<ColumnField> getFields() {
        Field[] declaredFields = cls.getDeclaredFields();
        return Arrays.stream(declaredFields)
                .filter(field -> null != field.getAnnotation(Column.class))
                .map(ColumnField::new)
                .collect(toList());
    }

}
