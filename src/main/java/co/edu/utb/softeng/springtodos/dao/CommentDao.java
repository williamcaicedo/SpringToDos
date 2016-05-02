/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utb.softeng.springtodos.dao;

import co.edu.utb.softeng.springtodos.entity.Comment;
import java.util.List;

/**
 *
 * @author william
 */
public interface CommentDao {
    public Comment getById(Long id);
    public List<Comment> getAll();
}
