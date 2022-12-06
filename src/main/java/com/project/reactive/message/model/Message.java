package com.project.reactive.message.model;

import com.project.reactive.message.model.enumerated.Status;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String message;

	@Enumerated
	private Status status;

}
