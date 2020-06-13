/**
 * 
 */
package com.sai.mrb.service;

import java.util.List;

import com.sai.mrb.model.Team;

/**
 * @author sv
 *
 */
public interface TeamService {

	public void addTeam(Team team);

	public void updateTeam(Team team);

	public Team getTeamWithID(Team team);

	public List<Team> getAllTeam();

}
