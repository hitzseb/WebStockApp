package com.hitzseb.StockApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.hitzseb.StockApp.model.User;
import com.hitzseb.StockApp.repo.UserRepository;

public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepo.getUserByUserName(username);

		if (user == null) {
			throw new UsernameNotFoundException("We couldn't find user");
		}

		return new MyUserDetails(user);
	}

}
