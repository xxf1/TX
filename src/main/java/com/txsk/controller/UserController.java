package com.txsk.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.txsk.model.User;
import com.txsk.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	
	@Resource
	private UserService userService;

	@RequestMapping("findOne")
	public String findOne(Map<String, Object> model, int id) {
		User user = userService.selectByPrimaryKey(id);
		if (user != null) {
			model.put("user", user);
			return "findone";

		} else {
			return "findonefail";
		}

	}

	@RequestMapping("findAll")

	public String findAll(Map<String, Object> model) {
		List<User> list = userService.selectAll();
		model.put("list", list);
		return "findall";
	}

	@RequestMapping("delete")
	public String delete(Map<String, Object> model, int id) {
		int i = userService.deleteByPrimaryKey(id);
		if (i != 0) {
			model.put("success", "success");
			return "deletesuccess";
		} else {
			model.put("fail", "fail");
			return "deletefail";
		}

	}

	@RequestMapping("save")
	public String save(Map<String, Object> model, User user) {
		if ((user.getUsername() == null || user.getUsername().isEmpty())
				|| (user.getPassword() == null || user.getPassword().isEmpty())) {
			model.put("fail", "fail");
			return "fail";
		} else {
			userService.insert(user);
			model.put("success", "success");
			return "save";
		}
	}

	@RequestMapping("update")
	public String update(Map<String, Object> model, User user) {
		int i = userService.updateByPrimaryKey(user);
		if (i != 0) {
			model.put("success", "success");
			return "updatesuccess";
		} else {
			model.put("fail", "fail");
			return "updatefail";
		}

	}

}
