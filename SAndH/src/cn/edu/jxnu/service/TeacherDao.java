package cn.edu.jxnu.service;

import java.util.List;

import cn.edu.jxnu.entity.Teacher;


//教师的业务逻辑接口
public interface TeacherDao {

	//查询所有教师的资料
	public List<Teacher> queryAllTeacher();
	
	//根据学生编号查询单个教师的资料
	public Teacher queryTeacherByTid(String tid);
	
	//添加教师资料s
	public boolean addTeacher(Teacher s);
	
	//修改教师资料
	public boolean updateTeacher(Teacher s); 
	
	//删除教师
	public boolean deleteTeacher(String tid);
}
