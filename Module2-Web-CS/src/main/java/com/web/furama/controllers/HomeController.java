package com.web.furama.controllers;

import com.web.furama.models.Authority;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.Principal;

@Controller
public class HomeController {

    @GetMapping("")
    public String getHome() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        for(GrantedAuthority role: auth.getAuthorities()) {
            if (role.getAuthority().equals("ROLE_ADMIN"))
                return "adminTemplates/home";
            else
                return "index";
        }
        return "index";
    }
}
