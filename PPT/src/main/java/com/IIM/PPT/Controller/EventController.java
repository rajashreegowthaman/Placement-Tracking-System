package com.IIM.PPT.Controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EventController {

	    @RequestMapping("/PPT")
	    public String home(Map<String,Object> model) {      
	        return "home"; 
	    }

	}
	

