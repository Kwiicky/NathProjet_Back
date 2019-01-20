package com.nathprojet.login;

import com.nathprojet.login.dao.LoginBean;
import com.nathprojet.login.dao.LoginRepository;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.util.Assert.notNull;

/**
 * Created by FP13694 on 20/01/2019.
 */
@Service
public class LoginService {

  LoginRepository loginRepository;

  public LoginService(LoginRepository loginRepository) {
    notNull(loginRepository, "loginRepository can't be null");
    this.loginRepository = loginRepository;
  }

  public Iterable<LoginBean> findAll(){
    return loginRepository.findAll();
  }

}
