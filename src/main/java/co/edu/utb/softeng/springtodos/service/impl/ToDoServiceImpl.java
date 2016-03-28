/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utb.softeng.springtodos.service.impl;

import co.edu.utb.softeng.springtodos.dao.ToDoDao;
import co.edu.utb.softeng.springtodos.entity.ToDo;
import co.edu.utb.softeng.springtodos.service.ToDoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author william
 */
@Service
@Transactional
public class ToDoServiceImpl implements ToDoService{
    
    @Autowired
    ToDoDao dao;

    @Override
    public ToDo getToDoById(Long id) {
        return dao.getById(id);
    }

    @Override
    public List<ToDo> getAllToDos() {
        return dao.getAll();
    }
    
}
