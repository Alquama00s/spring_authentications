package com.alquama.oauth.resource.resource_server.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PrivateApi {
    

    @GetMapping("/res")
    public Map<String,Object> getResource(){
        var resp = new HashMap<String,Object>();
        resp.put("res", "private");
        return resp;
    }

}
