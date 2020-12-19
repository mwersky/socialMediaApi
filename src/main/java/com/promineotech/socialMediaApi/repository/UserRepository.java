package com.promineotech.socialMediaApi.repository;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

	public User findByUsername(String Username);
}
