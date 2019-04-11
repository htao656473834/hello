package com.htao.web.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;



import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
@Controller
public class FileUploadController {

	/**
	 * springmvc提供的文件上传
	 * @throws IOException 
	 * @throws IllegalStateException 
	 */
	@RequestMapping("/fileUpload")
	public String testFileUpload(String imageName,MultipartFile uploadFile,HttpServletRequest request) throws IllegalStateException, IOException{
		System.out.println("文件上传的方法都执行了");
		//1 获取文件的保存路径
		String basePath = request.getServletContext().getRealPath("/WEB-INF/uploads");
		//2 为了防止文件夹文件过多,使用当天日期创建的一个二级目录
		String datePath = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		//3 判断文件是否存在 使用当天日期创建一个二级目录
		File file = new File(basePath,datePath);
		if(!file.exists()){
			file.mkdirs();
		}
		//4 获取文件名
		String fileName=uploadFile.getOriginalFilename();
		//5 随机化文件名
		String uuid =UUID.randomUUID().toString().replace("-", " ").toUpperCase();
		fileName =uuid+"_"+fileName ; 
		//6 把文件写道指定的位置 
		uploadFile.transferTo(new File(file,fileName));
		 return "success";
	}
	 @RequestMapping("/hello1")
		public String hello1() {
			System.out.println("你好");
			return "error";
		}
} 
