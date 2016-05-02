/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utb.softeng.springtodos.dao.impl;

import co.edu.utb.softeng.springtodos.dao.CommentDao;
import co.edu.utb.softeng.springtodos.entity.Comment;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author william
 */
public class CommentDaoImpl implements CommentDao{
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Comment getById(Long id) {
         
        Session session = sessionFactory.getCurrentSession();
        return (Comment)session.createCriteria(Comment.class).add(Restrictions.idEq(id)).uniqueResult();
    }

    @Override
    public List<Comment> getAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createCriteria(Comment.class).list();   
    }
}
