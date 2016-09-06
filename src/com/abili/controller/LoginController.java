package com.abili.controller;


import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicInterface2;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.TestContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.abili.model.User;
import com.abili.model.Work;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("/Login")
public class LoginController {

	@RequestMapping("/hello")
	public ModelAndView showLoginPage() {
		ModelAndView modelAndView = new  ModelAndView("/Login");
			
		return modelAndView;
	}
	
	
	@RequestMapping(value="/formcommit",method= RequestMethod.POST)
	public void getPerson1(PrintWriter pw){
		
		Work work = new Work();
		work.setName("zhangyuhang");
		work.setPassword("123456");
		work.setUsername("zhangyuhang359294760"); 
		Work work1 = new  Work();
		work1.setName("zhangyuhang2");
		work1.setPassword("654321");
		work1.setUsername("zhangyuhang359294760");
		JSONObject jsonObject = new JSONObject();
		HashMap<String, Work> map = new HashMap<String,Work>();
		map.put("work", work);
		map.put("work1", work1);
		jsonObject.put("a", map);
		System.out.println(jsonObject.toString());
		pw.write(jsonObject.toString());
	}

	@RequestMapping("/getPerson")
	public void getPerson(PrintWriter pw){
		pw.write("aaa");
	}
}
