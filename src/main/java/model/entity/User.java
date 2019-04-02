package model.entity;

import model.entity.acces_type.Role;

public class User {
    private Integer id;
    private String login;
    private String password;
    private String email;
    private String name;
    private String nameEn;
    private String surname;
    private String surnameEn;
    private Role role;

    public User() {
    }

    public User(Integer id, String login, String password, String email, String name, String nameEn, String surname, String surnameEn , Role role) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.email = email;
        this.name = name;
        this.name = nameEn;
        this.surname = surname;
        this.surname = surnameEn;
        this.role = role;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

}
