package com.demo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ValueChangeEvent;

/**
 * 测试值变事件
 * @author yong.zhang
 *
 */
@ManagedBean(name="user")
@SessionScoped
public class UserBean {

	private String local="en";
	private String name;
	private String password;
	private String errMessage;
	private boolean flag = false;
	
	private double num = 10;
	
	public double getNum() {
		return num;
	}
	public void setNum(double num) {
		this.num = num;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getErrMessage() {
		return errMessage;
	}
	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}
	
	public void changeLocal(ValueChangeEvent e){
		System.out.println(1234+" >>>>>>>>");
		if (local.equals("en")) {
			local="zh";
		}else{
			local ="en";
		}
	}
	
	public String vertify(){
		System.out.println(flag);
		if ("admin".equals(name)&&"admin".equals(password)) {
			return "success";
		}else{
			errMessage="you name or password is wrong";
			return "fail";
					
		}
	}
}
