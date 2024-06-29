package com.tickle.lms.repository;

import com.tickle.lms.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReposiory extends JpaRepository<User, Long>{
    User findByUserID(Long userID);
}
