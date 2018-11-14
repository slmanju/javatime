package com.manjula.java.java8.stream.flatmap;

public class User {

    private int id;
    private String firstName;
    private String lastName;

    private User(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static User newInstance(int id, String firstName, String lastName) {
        return new User(id, firstName, lastName);
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName.concat(" ").concat(lastName);
    }

}

class UserView {
    private String view;

    private UserView(String view) {
        this.view = view;
    }

    public static UserView newInstance(String view) {
        return new UserView(view);
    }

    public String getView() {
        return view;
    }

    @Override
    public String toString() {
        return view;
    }

}
