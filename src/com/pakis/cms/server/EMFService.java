package com.pakis.cms.server;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMFService {
	private static final EntityManagerFactory emfInstance = Persistence
			.createEntityManagerFactory("PakiUI");

	private EMFService() {
	}

	public static EntityManagerFactory get() {
		return emfInstance;
	}
}