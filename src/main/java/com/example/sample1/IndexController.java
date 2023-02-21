package com.example.sample1;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @GetMapping(path = "/")
    public Map<String, String> index() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("message", "Hello World.");
        return map;
    }    
}
