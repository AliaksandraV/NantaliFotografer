package by.nantalifoto.service;

import by.nantalifoto.dao.RoleDao;
import by.nantalifoto.entity.RoleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RoleServiceImp implements RoleService {

    @Autowired
    private RoleDao roleDao;

    @Transactional
    @Override
    public void add(RoleEntity role) {
        roleDao.add(role);
    }

    @Transactional
    @Override
    public void update(long id, RoleEntity role) {
        roleDao.update(id, role);
    }

    @Transactional
    @Override
    public void delete(long id) {
        roleDao.delete(id);
    }

    @Transactional(readOnly = true)
    @Override
    public RoleEntity get(long id) {
        return roleDao.get(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<RoleEntity> roleList() {
        return roleDao.roleList();
    }
}
