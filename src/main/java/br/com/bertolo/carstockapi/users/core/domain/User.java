package br.com.bertolo.carstockapi.users.core.domain;

import java.util.Optional;

public class User {
    private Long id;
    private String name;
    private String email;
    private String password;


    public User(Long id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public static User create(String name, String email, String password) {
        return new User(null, name, email, password);
    }

    public static User createFromDb(Long id, String name, String email, String password) {
        return new User(id, name, email, password);
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }
}
