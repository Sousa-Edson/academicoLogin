package com.fieb.tcc.academicologin.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.fieb.tcc.academicologin.model.Role;
import com.fieb.tcc.academicologin.model.User;
import com.fieb.tcc.academicologin.web.dto.UserDto;

public interface UserService extends UserDetailsService {
	
	User save(UserDto userDto);
	User findByEmail(UserDto userDto);
	User update(User user);
	User getAuthenticatedUser();
	Role saveRole(Role role);
	void addRoleToUser(String username, String roleName);
	User update(UserDto userDto);
	
	// api
		User getUserByUsername(String username);
		User findUserById(Long id);

}