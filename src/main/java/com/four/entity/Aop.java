package com.four.entity;


import org.springframework.data.mongodb.core.mapping.Document;

//如果不加document(collection="表名")默认为实体类名
@Document(collection="login")
public class Aop {
	private Integer userid;
	private String username;
	private String userpass;
	private String pcip;
	private String datelo;
	private String denglu;

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpass() {
		return userpass;
	}

	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}

	public String getPcip() {
		return pcip;
	}

	public void setPcip(String pcip) {
		this.pcip = pcip;
	}

	public String getDatelo() {
		return datelo;
	}

	public void setDatelo(String datelo) {
		this.datelo = datelo;
	}

	public String getDenglu() {
		return denglu;
	}

	public void setDenglu(String denglu) {
		this.denglu = denglu;
	}

	@Override
	public String toString() {
		return "Aop{" +
				"userid=" + userid +
				", username='" + username + '\'' +
				", userpass='" + userpass + '\'' +
				", pcip='" + pcip + '\'' +
				", datelo='" + datelo + '\'' +
				", denglu='" + denglu + '\'' +
				'}';
	}
}
