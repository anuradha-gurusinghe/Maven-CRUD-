package com.usermanagement.dao.impl;

import java.util.List;
import com.usermanagement.dao.UserDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;


import com.usermanagement.bean.User;

@Repository
public class UserDaoImpl implements UserDao {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }
    @SuppressWarnings("unchecked")
    @Override
    public List<User> getAllUser() {
        Session session = this.sessionFactory.getCurrentSession();
        List<User> personsList = session.createQuery("from User", User.class).list();
        return personsList;
    }

    @Override
    public void saveUser(User user) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(user);
    }

    @Override
    public void updateUser(User user) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(user);

    }

    @Override
    public User getUser(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        User user = (User) session.load(User.class, new Integer(id));
        return user;
    }

    @Override
    public void deleteUser(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        User user = (User) session.load(User.class, new Integer(id));
        if(null != user){
            session.delete(user);
        }

    }



}


//@Repository
//public class UserDaoImpl implements UserDao {
//
//    @Autowired
//    private SessionFactory sessionFactory;
//
//    @Override
//    public List < User > getAllUser() {
//        Session session = sessionFactory.getCurrentSession();
//        CriteriaBuilder cb = session.getCriteriaBuilder();
//        CriteriaQuery < User > cq = cb.createQuery(User.class);
//        Root < User > root = cq.from(User.class);
//        cq.select(root);
//        Query query = session.createQuery(cq);
//        return query.getResultList();
//    }
//
//    @Override
//    public void deleteUser(int id){
//        Session session = sessionFactory.getCurrentSession();
//        User book = session.byId(User.class).load(id);
//        session.delete(book);
//    }
//
//    @Override
//    public void saveUser(User user) {
//        Session currentSession = sessionFactory.getCurrentSession();
//        currentSession.saveOrUpdate(user);
//    }
//
//    @Override
//    public User getUser(int id) {
//        Session currentSession = sessionFactory.getCurrentSession();
//        User user = currentSession.get(User.class, id);
//        return user;
//    }
//
//    @Override
//    public void updateUser(User user) {
//        Session session = this.sessionFactory.getCurrentSession();
//        session.update(user);
//    }
//}
