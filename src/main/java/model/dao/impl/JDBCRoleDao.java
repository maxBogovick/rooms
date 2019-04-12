//package model.dao.impl;
//
//import model.dao.RoleDao;
//import model.dao.mapper.RoleMapper;
//import model.entity.types.Role;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class JDBCRoleDao implements RoleDao {
//    private Connection connection;
//    private RoleMapper roleMapper;
//
//    JDBCRoleDao(Connection connection) {
//        this.connection = connection;
//        roleMapper = new RoleMapper();
//    }
//
//    @Override
//    public boolean create(Role entity) {
//        throw new UnsupportedOperationException();
//    }
//
//    @Override
//    public Role findByName(String name) {
//        Role role = null;
//        try (PreparedStatement stm = connection.prepareStatement(SQLManager.getProperty("find.role.by.name"))) {
//            stm.setString(1, name);
//            ResultSet rs = stm.executeQuery();
//            while (rs.next()) {
//                role = roleMapper.extractFromResultSet(rs);
//            }
//        } catch (SQLException e) {
//        }
//        return role;
//    }
//
//
//}
