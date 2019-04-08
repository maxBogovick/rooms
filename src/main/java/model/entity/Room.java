package model.entity;

import java.util.Objects;

public class Room {
    private int id_room;
    private String room_type;
    private int capacity;
    private int cost;
    private int quota;

    public Room() {}

    public Room(int id_room, String room_type, int capacity, int cost, int quota) {
        this.id_room = id_room;
        this.room_type = room_type;
        this.capacity = capacity;
        this.cost = cost;
        this.quota = quota;
    }

    public int getRoomID() {
        return id_room;
    }

    public void setRoomID(int id_room) {
        this.id_room = id_room;
    }

    public String getRoomType() {
        return room_type;
    }
    public void setRoomType(String room_type) {
        this.room_type = room_type;
    }

    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int email) {
        this.capacity = capacity;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getQuota() {
        return quota;
    }
    public void setQuota(int quota) {
        this.quota = quota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room that = (Room) o;
        return room_type.equals(that.room_type);
//                capacity.equals(that.capacity) &&
//                cost.equals(that.cost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(room_type, capacity, cost);
    }

    @Override
    public String toString() {
        return "\nRoom{" +
                "id=" + id_room +
                ", room type='" + room_type + '\'' +
                ", capacity='" + capacity + '\'' +
                ", cost='" + cost + '\'' +
                ", quota=" + quota +
                '}';
    }

}

