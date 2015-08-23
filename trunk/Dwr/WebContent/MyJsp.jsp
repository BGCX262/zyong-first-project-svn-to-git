<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <% 

    String path = request.getContextPath(); 

%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=path %>/dwr/jquery-1.8.1.min.js"></script> 
<script type="text/javascript" src="<%=path %>/dwr/engine.js"></script> 
<script type="text/javascript" src="<%=path %>/dwr/util.js"></script> 
 
  <script type="text/javascript">    
    function test() {
        var msg = null;
        msg = {msgId: '1', context: $("#msgContext").val()};
        StocksPusher.sendMsg(msg);
        
    }
    </script>
  </head>  
  <body>
       <input type="text" name="msgId" id="msgId" /> <br />
       context : <input type="text" name="msgContext" id="msgContext" />
       <input type="button" value="Send" onclick="test()"  />       
  </body>
</html>