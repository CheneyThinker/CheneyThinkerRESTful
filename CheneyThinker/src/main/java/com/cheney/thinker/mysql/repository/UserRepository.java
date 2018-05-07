package com.cheney.thinker.mysql.repository;

import com.cheney.thinker.mysql.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
