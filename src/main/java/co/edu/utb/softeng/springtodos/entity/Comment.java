/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utb.softeng.springtodos.entity;

import java.io.Serializable;

/**
 *
 * @author william
 */

public class Comment implements Serializable {

   
    private Long id;
    

    private String text;
    
    private ToDo toDo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    
}
