package com.cbcode.car_locator.service;

import com.cbcode.car_locator.domain.User;
import com.cbcode.car_locator.exception.domain.EmailExistException;
import com.cbcode.car_locator.exception.domain.UserNotFoundException;
import com.cbcode.car_locator.exception.domain.UsernameExistException;

import java.util.List;

public interface UserService {

    User register(String firstName, String lastName, String username, String email) throws UserNotFoundException, EmailExistException, UsernameExistException;

    List<User> getUsers();

    User findUserByUsername(String username);

    User findUserByEmail(String email);


}
