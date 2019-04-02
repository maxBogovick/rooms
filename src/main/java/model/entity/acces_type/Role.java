package model.entity.acces_type;

public enum Role {
    VIZITOR,
    CLIENT,
    ADMIN;

    private long id;

    Role() {}

    public void setId(long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }


}
