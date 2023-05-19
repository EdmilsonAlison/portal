

package com.portal.matricula.sistema.service;

import com.portal.matricula.sistema.model.Login;
import com.portal.matricula.sistema.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoginService {

    private final LoginRepository loginRepository;

    @Autowired
    public LoginService(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    public Login getLoginById(Integer id) {
        Optional<Login> optionalLogin = loginRepository.findById(id);
        return optionalLogin.orElse(null);
    }

    public List<Login> getAllLogins() {
        return loginRepository.findAll();
    }

    public Login createLogin(Login login) {
        return loginRepository.save(login);
    }

    public Login updateLogin(Integer id, Login updatedLogin) {
        Optional<Login> optionalLogin = loginRepository.findById(id);
        if (optionalLogin.isPresent()) {
            Login login = optionalLogin.get();
            login.setNome(updatedLogin.getNome());
            login.setSenha(updatedLogin.getSenha());
            return loginRepository.save(login);
        }
        return null;
    }

    public void deleteLogin(Integer id) {
        loginRepository.deleteById(id);
    }
}
