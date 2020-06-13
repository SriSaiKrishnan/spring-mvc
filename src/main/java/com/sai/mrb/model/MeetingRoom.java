/**
 * 
 */
package com.sai.mrb.model;

import com.google.appengine.repackaged.org.joda.time.LocalDate;

/**
 * @author sv
 *
 */
public class MeetingRoom {
	
	private Integer id;
	private String name;
	private String location;
	private String floor;
	
	public MeetingRoom(Integer id, String name, String location, String floor) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.floor = floor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	@Override
	public String toString() {
		return "MeetingRoom [id=" + id + ", name=" + name + ", location=" + location + ", floor=" + floor + "]";
	}
	
}
