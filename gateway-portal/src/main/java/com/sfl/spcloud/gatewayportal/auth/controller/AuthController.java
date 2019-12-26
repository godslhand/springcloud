package com.sfl.spcloud.gatewayportal.auth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author songfenglai
 */
@RestController
@RequestMapping("/auth")
public class AuthController {

    @RequestMapping("/message/show")
    public Object showMsg(){
        return new Date();
    }
}
