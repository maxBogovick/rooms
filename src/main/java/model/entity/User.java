package model.entity;

import model.entity.types.Role;

import java.util.Objects;

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

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }


    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getNameEn() {
        return nameEn;
    }
    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurnameEn() {
        return surnameEn;
    }
    public void setSurnameEn(String surnameEn) {
        this.surnameEn = surnameEn;
    }

    public Role getRole() {
        return role;
    }
    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return login.equals(user.login) &&
                password.equals(user.password) &&
                email.equals(user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, email);
    }

    @Override
    public String toString() {
        return "\nUser{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + name + '\'' +
                ", firstName_en='" + nameEn + '\'' +
                ", lastName='" + surname + '\'' +
                ", lastName_en='" + surnameEn + '\'' +
                ", role=" + role +
                '}';
    }

}
