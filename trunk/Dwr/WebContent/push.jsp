<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <% 

    String path = request.getContextPath(); 

%> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="<%=path %>/dwr/jquery-1.8.1.min.js"></script> 
<script type="text/javascript" src="<%=path %>/dwr/engine.js"></script> 
<script type="text/javascript" src="<%=path %>/dwr/util.js"></script> 
<script type="text/javascript" src="<%=path %>/dwr/interface/SendPushService.js"></script> 
 
  <script type="text/javascript">  
        function hello(){   
            SendPushService.send1("第一个dwr推程序");   
        }   
        /**由dwr在后台调用这个方法**/   
        function dwrtest(data){   
            alert(data);   
        }   
    </script>  
    <title>第一个dwr推程序</title>  
  </head>  
  <body onload="dwr.engine.setActiveReverseAjax(true);">  
    <input type="button" value="点击我" onclick="hello();" />      
  </body>  
</html>  