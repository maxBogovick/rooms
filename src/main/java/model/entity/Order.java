package model.entity;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private Integer id;
    private Integer totalCost;
    private List<User> user = new ArrayList<>();

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


    public List<User> getUser() {
        return user;
    }
}
