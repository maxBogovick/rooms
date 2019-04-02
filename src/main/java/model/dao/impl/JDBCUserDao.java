package model.dao.impl;

import model.dao.UserDao;
import model.dao.mapper.UserMapper;
import model.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class JDBCUserDao implements UserDao {
    private Connection connection;

    public JDBCUserDao(Connection connection) {
        this.connection = connection;
    }


    @Override
    public void create(User entity) {

    }

    @Override
    public User findById(int id) {
        return null;
    }



    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public void update(User entity) {

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

    @Override
    public Optional<User> findByName(String name) {

        Optional<User> result = Optional.empty();
        try(PreparedStatement ps = connection.prepareCall("SELECT * FROM teacher WHERE name = ?")){
            ps.setString( 1, name);
            ResultSet rs;
            rs = ps.executeQuery();
            UserMapper mapper = new UserMapper();
            if (rs.next()){
                result = Optional.of(mapper.extractFromResultSet(rs));
            }//TODO : ask question how avoid two teachers with the same name
        }catch (Exception ex){
            throw new RuntimeException(ex);
        }
        return result;
    }
}
