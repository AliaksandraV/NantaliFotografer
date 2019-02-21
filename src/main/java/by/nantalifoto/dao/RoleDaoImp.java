package by.nantalifoto.dao;

import by.nantalifoto.entity.RoleEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class RoleDaoImp implements RoleDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void add(RoleEntity role){
        sessionFactory.getCurrentSession().save(role);
    }

    @Override
    public void update(long id, RoleEntity role) {
        Session session = sessionFactory.getCurrentSession();
        RoleEntity selectedRole = session.byId(RoleEntity.class).load(id);
        selectedRole.setRole(role.getRole());
        session.flush();
    }

    @Override
    public void delete(long id) {
        Session session = sessionFactory.getCurrentSession();
        RoleEntity role = session.byId(RoleEntity.class).load(id);
        session.delete(role);
    }

    @Override
    public RoleEntity get(long id) {
        return sessionFactory.getCurrentSession().get(RoleEntity.class, id);
    }

    @Override
    public List<RoleEntity> roleList() {
        @SuppressWarnings("unchecked")
        TypedQuery<RoleEntity> query = sessionFactory.getCurrentSession().createQuery("from RoleEntity");
        return query.getResultList();
    }


}
