package com.project.reactive.message.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.reactive.message.model.Message;

public interface MessageRepository extends JpaRepository<Message, Integer> {

}
