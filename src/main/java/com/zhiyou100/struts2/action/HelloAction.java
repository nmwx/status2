package com.zhiyou100.struts2.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class HelloAction extends ActionSupport {
	@Override
	public String execute() throws Exception{
//		HttpServletRequest request  = ServletActionContext.getRequest();
//		HttpServletResponse response = ServletActionContext.getResponse();
//		HttpSession session = request.getSession();
//		ServletContext application = ServletActionContext.getServletContext();
		return "text";
	}
}
