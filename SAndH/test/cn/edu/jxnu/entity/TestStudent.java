package cn.edu.jxnu.entity;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import org.junit.Test;

public class TestStudent {

	//用于输出建表的结构
	@Test
	public void testSchemaExport(){
		/*//创建配置对象
		Configuration cfg  = new Configuration().configure();
		//创建服务注册对象
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(cfg);
		//创建sessionFactory
		SessionFactory sessionFactory  = cfg.buildSessionFactory(serviceRegistry);
		//创建session对象
		Session session = sessionFactory.getCurrentSession();
		//创建SchemaExport对象
		SchemaExport export = new SchemaExport(cfg);
		export.create(true, true);*/
		
		Configuration cfg = new Configuration().configure();
		SchemaExport export = new SchemaExport(cfg);
		export.create(true, true);

	}
	
	//写一个方法来添加测试数据
	@Test
	public void testSaveStudent(){
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.getCurrentSession();
		Transaction tx = session.beginTransaction();
		Student s1 = new Student("S0000001","张三丰","男",new Date(),"武当山","1367003251");
		Student s2 = new Student("S0000002","郭靖","男",new Date(),"桃花岛","1367003252");
		Student s3 = new Student("S0000003","黄蓉","女",new Date(),"桃花岛","1367003251");
		
		session.save(s1);
		session.save(s2);
		session.save(s3);
		
		tx.commit();
		
	}
}



















