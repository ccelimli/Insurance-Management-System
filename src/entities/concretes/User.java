package entities.concretes;

import java.util.List;

public class User {
    private String name;
    private String surname;
    private String email;
    private String password;
    private String job;
    private int age;

    public User() {
    }

    public User(String name, String surname, String email, String password, String job, int age) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.job = job;
        this.age = age;
    }
}
