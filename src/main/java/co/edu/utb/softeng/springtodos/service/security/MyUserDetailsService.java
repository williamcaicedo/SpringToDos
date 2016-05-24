/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utb.softeng.springtodos.service.security;

import co.edu.utb.softeng.springtodos.dao.security.UserDao;
import co.edu.utb.softeng.springtodos.entity.security.UserRole;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author william
 */

@Service("userDetailsService")
public class MyUserDetailsService implements UserDetailsService{
    @Autowired
    private UserDao userDao;

    @Transactional(readOnly = true)
    @Override
    public UserDetails loadUserByUsername(String username) {
         co.edu.utb.softeng.springtodos.entity.security.User user = userDao.findByUserName(username);
         return buildSpringUser(user, convertRoles(user.getRoles()));
    }
    
    
    private List<GrantedAuthority> convertRoles(Set<UserRole> roles) {
        List<GrantedAuthority> authorities = new ArrayList<>();
        for (UserRole r : roles) {
            authorities.add(new SimpleGrantedAuthority("ROLE_"+r.getRole()));
        }
        return authorities;
    }
    
    private User buildSpringUser(co.edu.utb.softeng.springtodos.entity.security.User user, List<GrantedAuthority> authorities) {
        return new User(user.getUsername(), user.getPassword(), user.isEnabled(), true, true, true, authorities);
    }
    
    
    
    
}
