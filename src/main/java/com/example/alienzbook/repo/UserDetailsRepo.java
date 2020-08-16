package com.example.alienzbook.repo;

import com.example.alienzbook.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepo extends JpaRepository<User, String> {

}
