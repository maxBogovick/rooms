package model.entity.types;

public enum Role {
    VIZITOR,
    CLIENT,
    ADMIN;

    private int id;

    Role() {}

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


}
