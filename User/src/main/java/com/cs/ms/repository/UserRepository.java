package com.cs.ms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cs.ms.model.User;

@Repository

public interface UserRepository extends CrudRepository<User, Long> {

}
