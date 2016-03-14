/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utb.softeng.springtodos.service;

import co.edu.utb.softeng.springtodos.entity.ToDo;
import java.util.List;

/**
 *
 * @author william
 */
public interface ToDoService {
    
    public ToDo getToDoById(Long id);
    public List<ToDo> getAllToDos();
    
}
