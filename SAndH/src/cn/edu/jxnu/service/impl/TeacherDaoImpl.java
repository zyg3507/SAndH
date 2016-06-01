package cn.edu.jxnu.service.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.edu.jxnu.db.MyHibernateSessionFactory;
import cn.edu.jxnu.entity.Student;
import cn.edu.jxnu.entity.Teacher;
import cn.edu.jxnu.service.StudentDao;
import cn.edu.jxnu.service.TeacherDao;

//教师业务逻辑的接口实现类
public class TeacherDaoImpl implements TeacherDao {

	
	
	//查询所有教师
	public List<Teacher> queryAllTeacher() {
		// TODO Auto-generated method stub
		Transaction tx = null;
		List<Teacher> list =null;
		String hql = "";
		
		try
		{
			Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			hql = "from Teacher";
			Query query = session.createQuery(hql);
			
			list = query.list();
			tx.commit();
			return list;
			
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			tx.commit();
			return list;
		}
		finally
		{
			if(tx!=null)
			{
				tx = null;
			}
		}
		
	}

	@Override
	public Teacher queryTeacherByTid(String tid) {
		// TODO Auto-generated method stub
		Transaction tx = null;
		Teacher t=null;
		
		try
		{
			Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			t = (Teacher) session.get(Teacher.class, tid);
			tx.commit();
			return t;	
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			tx.commit();
			return t;
		}
		finally
		{
			if(tx!=null)
			{
				tx = null;
			}
		}
		
	}

	@Override
	public boolean addTeacher(Teacher t) {
		// TODO Auto-generated method stub
		//设置学生的学号
		t.setTid(getNewTid());
		Transaction tx = null;
		
		try
		{
			Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			session.save(t);
			tx.commit();
			return true;
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			tx.commit();
			return false;
		}
		finally
		{
			if(tx!=null)
			{
				tx = null;
			}
		}
		
	}

	@Override
	public boolean updateTeacher(Teacher t) {
		// TODO Auto-generated method stub
		Transaction tx = null;
		
		try
		{
			Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			session.update(t);
			
			tx.commit();
			return true;
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			tx.commit();
			return false;
		}
		finally
		{
			if(tx!=null)
			{
				tx = null;
			}
		}
		
	}

	@Override
	public boolean deleteTeacher(String tid) {
		// TODO Auto-generated method stub
		Transaction tx = null;
		//String hql = "";	
		try
		{
			Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			Teacher t= (Teacher)session.get(Teacher.class,tid);
			session.delete(t);
			tx.commit();
			return true;
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			tx.commit();
			return false;
		}
		finally
		{
			if(tx!=null)
			{
				tx = null;
			}
		}
	}
	
	//生成教师的id
	private String getNewTid(){
		Transaction tx = null;
		String hql = "";
		String tid = null;
		try
		{
			Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			hql = "select max(tid) from Teacher";
			Query query = session.createQuery(hql);
			tid = (String)query.uniqueResult();
			if(tid==null||"".equals(tid))
			{
				//相当于此时数据库没有任何一条记录，那么给一个最大的编号
				tid = "T0000001";
			}
			else
			{
				String temp = tid.substring(1);  //取到后面七位
				int i = Integer.parseInt(temp);
				i++;
				//再还原成字符串
				temp = String.valueOf(i);
				int len = temp.length();
				
				//凑够七位
				for(int j=0;j<7-len;j++)
				{
					temp = "0"+ temp;
					tid="S"+temp;
					
				}				
			}
			tx.commit();
			return tid;
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			tx.commit();
			return null;
		}
		finally
		{
			if(tx!=null)
			{
				tx = null;
			}
		}
	}
	

}
