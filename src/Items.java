package com.example.Mysqljdpc1;
import java.io.Serializable;

import javax.persistence.*;
@Entity
@Table
public class Items implements Serializable {
	@OneToOne(targetEntity=Alien.class)
	private int Item_id;
	private String Item_Name;
    private String unitsSold;
    private int Company_id;
    private Company Company;

	public int getItem_id() {
		return Item_id;
	}

	public void setItem_id(int item_id) {
		Item_id = item_id;
	}

	public String getItem_Name() {
		return Item_Name;
	}

	public void setItem_Name(String item_Name) {
		Item_Name = item_Name;
	}

	public String getUnitsSold() {
		return unitsSold;
	}

	public void setUnitsSold(String unitsSold) {
		this.unitsSold = unitsSold;
	}

	public int getCompany_id() {
		return Company_id;
	}

	public void setCompany_id(int company_id) {
		Company_id = company_id;
	}

	public Company getCompany() {
		return Alien;
	}

	public void setCompany(Company Company) {
		Alien = alien;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
