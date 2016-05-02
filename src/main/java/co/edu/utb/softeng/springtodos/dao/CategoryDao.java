/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utb.softeng.springtodos.dao;

import co.edu.utb.softeng.springtodos.entity.Category;
import java.util.List;

/**
 *
 * @author william
 */
public interface CategoryDao {
    public Category getById(Long id);
    public List<Category> getAll();
    
}
