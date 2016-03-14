/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utb.softeng.springtodos.controllers;

import org.springframework.stereotype.Controller;
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
    
    @RequestMapping(value={"","/"}, method = RequestMethod.GET)
    public @ResponseBody String test() {
        return "hello spring!";
    }
    
}
