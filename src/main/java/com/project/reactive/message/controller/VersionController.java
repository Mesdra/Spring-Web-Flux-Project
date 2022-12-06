package com.project.reactive.message.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.reactive.message.model.StatusOut;

@RestController
@RequestMapping("/status")
public class VersionController {

	@Value("${project.name}")
	private String name;

	@Value("${project.version}")
	private String version;

	@Value("${project.arctifactid}")
	private String actifactId;
	
	@GetMapping
	public ResponseEntity<StatusOut> getStatus() {
		StatusOut output = new StatusOut(name, version, actifactId);
		return ResponseEntity.ok(output);
	}

}
