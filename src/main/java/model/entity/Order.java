package model.entity;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private Integer id;
    private Integer totalCost;
    private List<User> users = new ArrayList<>();
    private List<Room> rooms = new ArrayList<>();

    public Order(Integer id, Integer totalCost ) {
        this.id = id;
        this.totalCost = totalCost;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Integer totalCost() {
        return totalCost;
    }
    public void setTotalCost(Integer totalCost) {
        this.totalCost = totalCost;
    }

    public List<User> getUsers() {
        return users;
    }

    public void settUsers(List<User> users) {
        this.users = users;
    }
    public List<Room> getRooms() {
        return rooms;
    }
    public void settRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
}
