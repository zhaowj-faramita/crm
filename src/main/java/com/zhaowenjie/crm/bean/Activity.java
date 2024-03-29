package com.zhaowenjie.crm.bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "activity")
public class Activity implements Serializable {

	private static final long serialVersionUID = 9164000478577216993L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;
	private String place;
	private String title;
	private String memo;

	public Activity() {
		super();
	}
	public Activity(Integer id, Customer customer, String place, String title, String memo) {
		super();
		this.id = id;
		this.customer = customer;
		this.place = place;
		this.title = title;
		this.memo = memo;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	@Override
	public String toString() {
		return "Activity [id=" + id + ", customer=" + customer + ", place=" + place + ", title=" + title + ", memo="
				+ memo + "]";
	}

}
