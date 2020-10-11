package com.bstation.iamin.Repository;

import com.bstation.iamin.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);

    void deleteById(Long id);

    Optional<User> findById(Long id);
}
