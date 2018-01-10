package com.zes.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("index")
public class IndexController {
	
	@RequestMapping("/hello")
    @ResponseBody
    Map<String, Object> home() {
		Map<String, Object>  map = new HashMap<>();
		map.put("100", "success");
		List<String> sList = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			sList.add(String.valueOf(Math.random()));
		}
		map.put("data", sList);
        return map;
    }  
	
	@RequestMapping(value = "/login", produces = "text/html")
    String login(HttpServletRequest request) {

        return "/static/index";
    }  
}
