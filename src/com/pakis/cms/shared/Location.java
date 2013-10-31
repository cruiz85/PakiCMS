package com.pakis.cms.shared;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@SuppressWarnings("serial")
@Entity
public class Location implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String zipCode;
	private String wayType;
	private String streetName;
	private int localNumber;
	private Long lon;
	private Long lat;

	public Location() {
	} 

	public Location(String zipCode, String wayType, String streetName,
			int localNumber) {
		super();
		this.zipCode = zipCode;
		this.wayType = wayType;
		this.streetName = streetName;
		this.localNumber = localNumber;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getWayType() {
		return wayType;
	}

	public void setWayType(String wayType) {
		this.wayType = wayType;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public int getLocalNumber() {
		return localNumber;
	}

	public void setLocalNumber(int localNumber) {
		this.localNumber = localNumber;
	}

	public Long getLon() {
		return lon;
	}

	public void setLon(Long lon) {
		this.lon = lon;
	}

	public Long getLat() {
		return lat;
	}

	public void setLat(Long lat) {
		this.lat = lat;
	}

}
