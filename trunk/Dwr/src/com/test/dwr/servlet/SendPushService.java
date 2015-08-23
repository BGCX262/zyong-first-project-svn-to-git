package com.test.dwr.servlet;

import org.directwebremoting.Browser;
import org.directwebremoting.ScriptBuffer;
import org.directwebremoting.ScriptSession;
import org.directwebremoting.WebContext;
import org.directwebremoting.WebContextFactory;
import org.directwebremoting.proxy.dwr.Util;

public class SendPushService {   
    //发送消息 
	@SuppressWarnings("unchecked")
    public void send(String msg) {   
        System.out.println("==========调用了send方法==========");   
        ScriptBuffer scriptBuffer = new ScriptBuffer(); //构造js脚本   
        WebContext webContext=WebContextFactory.get();   
        ScriptSession myScSession = webContext.getScriptSession();   
        scriptBuffer.appendScript("dwrtest(");   
        scriptBuffer.appendData(msg);   
        scriptBuffer.appendScript(")");   
        @SuppressWarnings("deprecation")
		Util util = new Util(myScSession);   
        util.addScript(scriptBuffer); //向客户端推送消息   
    }   
	
    ScriptBuffer scriptBuffer = new ScriptBuffer(); //构造js脚本   
    public void send1(String msg){     
           System.out.println("==========调用了send1方法==========");   
           WebContext webContext=WebContextFactory.get();   
           final ScriptSession myScSession = webContext.getScriptSession();   
           scriptBuffer.appendScript("dwrtest(");   
           scriptBuffer.appendData(msg);   
           scriptBuffer.appendScript(")");   
           /**向访问当前页面响应js函数**/  
          Browser.withCurrentPage(new Runnable() {      
               public void run() {   
                   myScSession.addScript(scriptBuffer);   
               }});   
           }  
}