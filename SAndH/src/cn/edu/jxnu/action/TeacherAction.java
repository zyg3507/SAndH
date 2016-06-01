package cn.edu.jxnu.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import cn.edu.jxnu.entity.Student;
import cn.edu.jxnu.entity.Teacher;
import cn.edu.jxnu.service.StudentDao;
import cn.edu.jxnu.service.TeacherDao;
import cn.edu.jxnu.service.impl.StudentDaoImpl;
import cn.edu.jxnu.service.impl.TeacherDaoImpl;

//学生action类
public class TeacherAction extends SuperAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    //实现查询所有教师的动作
	public String query(){
		TeacherDao tdao = new TeacherDaoImpl();
		List<Teacher> list = tdao.queryAllTeacher();
		//将返回的集合放入session中
		if(list!=null&&list.size()>0){
			session.setAttribute("teacher_list", list);
			//return "Students_list_success";
		}
		return "query_success";
	}
	
	//删除教师的动作
	public String delete(){
		TeacherDao tdao = new TeacherDaoImpl();
		String  tid = request.getParameter("tid");
		tdao.deleteTeacher(tid); //调用删除方法
		return "delete_success";
	}
	
	//添加教师
	public String add() throws Exception{
		Teacher t = new Teacher();
		t.setTname(request.getParameter("tname"));
		t.setGender(request.getParameter("gender"));
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
		t.setBirthday(sdf.parse(request.getParameter("birthday")));
		t.setAddress(request.getParameter("address"));
		TeacherDao tdao = new TeacherDaoImpl();
		tdao.addTeacher(t);
		return "add_success";
		
	}
	
	//修改教师资料的动作
	public String modify(){

		//获得教师传过来的教师编号
		String tid = request.getParameter("tid");
		TeacherDao tdao = new TeacherDaoImpl();
		Teacher t = tdao.queryTeacherByTid(tid);
		//保存到session会话当中
		session.setAttribute("modify_teacher", t);
		return "modify_success";
		
	}
	
	//保存修改后的学生的动作
	public String save() throws Exception{
		
		Teacher t = new Teacher();
		t.setTid(request.getParameter("tid"));
		t.setTname(request.getParameter("tname"));
		t.setGender(request.getParameter("gender"));
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
		t.setBirthday(sdf.parse(request.getParameter("birthday")));
		t.setAddress(request.getParameter("address"));
		TeacherDao tdao = new TeacherDaoImpl();
		tdao.updateTeacher(t);
		return "save_success";
		
	}

}
