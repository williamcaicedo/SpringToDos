/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utb.softeng.springtodos.service.impl;

import co.edu.utb.softeng.springtodos.dao.CategoryDao;
import co.edu.utb.softeng.springtodos.entity.Category;
import co.edu.utb.softeng.springtodos.service.CategoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author william
 */
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    CategoryDao dao;

    @Override
    public Category getCategoryById(Long id) {
        return dao.getById(id);
    }

    @Override
    public List<Category> getAllCategorys() {
        return dao.getAll();
    }
    
}
