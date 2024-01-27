package com.mohirdev_oauth.mohirdev.Repository;

import com.mohirdev_oauth.mohirdev.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long > {
}
