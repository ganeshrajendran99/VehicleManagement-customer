package com.cg.ovms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.ovms.entities.User;

@Repository
public interface IUserRepository {

	public User validateUser(User user);
	public User addUser(User user);
	public User removeUser(User user);
	public User signOut(User user);
}
