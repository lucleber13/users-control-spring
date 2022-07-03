package com.cbcode.car_locator.resource;

import com.cbcode.car_locator.exception.ExceptionHandling;
import com.cbcode.car_locator.exception.domain.UserNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = {"/","/user"})
public class UserResource extends ExceptionHandling {

    @GetMapping("/home")
    public String showUser() throws UserNotFoundException {
        //return "KKKKKKKKKKK";
        throw new UserNotFoundException("The user was not found!");

    }

}
