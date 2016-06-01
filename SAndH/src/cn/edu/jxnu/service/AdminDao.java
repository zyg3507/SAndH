package cn.edu.jxnu.service;

import cn.edu.jxnu.entity.Admin;

//用户业务逻辑接口
public interface AdminDao {

	//用户登录方法
	public boolean userLogin(Admin u);
	
	
}
