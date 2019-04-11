<%@ page language="java"  contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"  content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
   <form action="getRole"  >
        id:<input type="text" name="id" /><br/>
  name:<input type="text" name ="name" /><br/>  
      age:<input type="text" name="age"><br/>
      角色1名字:<input type="text" name="roleList[0].name"><br/>
     角色1年龄:<input type="text" name="roleList[0].age"><br/>
       角色2名字:<input type="text" name="roleList[1].name"><br/>
      角色2年龄:<input type="text" name="roleList[1].age"><br/>
   <input type="submit" value="提交"/>
   </form>
   <a href="delete?createDate=2001-3-12">根据日期删除数据</a>
</body>
</html>