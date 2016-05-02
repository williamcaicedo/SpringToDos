/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utb.softeng.springtodos.dao.impl;

import co.edu.utb.softeng.springtodos.dao.CategoryDao;
import co.edu.utb.softeng.springtodos.entity.Category;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author william
 */
public class CategoryDaoImpl implements CategoryDao{
    
    
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Category getById(Long id) {
         
        Session session = sessionFactory.getCurrentSession();
        return (Category)session.createCriteria(Category.class).add(Restrictions.idEq(id)).uniqueResult();
    }

    @Override
    public List<Category> getAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createCriteria(Category.class).list();   
    }
    
}
