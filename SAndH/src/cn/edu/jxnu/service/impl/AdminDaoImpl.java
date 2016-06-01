package cn.edu.jxnu.service.impl;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.edu.jxnu.db.MyHibernateSessionFactory;
import cn.edu.jxnu.entity.Admin;
import cn.edu.jxnu.service.AdminDao;

public class AdminDaoImpl implements AdminDao {

	@Override
	public boolean userLogin(Admin u) {
		//事务对象
		Transaction tx = null;
		String hql = "";
		
		try{
			Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
		    tx =  session.beginTransaction();
		    //注意是from User 而不是user  是从类中查询不是从数据库表查询
			hql = "from Admin where username=? and password=?";
		    //创建一个query对象
		    Query query = session.createQuery(hql);
		   // System.out.println(u.getPassword());
		    query.setParameter(0, u.getUsername());
		    query.setParameter(1, u.getPassword());
		    //查询结果是返回一个list
		    List list = query.list();
		    tx.commit();
		    if(list.size()>0)
		    {
		    	return true;
		    }
		    else
		    {
		    	return false;
		    }
		
		}catch(Exception ex){
			ex.printStackTrace();
			return false;
		}finally{
			if(tx != null){
			tx = null;
			}
		}
		
	}

}
