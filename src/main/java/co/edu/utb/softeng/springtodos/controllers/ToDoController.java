/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utb.softeng.springtodos.controllers;

import co.edu.utb.softeng.springtodos.entity.ToDo;
import co.edu.utb.softeng.springtodos.service.ToDoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author william
 */
@Controller
@RequestMapping("/todo")
public class ToDoController {
    
    @Autowired
    ToDoService service;
    
    @RequestMapping(value={"/", ""}, method = RequestMethod.GET)
    public @ResponseBody List<ToDo> getAll() {
        return service.getAllToDos();
    }
    
    @RequestMapping(value={"/{id}"}, method = RequestMethod.GET)
    public @ResponseBody ToDo getById(@PathVariable Long id) {
        return service.getToDoById(id);
    }
    
    @Secured("ROLE_ADMIN")
    @RequestMapping(value={"/", ""}, method = RequestMethod.POST)
    public @ResponseBody ToDo createToDo(@RequestBody ToDo todo) {
        todo = service.saveOrUpdate(todo);
        return todo;
    }
    
    @Secured("ROLE_ADMIN")
    @RequestMapping(value={"/", ""}, method = RequestMethod.PUT)
    public @ResponseBody ToDo updateToDo(@RequestBody ToDo todo) {
        todo = service.saveOrUpdate(todo);
        return todo;
    }
    
    @RequestMapping(value={"/{id}"}, method = RequestMethod.DELETE)
    public @ResponseBody Long deleteToDo(@PathVariable Long id) {
        service.delete(id);
        return id;
    }
    
}
