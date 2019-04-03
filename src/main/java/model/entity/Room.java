package model.entity;

import java.util.Objects;

public class Room {
    private int id_room;
    private String room_type;
    private Integer capacity;
    private Integer dates;
    private Integer cost;
    private Integer quota;

    public Room(int id_room, String room_type, int capacity, Integer dates, Integer cost, Integer quota) {
        this.id_room = id_room;
        this.room_type = room_type;
        this.capacity = capacity;
        this.dates = dates;
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

    public Integer getCapacity() {
        return capacity;
    }
    public void setCapacity(Integer email) {
        this.capacity = capacity;
    }

    public Integer getDates() {
        return dates;
    }
    public void setDates(Integer dates) {
        this.dates = dates;
    }
    public Integer getCost() {
        return cost;
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
                ", dates='" + dates + '\'' +
                ", cost='" + cost + '\'' +
                ", quota=" + quota +
                '}';
    }

}

