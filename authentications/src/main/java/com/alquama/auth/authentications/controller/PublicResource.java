package com.alquama.auth.authentications.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public/api")
public class PublicResource {
    
    @GetMapping("/resource")
    public Map<String,Object> getResource(){
        var resp = new HashMap<String,Object>();
        resp.put("resource", "public");
        return resp;
    }


}