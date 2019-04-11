package com.htao.web.controller;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.htao.web.pojo.Role;
import com.htao.web.service.RoleService;
import com.htao.web.service.impl.RoleServiceImpl;

@Controller("helloController")
public class HelloController {
   @Resource
	private  RoleService  roleServiceImpl  ;
	
	
	@RequestMapping("/hello")
	public String hello(HttpServletRequest request,HttpServletResponse response) {
		Cookie cook =new Cookie("key","value");
		response.addCookie(cook);
		System.out.println("你好");
		return "redirect:/index.jsp";
	}

	@RequestMapping("/test")
	public ModelAndView test(String name, int age) {
		ModelAndView mode = new ModelAndView();
		System.out.println("name:" + name + "age:" + age + "拦截成功!");
		mode.setViewName("error");
		return mode;
	}
	@RequestMapping("/getRole")
	@ResponseBody
	public ModelAndView deleteRole(Role role,@RequestParam(value="name",defaultValue="小张")  String myname){
		System.out.println(myname);
//		List<Role>  list = role.getRoleList();
//		for (Role role2 : list) {
//			System.out.println(role2.getName()+"-->"+role2.getAge());
//		}
		ModelAndView  mv =new ModelAndView();
		mv.setViewName("success");
		mv.addObject("role", role);	

		return mv;
	}
	@RequestMapping("/delete")
	public String delete(Role date){
		System.out.println("执行了删除操作");
		return "success";
	}
	@RequestMapping("/role")
	public 	@ResponseBody Role getRole( @RequestBody Role role){
		Role role1 = new Role();
		role1 = roleServiceImpl.getById(5);
		System.out.println(role);
		role.setName("haha");
		System.out.println("hello ");
		return role;
		
	}
}
