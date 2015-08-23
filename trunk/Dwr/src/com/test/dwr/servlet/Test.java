package com.test.dwr.servlet;

import java.util.Collection;

import org.directwebremoting.WebContext;
import org.directwebremoting.WebContextFactory;
import org.directwebremoting.proxy.dwr.Util;

import com.test.dwr.bean.Message;

public class Test {

	public void sendMsg(Message msg){
		WebContext wctx = WebContextFactory.get();

		String clientPage = "/dwr/index.jsp";//推倒哪个页面
		Collection sessions = wctx.getScriptSessionsByPage(clientPage);
		Util utilAll = new Util(sessions);
		String ss = msg.getContext();
		utilAll.setValue("aa", ss);
		utilAll.setStyle("bb", "display", "inline");
		utilAll.setValue("bb", "<p>"+msg.getContext()+"</p>",false);
		utilAll.addFunctionCall("divShow",msg.getContext());
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
