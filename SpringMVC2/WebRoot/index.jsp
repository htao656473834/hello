<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <title>这是一个提交表单</title>
  <script src="js/jquery-1.9.1.js"></script>
    
  </head>
  
  <body>
  <a href="role">连接</a>
  <input type="button"  id="btn" value="提交" onclick="sendJson()">
  <form action="role" method="post">
     用户名:<input  type="text" name="name" /><br/>
     年龄:  <input   type="text" name="age"/><br/>
             <input   type="submit"  value="提交" />
  </form>
    <script type="text/javascript">
      function  sendJson(){
    	  $.ajax({
        	  type:"post",
        	  url:"${pageContext.request.contextPath}/role",
              data:	'{"id":"1","name":"萧","age":"15"}',
        	  contentType:"application/json;charset=utf-8",
        	  success:function(data){
        		  alert(data.id+data.name);
        	  }
          });
      }
      </script>
  </body>
</html>
