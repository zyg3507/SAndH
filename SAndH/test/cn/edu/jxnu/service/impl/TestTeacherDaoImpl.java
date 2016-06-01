package cn.edu.jxnu.service.impl;

import java.util.Date;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import cn.edu.jxnu.entity.Student;
import cn.edu.jxnu.entity.Teacher;
import cn.edu.jxnu.service.StudentDao;
import cn.edu.jxnu.service.TeacherDao;

//
public class TestTeacherDaoImpl {

	@Test
	public void textQueryAllTeachers(){
		TeacherDao tdao = new TeacherDaoImpl();
		List<Teacher> list = tdao.queryAllTeacher();
		
		//遍历集合
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
	}
	
	@Test
	public void addTeacher(){
		Teacher t = new Teacher();
		t.setTname("设计师3");
		t.setGender("男");
		t.setBirthday(new Date());
		t.setAddress("安徽省");
		TeacherDao tdao = new TeacherDaoImpl();
		Assert.assertEquals(true, tdao.addTeacher(t));
	}
	
	
	
	/*@Test
	public void testGetNewSid(){
		StudentDaoImpl sdao = new StudentDaoImpl();
		System.out.println(sdao.getNewSid());
	}*/
}
