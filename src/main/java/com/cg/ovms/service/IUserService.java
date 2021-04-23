package com.cg.ovms.service;

import org.springframework.stereotype.Service;

import com.cg.ovms.entities.User;

@Service
public interface IUserService {

	public User validateUser(User user);
	public User addUser(User user);
	public User removeUser(User user);
	public User signOut(User user);
}
