package com.htao.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.htao.web.pojo.Role;

public interface RoleService {
	 /**
	  * 按Id查询
	  * @param ids
	  * @return
	  */
	 Role getById(int id);
	/**
	 * 保存实体
	 * @param id
	 */
	void save(Role entity);
	/**
	 * 删除实体
	 * @param entity
	 */
	void delete(int  id);
}
