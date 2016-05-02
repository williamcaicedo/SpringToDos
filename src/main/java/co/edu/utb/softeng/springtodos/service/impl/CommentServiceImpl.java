/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utb.softeng.springtodos.service.impl;

import co.edu.utb.softeng.springtodos.dao.CommentDao;
import co.edu.utb.softeng.springtodos.entity.Comment;
import co.edu.utb.softeng.springtodos.service.CommentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author william
 */
public class CommentServiceImpl implements CommentService{
    
    @Autowired
    CommentDao dao;

    @Override
    public Comment getCommentById(Long id) {
        return dao.getById(id);
    }

    @Override
    public List<Comment> getAllComments() {
        return dao.getAll();
    }
    
}
