package com.portal.matricula.sistema.controller;


import com.portal.matricula.sistema.model.Login;
import com.portal.matricula.sistema.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/login")
public class LoginController {

    private final LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping("/{id}")
    public Login getLoginById(@PathVariable Integer id) {
        return loginService.getLoginById(id);
    }

    @GetMapping("/all")
    public List<Login> getAllLogins() {
        return loginService.getAllLogins();
    }

    @PostMapping("/create")
    public Login createLogin(@RequestBody Login login) {
        return loginService.createLogin(login);
    }

    @PutMapping("/update/{id}")
    public Login updateLogin(@PathVariable Integer id, @RequestBody Login login) {
        return loginService.updateLogin(id, login);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteLogin(@PathVariable Integer id) {
        loginService.deleteLogin(id);
    }
}

