/**
 * 
 */
package com.sai.mrb.model;

/**
 * @author sv
 *
 */
public class User {

	private Integer id;
	private String name;
	private String emailid;
	private Role role;
	private Team team;

	public User(Integer id, String name, String emailid, Role role, Team team) {
		super();
		this.id = id;
		this.name = name;
		this.emailid = emailid;
		this.role = role;
		this.team = team;
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

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", emailid=" + emailid + ", role=" + role + ", team=" + team + "]";
	}

}
