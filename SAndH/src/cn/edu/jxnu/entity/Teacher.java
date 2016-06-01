package cn.edu.jxnu.entity;

import java.util.Date;

//学生类
public class Teacher {

	private String tid;//教工号
	private String tname;//姓名
	private String gender;//性别
	private Date birthday;//出生日期
	private String address;//地址
	
	public Teacher(){
		super();
	}
	
	public Teacher(String tid, String tname, String gender, Date birthday,
			String address) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.gender = gender;
		this.birthday = birthday;
		this.address = address;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
    
	//为了方便测试，再生成它的toString方法
	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", tname=" + tname + ", gender="
				+ gender + ", birthday=" + birthday + ", address=" + address
				+ "]";
	}
	
	
	
	/*@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", gender="
				+ gender + ", birthday=" + birthday + ", address=" + address
				+ "]";
	}*/
	

}
