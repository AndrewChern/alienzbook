package com.example.alienzbook.repo;

import com.example.alienzbook.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository <Message, Long> {

}
