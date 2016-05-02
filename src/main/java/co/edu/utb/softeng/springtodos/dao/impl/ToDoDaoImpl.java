/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utb.softeng.springtodos.dao.impl;

import co.edu.utb.softeng.springtodos.entity.ToDo;
import co.edu.utb.softeng.springtodos.dao.ToDoDao;
import java.util.List;
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
public class ToDoDaoImpl implements ToDoDao{
    
    @Autowired
    SessionFactory sessionFactory;
    
    @Override
    public ToDo getById(Long id) {
        
        Session session = sessionFactory.getCurrentSession();
        return (ToDo)session.createCriteria(ToDo.class).add(Restrictions.idEq(id)).uniqueResult();
    }
    
    @Override
    public List<ToDo> getAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createCriteria(ToDo.class).list();   
    }

    @Override
    public ToDo saveOrUpdate(ToDo todo) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(todo);
        return todo;
    }

    @Override
    public void delete(Long id) {
        Session session = sessionFactory.getCurrentSession();
        ToDo todo = new ToDo();
        todo.setId(id);
        session.delete(todo);
        
    }
    
    
}
