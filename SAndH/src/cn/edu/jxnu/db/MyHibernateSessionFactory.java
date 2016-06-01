package cn.edu.jxnu.db;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MyHibernateSessionFactory {

	private static SessionFactory sessionFactory;  //会话工厂
	
	//构造方法私有化，目的是保证单例模式
	private MyHibernateSessionFactory(){
		
	}
	
	//公有的静态方法，来获取会话工厂对象
	public static SessionFactory getSessionFactory(){
		if(sessionFactory == null){
			Configuration cfg = new Configuration().configure();
			@SuppressWarnings("deprecation")
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			return sessionFactory;
		}else{
			return sessionFactory;
		}
	}
	
}
