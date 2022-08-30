package web.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;
import org.hibernate.SessionFactory;

import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Repository
public class UserDaoImpl implements UserDao {
    public UserDaoImpl() {
    }

    //  @Autowired
    //private SessionFactory sessionFactory;

    @Override
    @SuppressWarnings("unchecked")
    @Transactional
    public List<User> getUsers() {
    //    TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("from User");
    return null; //query.getResultList();
    }


    @Override
    public void addUser(User user) {
    }

    @Override
    public User showUser(int id) {
        return null;
    }

    @Override
    public void updateUser(int id, User user) {
    }

    @Override
    public void deleteUser(int id) {
    }


}
