package model.dao.impl;

import model.dao.RoomDao;
import model.dao.mapper.RoomMapper;
import model.dao.mapper.UserMapper;
import model.entity.Room;
import model.entity.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JDBCRoomDao implements RoomDao {
    private Connection connection;

    public JDBCRoomDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public boolean create(Room entity) {
        return false;
    }

    @Override
    public Room findById(int id) {
        return null;
    }
    @Override
    public List<Room> findAll() {
        Map<Integer, Room> rooms = new HashMap<>();
        Map<Integer, User> users = new HashMap<>();

        final String query = "" +
                " select * from room" +
                " left join room_has_user using (id)" +
                " left join user using (id)";
        try (Statement st = connection.createStatement()) {
            ResultSet rs = st.executeQuery(query);

            UserMapper userMapper = new UserMapper();
            RoomMapper roomMapper = new RoomMapper();

            while (rs.next()) {
                Room room = roomMapper
                        .extractFromResultSet(rs);
                User user = userMapper
                        .extractFromResultSet(rs);
                room = roomMapper
                        .makeUnique(rooms, room);
//                user = userMapper
//                        .makeUnique(users, user);
//                room.getUsers().add(user);
            }
            return new ArrayList<>(rooms.values());
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }



    @Override
    public void update(Room entity) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void close()  {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
