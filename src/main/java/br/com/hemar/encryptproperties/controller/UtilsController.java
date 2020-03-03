package br.com.hemar.encryptproperties.controller;

import org.jasypt.encryption.StringEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/utils")
public class UtilsController {

    @Autowired
    StringEncryptor stringEncryptor;

    @GetMapping("/encrypt/{string}")
    public String getAll(@RequestParam String string) {
        return stringEncryptor.encrypt(string);
    }
}
