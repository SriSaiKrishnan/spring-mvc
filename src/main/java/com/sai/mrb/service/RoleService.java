/**
 * 
 */
package com.sai.mrb.service;

import java.util.List;

import com.sai.mrb.model.Role;

/**
 * @author sv
 *
 */
public interface RoleService {
	
	public void addRole(Role role);
	
	public void updateRole(Role role);
	
	public Role  getRoleWithID(Role role);
	
	public List<Role> getAllRole();

}
