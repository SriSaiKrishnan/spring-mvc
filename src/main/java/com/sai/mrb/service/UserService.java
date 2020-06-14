/**
 * 
 */
package com.sai.mrb.service;

import java.util.List;

import com.sai.mrb.model.Login;
import com.sai.mrb.model.User;

/**
 * @author sv
 *
 */
public interface UserService {
	
	public void addUser(User user);
	
	public void updateUser(User user);
	
	public User validateUser(Login login);
	
	public User  getUserWithID(User user);
	
	public List<User> getAllUser();
	
}
