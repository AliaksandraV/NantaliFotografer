package by.nantalifoto.dao;

import by.nantalifoto.entity.RoleEntity;

import java.util.List;

public interface RoleDao {

    void add(RoleEntity role);
    void update (long id, RoleEntity role);
    void delete (long id);
    RoleEntity get (long id);
    List <RoleEntity> roleList();
}
