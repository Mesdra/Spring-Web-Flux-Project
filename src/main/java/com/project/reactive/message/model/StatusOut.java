package com.project.reactive.message.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StatusOut {

	private String name;

	private String version;

	private String arctifact;

}
