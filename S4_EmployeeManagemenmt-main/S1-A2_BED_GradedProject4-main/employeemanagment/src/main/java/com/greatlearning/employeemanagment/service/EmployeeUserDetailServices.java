package com.greatlearning.employeemanagment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.greatlearning.employeemanagment.model.User;
import com.greatlearning.employeemanagment.repository.UserRepository;
import com.greatlearning.employeemanagment.security.EmployeeUserDetail;

@Service
public class EmployeeUserDetailServices implements UserDetailsService {

	@Autowired
	EmployeeService employeeService;

	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findUserByUsername(username);
		System.out.println("User Found");
		return new EmployeeUserDetail(user);
	}

}
