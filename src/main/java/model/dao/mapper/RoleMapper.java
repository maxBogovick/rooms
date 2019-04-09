package model.dao.mapper;

import model.entity.types.Role;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

public class RoleMapper implements ObjectMapper<Role> {


    public Role extractFromResultSet(ResultSet rs) throws SQLException {
        Role result = Role.valueOf(rs.getString("name"));
        result.setId(rs.getInt("ID_role"));
        return result;
    }

    public Role makeUnique(Map<Integer, Role> roles, Role role) {
        roles.putIfAbsent(role.getId(), role);

        return roles.get(role.getId());
    }
}
