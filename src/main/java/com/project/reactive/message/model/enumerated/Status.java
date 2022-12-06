package com.project.reactive.message.model.enumerated;

import java.util.HashMap;
import java.util.Map;

public enum Status {

	IN_USE(1, "In Use"), UPDATED(2, "Updated"), DEPRECIATED(3, "Depreciated");

	private static final Map<Integer, Status> byId = new HashMap<Integer, Status>();
	static {
		for (Status e : Status.values()) {
			if (byId.put(e.getId(), e) != null) {
				throw new IllegalArgumentException("duplicate id: " + e.getId());
			}
		}
	}

	public static Status getById(Integer id) {
		return byId.get(id);
	}

	Status(int id, String name) {
		this.name = name;
		this.id = id;
	}

	private String name;
	private Integer id;

	public String getName() {
		return name;
	}

	public Integer getId() {
		return id;
	}

}
