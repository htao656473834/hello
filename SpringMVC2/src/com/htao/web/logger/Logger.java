package com.htao.web.logger;

public class Logger {

	public void before(){
		System.out.println("这是前置通知");
	}
	public void after(){
		System.out.println("这是后置通知");
	}
	public void afterReturning(){
		System.out.println("这是最终通知");
	}
	public void afterThrowing(){
		System.out.println("这是异常通知");
	}
}
