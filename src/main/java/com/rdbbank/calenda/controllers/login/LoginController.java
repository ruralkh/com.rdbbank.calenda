package com.rdbbank.calenda.controllers.login;

import com.rdbbank.calenda.models.secusers.SecRole;
import com.rdbbank.calenda.models.secusers.SecUser;
import com.rdbbank.calenda.repositories.secuser.RoleRepository;
import com.rdbbank.calenda.services.secuser.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * Create By: Ron Rith
 * Create Date on: 12/11/2018.
 */
@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Value("${welcome.message:test}")
    private String message = "Hello World";

    @RequestMapping(value={"/login"}, method = RequestMethod.GET)
    public ModelAndView login(){
        List<SecRole> roles = (List<SecRole>) roleRepository.findAll();
        List<SecUser> secUsers = userService.findAllUsers();

        if (roles == null || roles.size() <= 0) {
            SecRole role = new SecRole();
            role.setName("ADMIN");
            roleRepository.save(role);
        }

        if (secUsers == null || secUsers.size() < 3) {
            isSaveDefaultUser();
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/login/login");
        return modelAndView;
    }


    @RequestMapping(value="/registration", method = RequestMethod.GET)
    public ModelAndView registration(){
        ModelAndView modelAndView = new ModelAndView();
        SecUser secUser = new SecUser();
        modelAndView.addObject("secUser", secUser);
        modelAndView.setViewName("registration");
        return modelAndView;
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public ModelAndView createNewUser(@Valid SecUser secUser, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView();
        SecUser secUserExists = userService.findUserByEmail(secUser.getEmail());
        if (secUserExists != null) {
            bindingResult
                    .rejectValue("email", "error.secUser",
                            "There is already a secUser registered with the email provided");
        }
        if (bindingResult.hasErrors()) {
            modelAndView.setViewName("registration");
        } else {
            userService.saveUser(secUser);
            modelAndView.addObject("successMessage", "SecUser has been registered successfully");
            modelAndView.addObject("secUser", new SecUser());
            modelAndView.setViewName("registration");

        }
        return modelAndView;
    }

    @RequestMapping(value="/admin", method = RequestMethod.GET)
    public ModelAndView home(ModelMap modelMap){
        modelMap.put("message",this.message);

        ModelAndView modelAndView = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        SecUser secUser = userService.findUserByEmail(auth.getName());
        modelAndView.addObject("userName", "Welcome " + secUser.getName() + " " + secUser.getLastName() + " (" + secUser.getEmail() + ")");
        modelAndView.addObject("adminMessage","Content Available Only for Users with Admin Role");
        modelAndView.setViewName("admin/admin");
        return modelAndView;
    }

    private boolean isSaveDefaultUser() {
        List<SecUser> secUsersDefaul = getDefaultUser();
        for (SecUser secUser : secUsersDefaul) {
            userService.saveUser(secUser);
        }
        return true;
    }

    private List<SecUser> getDefaultUser(){
        List<SecUser> secUsers = new ArrayList<>();
        SecUser secUser = new SecUser();
        SecUser secUserUser = new SecUser();
        SecUser secUserAdmin = new SecUser();

        secUser.setName("Rith");
        secUser.setLastName("Ron");
        secUser.setEmail("rithronlkh@gmail.com");
        secUser.setActive(1);
        secUser.setPassword("123456");

        secUserUser.setName("User");
        secUserUser.setLastName("User");
        secUserUser.setEmail("user@gmail.com");
        secUserUser.setActive(1);
        secUserUser.setPassword("123456");

        secUserAdmin.setName("Admin");
        secUserAdmin.setLastName("Admin");
        secUserAdmin.setEmail("admin@gmail.com");
        secUserAdmin.setActive(1);
        secUserAdmin.setPassword("123456");

        secUsers.add(secUser);
        secUsers.add(secUserUser);
        secUsers.add(secUserAdmin);

        return secUsers;
    }
}
