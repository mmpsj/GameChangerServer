package com.gameChanger.repository;

import com.gameChanger.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
    boolean existsByUserId(String userId);
    boolean existsByNickname(String nickname);
    Optional<User> findByUserId(String userId);
}
