package model.dao.mapper;

import model.entity.User;
import model.entity.types.Role;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

public class UserMapper implements ObjectMapper<User> {

    @Override
    public User extractFromResultSet(ResultSet rs) throws SQLException {
        System.out.println("in mapper");
        int id = rs.getInt("id_user");
        String login = rs.getString("login");
        String password = rs.getString("password");
        String mail = rs.getString("user_email");
        Role role = Role.CLIENT;


        User user = new User(id, login, password, mail, role);
        return user;
    }


    public User makeUnique(Map<Integer, User> cache, User user) {
        cache.putIfAbsent(user.getId(), user);
        return cache.get(user.getId());
    }
}
