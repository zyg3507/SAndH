package cn.edu.jxnu.service.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.edu.jxnu.db.MyHibernateSessionFactory;
import cn.edu.jxnu.entity.Student;
import cn.edu.jxnu.service.StudentDao;

//学生业务逻辑的接口实现类
public class StudentDaoImpl implements StudentDao {

	//学生登录
	@Override
	public boolean stuLogin(Student stu) {
		// TODO Auto-generated method stub
		//事务对象
		Transaction tx = null;
		String hql = "";
		try{
			Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
		    tx =  session.beginTransaction();
		    //注意是from User 而不是user  是从类中查询不是从数据库表查询
			hql = "from Student where sname=? and password=?";
		    //创建一个query对象
		    Query query = session.createQuery(hql);
		   // System.out.println(u.getPassword());
		    query.setParameter(0, stu.getSname());
		    query.setParameter(1, stu.getPassword());
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
	
	
	//查询所有学生资料
	@Override
	public List<Student> queryAllStudent() {
		// TODO Auto-generated method stub
		Transaction tx = null;
		List<Student> list =null;
		String hql = "";
		
		try
		{
			Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			hql = "from Student";
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
	public Student queryStudentBySid(String sid) {
		// TODO Auto-generated method stub
		Transaction tx = null;
		Student s=null;
		
		try
		{
			Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			s = (Student) session.get(Student.class, sid);
			tx.commit();
			return s;	
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			tx.commit();
			return s;
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
	public boolean addStudent(Student s) {
		// TODO Auto-generated method stub
		//设置学生的学号
		s.setSid(getNewSid());
		Transaction tx = null;
		
		try
		{
			Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			session.save(s);
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
	public boolean updateStudent(Student s) {
		// TODO Auto-generated method stub
		Transaction tx = null;
		
		try
		{
			Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			session.update(s);
			s.getAddress();
			System.out.println(s.getAddress());
			System.out.println(s.getBirthday());
			System.out.println(s.getSname());
			
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
	public boolean deleteStudent(String sid) {
		// TODO Auto-generated method stub
		Transaction tx = null;
		//String hql = "";	
		try
		{
			Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			Student s = (Student)session.get(Student.class,sid);
			session.delete(s);
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
	
	//生成学生的学号
	private String getNewSid(){
		Transaction tx = null;
		String hql = "";
		String sid = null;
		try
		{
			Session session = MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			hql = "select max(sid) from Student";
			Query query = session.createQuery(hql);
			sid = (String)query.uniqueResult();
			if(sid==null||"".equals(sid))
			{
				//相当于此时数据库没有任何一条记录，那么给一个最大的编号
				sid = "S0000001";
			}
			else
			{
				String temp = sid.substring(1);  //取到后面七位
				int i = Integer.parseInt(temp);
				i++;
				//再还原成字符串
				temp = String.valueOf(i);
				int len = temp.length();
				
				//凑够七位
				for(int j=0;j<7-len;j++)
				{
					temp = "0"+ temp;
					sid="S"+temp;
					
				}				
			}
			tx.commit();
			return sid;
			
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
