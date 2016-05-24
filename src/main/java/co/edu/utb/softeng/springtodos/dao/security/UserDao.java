/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utb.softeng.springtodos.dao.security;

import co.edu.utb.softeng.springtodos.entity.security.User;

/**
 *
 * @author william
 */
public interface UserDao {
    public User findByUserName(String username);
}
