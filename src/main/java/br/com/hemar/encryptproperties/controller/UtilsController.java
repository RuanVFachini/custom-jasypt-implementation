package br.com.hemar.encryptproperties.controller;

import br.com.hemar.encryptproperties.repository.UserRepository;
import org.jasypt.encryption.StringEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/utils")
public class UtilsController {

    @Autowired
    StringEncryptor stringEncryptor;

    @GetMapping("/encrypt/{string}")
    public String getAll(@PathVariable("string") String string) {
        return stringEncryptor.encrypt(string);
    }
}
