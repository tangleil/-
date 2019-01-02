package com.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.domain.User;
import com.service.UserService;

@Controller
public class UserController {
	/*@Autowired
	@Qualifier("userService")*/
	@Resource(name="UserService")
	UserService userService;
	
	/***
	 * 获取所有用户信息
	 */
	@RequestMapping("/getalluser")
	public String getAllUser(HttpServletRequest request) {
		User list=userService.getAllUser();
		request.setAttribute("list", list);
		return "test";
	}
}
