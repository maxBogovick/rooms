package model.dao;

import model.entity.types.Role;

public interface RoleDao extends GenericDao<Role> {
    Role findByName(String name);
}
