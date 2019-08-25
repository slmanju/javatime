package com.slmanju.reflection.com.slmanju.orm;

import java.util.List;

public class OrmApp {

    public static void main(String[] args) {
        MetaModel<User> metaModel = MetaModel.of(User.class);

        PrimaryKeyField primaryKeyField = metaModel.getPrimaryKey();
        List<ColumnField> columnFields = metaModel.getFields();

        System.out.println("Primary key = name " + primaryKeyField.getName() + " , type " + primaryKeyField.getType());

        columnFields.forEach(columnField -> System.out.println("Column = name " + columnField.getName() + " , type " + columnField.getType()));
    }

}
