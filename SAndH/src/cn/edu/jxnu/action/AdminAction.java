package cn.edu.jxnu.action;

import org.apache.struts2.interceptor.validation.SkipValidation;

import cn.edu.jxnu.entity.Admin;
import cn.edu.jxnu.service.AdminDao;
import cn.edu.jxnu.service.impl.AdminDaoImpl;

import com.opensymphony.xwork2.ModelDriven;

public class AdminAction extends SuperAction implements ModelDriven<Admin>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//因为是使用了模型驱动的方式
	private Admin user = new Admin();
	
	//用户登录动作
	public String login(){
		AdminDao udao = new AdminDaoImpl();
		if(udao.userLogin(user))
		{
			//使用session来保存登录成功的用户名
			session.setAttribute("loginUserName", user.getUsername());
			
			return "login_success";
		}
		else
		{
			return "login_failure";
		}
	}
	
	//在默认情况下，验证方法对其他的每一个方法都进行验证，而有些方法是不需要进行验证的，比如注销方法，那么可以加@SkipValidation ，表示不对注销进行验证。
	@SkipValidation
    //用户注销方法
	public String logout(){
		
		if(session.getAttribute("loginUserName")!=null){
			session.removeAttribute("loginUserName");
		}
		return "logout_success";
		//return "login_failure";
	}
	
	//进行用户登录信息的验证
	@Override
	public void validate() {
		//用户名不能为空
		if("".equals(user.getUsername().trim())){
			this.addFieldError("userNameError", "用户名不能为空！");
			
		}
		if(user.getPassword().length()<6){
			this.addFieldError("passwordError", "密码不能少于6位");
		}
	}
	
	@Override
	public Admin getModel() {
		// TODO Auto-generated method stub
		return user;
	}

	
}
