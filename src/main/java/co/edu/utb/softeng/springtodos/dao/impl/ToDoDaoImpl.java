/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utb.softeng.springtodos.dao.impl;

import co.edu.utb.softeng.springtodos.entity.ToDo;
import co.edu.utb.softeng.springtodos.dao.ToDoDao;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.SessionFactory;
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
        
        ToDo todo = new ToDo();
        todo.setTitle("Test ToDo");
        todo.setDescription("This is a test ToDo. More to come.");
        return todo;
    }
    
    @Override
    public List<ToDo> getAll() {
        ToDo todo1 = new ToDo();
        todo1.setTitle("Test ToDo");
        todo1.setDescription("This is a test ToDo. More to come.");
        
        ToDo todo2 = new ToDo();
        todo2.setTitle("Test ToDo");
        todo2.setDescription("This is a test ToDo. More to come.");
        
        List<ToDo> todos = new ArrayList<>();
        todos.add(todo1);
        todos.add(todo2);
        return todos;
        
    }
    
    
}
