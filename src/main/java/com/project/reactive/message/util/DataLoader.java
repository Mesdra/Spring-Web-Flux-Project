package com.project.reactive.message.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.project.reactive.message.model.Message;
import com.project.reactive.message.model.enumerated.Status;
import com.project.reactive.message.repository.MessageRepository;

@Component
public class DataLoader implements ApplicationRunner {

	@Autowired
	private MessageRepository userRepository;

	public void run(ApplicationArguments args) {
		userRepository.save(new Message(1, "Sucesso na execução", Status.IN_USE));
	}
}
