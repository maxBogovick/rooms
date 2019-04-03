package model.entity;

import model.entity.types.RoomType;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private Integer id;
    private Integer totalCost;
    private RoomType roomType;
    private Integer clientId;
    private User client;

    private List<Room> rooms = new ArrayList<>();

    public Order(Integer id, Integer totalCost, RoomType roomType, Integer clientId, User client) {
        this.id = id;
        this.totalCost = totalCost;
        this.roomType = roomType;
        this.clientId = clientId;
        this.client = client;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Integer getTotalCost() {
        return totalCost;
    }
    public void setTotalCost(Integer totalCost) {
        this.totalCost = totalCost;
    }
    public RoomType getRoomType() {
        return roomType;
    }
    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }
    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }

    public List<Room> getRooms() {
        return rooms;
    }
    public void settRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
}
