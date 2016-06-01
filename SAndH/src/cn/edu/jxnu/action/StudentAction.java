package cn.edu.jxnu.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import cn.edu.jxnu.entity.Student;
import cn.edu.jxnu.service.StudentDao;
import cn.edu.jxnu.service.impl.StudentDaoImpl;

//学生action类
public class StudentAction extends SuperAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//学生登录动作
	private Student stu;
	
	public String login(){
		
		StudentDao sdao = new StudentDaoImpl();
		if(sdao.stuLogin(stu)){
			//如果返回来的stu不为空
			session.setAttribute("loginSname", stu.getSname());
			System.out.println(stu.getSname());
			System.out.println(stu.getPassword());
			return "stu_login_success";
		}else{
			return "stu_login_failure";
		}
		
	}
	

    //实现查询所有学生的动作
	public String query(){
		StudentDao sdao = new StudentDaoImpl();
		List<Student> list = sdao.queryAllStudent();
		//将返回的集合放入session中
		if(list!=null&&list.size()>0){
			session.setAttribute("student_list", list);
			//return "Students_list_success";
		}
		return "query_success";
	}
	
	//删除学生的动作
	public String delete(){
		StudentDao sdao = new StudentDaoImpl();
		String  sid = request.getParameter("sid");
		sdao.deleteStudent(sid); //调用删除方法
		return "delete_success";
	}
	
	//添加学生
	public String add() throws Exception{
		Student s = new Student();
		s.setSname(request.getParameter("sname"));
		s.setGender(request.getParameter("gender"));
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
		s.setBirthday(sdf.parse(request.getParameter("birthday")));
		s.setAddress(request.getParameter("address"));
		StudentDao sdao = new StudentDaoImpl();
		sdao.addStudent(s);
		return "add_success";
		
	}
	
	//修改学生资料的动作
	public String modify(){

		//获得学生传过来的学生编号
		String sid = request.getParameter("sid");
		StudentDao sdao = new StudentDaoImpl();
		Student s = sdao.queryStudentBySid(sid);
		//保存到session会话当中
		session.setAttribute("modify_student", s);
		return "modify_success";
		
	}
	
	//保存修改后的学生的动作
	public String save() throws Exception{
		
		Student s = new Student();
		s.setSid(request.getParameter("sid"));
		s.setSname(request.getParameter("sname"));
		s.setGender(request.getParameter("gender"));
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
		s.setBirthday(sdf.parse(request.getParameter("birthday")));
		s.setAddress(request.getParameter("address"));
		StudentDao sdao = new StudentDaoImpl();
		sdao.updateStudent(s);
		return "save_success";
		
	}

}
