<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <% 

    String path = request.getContextPath(); 

%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=path %>/dwr/jquery-1.8.1.min.js"></script> 
<script type="text/javascript" src="<%=path %>/dwr/engine.js"></script> 
<script type="text/javascript" src="<%=path %>/dwr/util.js"></script> 
  <script type="text/javascript">
        function clo () 
        {
            var obj = $("#msgDIV");
            obj.hide("slow");
        }
        function divShow(message) {
            $("#content").append("<div id='msgDIV' style='position: absolute;right: 2px;bottom: 20px;display:none;padding: 2px;width:200px;height: 200px;border: 1px solid black;'>");
            
            $("#msgDIV").append("<div id='close' style='cursor:hand' align='right' onclick='clo()'>close</div>");
            $("#msgDIV").append("<div id='msg' align='center'><font color='red'></font></div>");
            $("#msgDIV").append("<div align='right'><font color='bule'><a href='http://blog.163.com/girl_lihuiyue@126/blog/#'>click here to more</a></font></div>");
            $("#content").append("</div>");
            $("#msg").html("<p>"+message+"</p>");
            $("#msgDIV").show("slow");
        }
    </script>
    </head>
<body onload="dwr.engine.setActiveReverseAjax(true)">
    <div id="content">
        <input type="text" name="aa" id="aa" />
        <div id="bb" style="display: none; width: 300px; height: 300px">
        </div>        
    </div>
    </body>
</html>