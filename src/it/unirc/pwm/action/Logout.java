package it.unirc.pwm.action;

import java.util.Map;


import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;



public class Logout extends ActionSupport implements SessionAware{

	private static final long serialVersionUID = 1L;
	
	private Map<String,Object> session; 

	
	public Map<String, Object> getSession() {
		return session;
	}

	

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	

	public String execute(){
		
		session.clear();
		session.remove("utente");
		session.remove("account");
		return SUCCESS;
	}



}