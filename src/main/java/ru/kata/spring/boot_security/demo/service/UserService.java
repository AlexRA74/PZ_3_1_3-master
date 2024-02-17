package ru.kata.spring.boot_security.demo.service;




import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findUserById(Long id);

    void updateUser(User updateUser, Long id);

    void saveUser(User user);

    void deleteUserById(long id);


    Object show(Model model);

    User getById(Long id);

    User findUserByUsername(String username);

    @Transactional
    void save(User user);

    @Transactional
    void deleteById(Long id);

    @Transactional
    void update(User updatedUser);

    @Transactional(readOnly = true)
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}