package com.login.loginAPI;

import com.login.loginAPI.User;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;


import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


@Transactional
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByEmail(String email);
    List<User>findByUsernameOrEmail(String username, String email);
    List<User> findByUsername(String username);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);


}