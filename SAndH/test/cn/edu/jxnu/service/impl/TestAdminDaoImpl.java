package cn.edu.jxnu.service.impl;

import junit.framework.Assert;

import org.junit.Test;

import cn.edu.jxnu.entity.Admin;
import cn.edu.jxnu.service.AdminDao;

public class TestAdminDaoImpl {

	@Test
	public void testAdminLogin(){
		Admin u = new Admin(1,"zhangsan","123456");
	/*	u.setUseruame("zhangsan");
		u.setPassword("123456");*/
		AdminDao udao = new AdminDaoImpl();
		udao.userLogin(u);
		//Assert.assertEquals(true, udao.userLogin(u));
	}
}
