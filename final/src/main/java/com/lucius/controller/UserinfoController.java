package com.lucius.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lucius.entity.Tree;
import com.lucius.entity.Userinfo;
import com.lucius.service.IUserinfoService;

@Controller
public class UserinfoController {
	@Resource
	IUserinfoService userinfoServiceImpl;
	@RequestMapping("/login")
	public String login(Userinfo userinfo,ModelMap map,HttpSession session) throws JsonProcessingException {
		Userinfo info = userinfoServiceImpl.login(userinfo);
		System.out.println(info+"==============");
		if(info == null) return "redirect:/";
		List<Tree> trees = info.getTrees();
		ObjectMapper om = new ObjectMapper();
		String json = om.writeValueAsString(trees);
		session.setAttribute("json", json);
		session.setAttribute("info", info);
		return "redirect:/admin/index.jsp";
	}
}
