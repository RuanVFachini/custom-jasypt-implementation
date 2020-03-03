package br.com.hemar.encryptproperties.controller;

import br.com.hemar.encryptproperties.model.User;
import br.com.hemar.encryptproperties.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping("/")
    public Long save(@RequestBody User user) {
        return userRepository.save(user).getId();
    }
}
