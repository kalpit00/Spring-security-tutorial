package com.kalpit00.Oath.authorization.server.repository;

import com.kalpit00.Oath.authorization.server.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
