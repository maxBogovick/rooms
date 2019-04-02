package model.entity;

public class Room {
    private int id_room;
    private String room_name;
    private String room_type;
    private Integer capacity;
    private Integer dates;
    private int cost;
    private int quota;

    public Room(int id_room, String room_name, String room_type, int capacity, int dates, int cost, int quota) {
        this.id_room = id_room;
        this.room_name = room_name;
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

    public String getRoomName() {
        return room_name;
    }
    public void setRoomName(String room_name) {
        this.room_name = room_name;
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

}

