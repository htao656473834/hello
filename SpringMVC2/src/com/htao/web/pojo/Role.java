package com.htao.web.pojo;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import java.util.List;

public class Role implements Serializable {

	private int id;
	private String name;
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + ", age=" + age +"]";
	}

}

