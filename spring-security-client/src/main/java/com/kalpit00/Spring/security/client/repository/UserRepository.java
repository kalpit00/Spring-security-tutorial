package com.kalpit00.Spring.security.client.repository;

import com.kalpit00.Spring.security.client.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
