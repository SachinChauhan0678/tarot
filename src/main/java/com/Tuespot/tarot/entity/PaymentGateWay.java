package com.Tuespot.tarot.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="paymentGateway")
public class PaymentGateWay {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String phoneno;
	private String email;
	private String time;
	private String meeting;
	private String date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getMeeting() {
		return meeting;
	}
	public void setMeeting(String meeting) {
		this.meeting = meeting;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "PaymentGateWay [id=" + id + ", name=" + name + ", phoneno=" + phoneno + ", email=" + email + ", time="
				+ time + ", meeting=" + meeting + ", date=" + date + "]";
	}
	public PaymentGateWay(int id, String name, String phoneno, String email, String time, String meeting, String date) {
		super();
		this.id = id;
		this.name = name;
		this.phoneno = phoneno;
		this.email = email;
		this.time = time;
		this.meeting = meeting;
		this.date = date;
	}
	public PaymentGateWay() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
