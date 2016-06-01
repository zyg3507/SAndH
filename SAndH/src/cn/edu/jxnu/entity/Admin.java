package cn.edu.jxnu.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

//用户类
/*@Entity
@GenericGenerator(name="abc",strategy="native")
@Table(name = "user")*/
public class Admin {

	private int uid;
	private String username;
	private String password;
	
	//保留一个无参的构造函数
	public Admin() {
		super();
	}
	
	//创建一个带参数的构造函数
	public Admin(int uid, String username, String password) {
		super();
		this.uid = uid;
		this.username = username;
		this.password = password;
	}

	/*@Id
	@GeneratedValue(generator="abc")*/
	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}
