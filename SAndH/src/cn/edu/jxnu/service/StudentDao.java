package cn.edu.jxnu.service;

import java.util.List;

import cn.edu.jxnu.entity.Student;


//学生的业务逻辑接口
public interface StudentDao {

	//学生登录
	public boolean stuLogin(Student stu);
	
	//查询所有学生的资料
	public List<Student> queryAllStudent();
	
	//根据学生编号查询单个学生的资料
	public Student queryStudentBySid(String sid);
	
	//添加学生资料
	public boolean addStudent(Student s);
	
	//修改学生资料
	public boolean updateStudent(Student s); 
	
	//删除学生
	public boolean deleteStudent(String sid);
}
