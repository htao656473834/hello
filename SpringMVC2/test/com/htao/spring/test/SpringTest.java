package com.htao.spring.test;

import  org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.htao.web.pojo.Role;
import com.htao.web.service.RoleService;
import com.htao.web.service.impl.RoleServiceImpl;

public class SpringTest {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        
//		RoleService  roleService = (RoleService) ac.getBean("roleServiceImpl");
		RoleService  roleServiceImpl =  (RoleService) ac.getBean("roleServiceImpl");
		Role role = new Role();
//		role=roleServiceImpl.getById(5l);
//		System.out.println(role);
		role =roleServiceImpl.getById(5);
		System.out.println(role);
		}
	}
	

	
	

