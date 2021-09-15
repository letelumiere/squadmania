package com.likeurator.squadmania.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.likeurator.squadmania.domain.model.Role;
import com.likeurator.squadmania.domain.model.User;
import com.likeurator.squadmania.domain.repository.RoleRepository;
import com.likeurator.squadmania.domain.repository.UserRepository;
import com.mongodb.crypt.capi.MongoCrypt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service 
@RequiredArgsConstructor @Transactional @Slf4j
public class UserService implements UserDetailsService {
    @Autowired private final UserRepository userRepository;
    @Autowired private final RoleRepository roleRepository;
    @Autowired private final PasswordEncoder passwordEncoder;
    //@Autowired private final MongoCrypt mongoCrypt;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findUserByUsername(username);
        if(user == null){
            log.error("User not found in the database");
            throw new UsernameNotFoundException("User not found in the database");
        }else{
            log.info("User found in the database {}", username);
        }
        Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
        user.getRoles().forEach(role -> {
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        });
        log.info("authorities are {}", authorities);
        log.info("authorities are {}", user.toString());

        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), authorities);
    }

    public void addToRoleToUser(String username, String roleName){
        User user = userRepository.findUserByUsername(username); //_id로 해야 하나?
        Role role = roleRepository.findRolebyName(roleName);
        user.getRoles().add(role);
    }

    public User getUser(String username){
        log.info("Fetching user {}", username);
        return userRepository.findUserByUsername(username);
    }

    public List<User>getUsers(){
        log.info("Fetching all users");
        return userRepository.findAll();
    }
    public User saveUser(User user){
        log.info("Saving new user {} to the database", user.getUsername());
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public Role saveRole(Role role){
        log.info("Saving new role {} to the database", role.getName());
        return roleRepository.save(role);
    }

}