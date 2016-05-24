/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utb.softeng.springtodos.dao.security.impl;

import co.edu.utb.softeng.springtodos.dao.security.UserDao;
import co.edu.utb.softeng.springtodos.entity.security.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author william
 */

@Repository
public class UserDaoImpl implements UserDao{
    
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public User findByUserName(String username) {
        Session session = sessionFactory.getCurrentSession();
        User u = (User) session.createCriteria(User.class)
                .add(Restrictions.like("username", username))
                .uniqueResult();
        return u;
    }
    
}
