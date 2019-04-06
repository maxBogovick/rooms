package model.dao.mapper;

import model.entity.Room;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

public class RoomMapper implements ObjectMapper<Room> {


    @Override
    public Room extractFromResultSet(ResultSet rs) throws SQLException {
        Room room = new Room();
        room.setRoomID(rs.getInt("idroom"));
//        room.setRoomType(rs.getString("roomType"));
        room.setCost(rs.getInt("cost"));
        return room;
    }

    @Override
    public Room makeUnique(Map<Integer, Room> cache,
                           Room room) {
        cache.putIfAbsent(room.getRoomID(), room);
        return cache.get(room.getRoomID());
    }
}
