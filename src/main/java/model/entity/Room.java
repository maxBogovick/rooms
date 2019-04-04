package model.entity;

import model.entity.types.RoomType;

import java.util.Objects;

public class Room {
    private int id_room;
    private RoomType room_type;
    private Integer capacity;
    private Integer cost;
    private Integer quota;

    public Room() {}

    public Room(int id_room, RoomType room_type, int capacity, Integer cost, Integer quota) {
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

    public RoomType getRoomType() {
        return room_type;
    }
    public void setRoomType(RoomType room_type) {
        this.room_type = room_type;
    }

    public Integer getCapacity() {
        return capacity;
    }
    public void setCapacity(Integer email) {
        this.capacity = capacity;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getQuota() {
        return quota;
    }
    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room that = (Room) o;
        return room_type.equals(that.room_type) &&
                capacity.equals(that.capacity) &&
                cost.equals(that.cost);
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

