package com.cbcode.car_locator.repository;

import com.cbcode.car_locator.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByUsername(String username);

    User findUserByemail(String email);
}
