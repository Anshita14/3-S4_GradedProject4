package com.greatlearning.employeemanagment.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.greatlearning.employeemanagment.model.Role;
import com.greatlearning.employeemanagment.model.User;

public class EmployeeUserDetail implements UserDetails {

	private User userr;

	public EmployeeUserDetail(User user) {
		this.userr = user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Role role = userr.getRoles();
		List<SimpleGrantedAuthority> authorities = new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority("ROLE_" + role.getRole_name()));
		return authorities;

	}

	@Override
	public String getPassword() {
		return userr.getPassword();
	}

	@Override
	public String getUsername() {
		return userr.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
