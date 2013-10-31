package com.pakis.cms.shared;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@SuppressWarnings("serial")
@Entity
public class Paki implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String shopName;
	private int openingHour;
	private int closingHour;
	@Basic
	private Location address;

	public Paki() {
	}

	public Paki(String shopName, int openingHour, int closingHour,
			Location address) {
		super();
		this.shopName = shopName;
		this.openingHour = openingHour;
		this.closingHour = closingHour;
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public int getOpeningHour() {
		return openingHour;
	}

	public void setOpeningHour(int openingHour) {
		this.openingHour = openingHour;
	}

	public int getClosingHour() {
		return closingHour;
	}

	public void setClosingHour(int closingHour) {
		this.closingHour = closingHour;
	}

	public Location getAddress() {
		return address;
	}

	public void setAddress(Location address) {
		this.address = address;
	}

}
