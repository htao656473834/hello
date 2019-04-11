package com.htao.web.service.impl;


import java.util.Date;

import org.springframework.stereotype.Service;

import com.htao.web.pojo.Role;
import com.htao.web.service.RoleService;
@Service
public class RoleServiceImpl  implements RoleService{
	@Override
	public Role getById(int  id) {
		Role role = new Role();
		Date date =new Date();
	 if(id ==5){
		 role.setId(id);
		 role.setAge(25);
		 role.setName("张三");
	 }
		return role;
	}
	@Override
	public void save(Role entity) {
		System.out.println("保存了shiti"+entity.toString());
		
	}

	@Override
	public void delete(int id) {
		System.out.println("删除了"+id+"号实体");
	
		
	}

	

}
