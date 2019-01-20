package com.nathprojet.login;

import com.nathprojet.login.dao.LoginBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by FP13694 on 20/01/2019.
 */
@Controller    // This means that this class is a Controller
@RequestMapping(path="/login")
public class LoginController {

  LoginService loginService;

  public LoginController(LoginService loginService) {
    this.loginService = loginService;
  }

  @GetMapping()
  @ResponseBody
  public Iterable<LoginBean> getParUserRight() {
    return loginService.findAll();
  }


}
