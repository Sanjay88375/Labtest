package com.example.Mysqljdpc1;
import java.io.Serializable;

import javax.persistence.*;
@Entity
@Table (name = "MyCompany")

public class Company {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@PrimaryKeyJoinColumn
	@OneToOne(targetEntity=address.class, cascade=CascadeType.ALL)
	private int company_id;
	private String company_name;
	private String company_city;
	private Items Items;
	public int getCompany_id() {
		return company_id;
	}
	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getCompany_city() {
		return company_city;
	}
	public void setCompany_city(String company_city) {
		this.company_city = company_city;
	}
	public Items getItems() {
		return address;
	}
	public void setItems(Items Items) {
		this.address = address;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


	
