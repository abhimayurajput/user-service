package com.neosoft.UserService.Repository;

import org.springframework.stereotype.Repository;
import com.neosoft.UserService.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);
}
