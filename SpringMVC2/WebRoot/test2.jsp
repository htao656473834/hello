<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <title>这是一个提交表单</title>
  
  </head>
  
  <body>
  <a href="hello">连接</a>
  <form action="fileUpload" method="post" enctype="multipart/form-data">
     文件名:<input  type="text" name="imageName" /><br/>
                 <input   type="file" name="uploadFile"  value="选择文件"/><br/>
             <input   type="submit"  value="上传" />
  </form>
  </body>
</html>
