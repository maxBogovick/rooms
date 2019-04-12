package model.entity.types;

public enum Role {
    CLIENT(1),
    ADMIN(2),
    VIZITOR(3);

    private int role;

    Role(int role) {
        this.role = role;
    }

    public int getRole() {
        return role;
    }
}
