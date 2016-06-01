package cn.edu.jxnu.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;

//所有Action的父类
//为了实现扩展的过滤器以及它的拦截器功能，继承struts2的ActionSupport类 ，实现三个接口是为了方便获得内置对象
public class SuperAction extends ActionSupport implements ServletRequestAware,ServletResponseAware,ServletContextAware{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected  HttpServletRequest request;//请求对象
	protected  HttpServletResponse response;//响应对象
	protected  HttpSession session;//会话对象
	protected  ServletContext application;//全局对象
	
	

	@Override
	public void setServletContext(ServletContext application) {
		// TODO Auto-generated method stub
		this.application = application;
	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		// TODO Auto-generated method stub
		this.response = response;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request = request;
		//获取会话对象
		this.session = this.request.getSession();
	}

}
