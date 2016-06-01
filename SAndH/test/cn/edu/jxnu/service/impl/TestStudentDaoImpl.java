package cn.edu.jxnu.service.impl;

import java.util.Date;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import cn.edu.jxnu.entity.Student;
import cn.edu.jxnu.service.StudentDao;

//
public class TestStudentDaoImpl {

	@Test
	public void textQueryAllStudents(){
		StudentDao sdao = new StudentDaoImpl();
		List<Student> list = sdao.queryAllStudent();
		
		//遍历集合
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
	}
	
	@Test
	public void addStudent(){
		Student s = new Student();
		s.setSname("设计师2");
		s.setGender("男");
		s.setBirthday(new Date());
		s.setAddress("安徽省");
		StudentDao sdao = new StudentDaoImpl();
		Assert.assertEquals(true, sdao.addStudent(s));
	}
	
	
	
	/*@Test
	public void testGetNewSid(){
		StudentDaoImpl sdao = new StudentDaoImpl();
		System.out.println(sdao.getNewSid());
	}*/
}
