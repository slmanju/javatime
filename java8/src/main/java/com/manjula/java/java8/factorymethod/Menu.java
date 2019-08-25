package com.manjula.java.java8.factorymethod;

public class Menu {

    private String text;

    public Menu(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "text='" + text + '\'' +
                '}';
    }
}
