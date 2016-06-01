package cn.edu.jxnu.entity;

import java.util.Date;

//学生类
public class Student {

	private String sid;//学号
	private String sname;//姓名
	private String gender;//性别
	private Date birthday;//出生日期
	private String address;//地址
	
	private String password;//后来加上的
	

	public Student(){
		super();
	}
	
	public Student(String sid, String sname, String gender, Date birthday,
			String address, String password) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.gender = gender;
		this.birthday = birthday;
		this.address = address;
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
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
		return "Student [sid=" + sid + ", sname=" + sname + ", gender="
				+ gender + ", birthday=" + birthday + ", address=" + address
				+ ", password=" + password + "]";
	}
	

}
