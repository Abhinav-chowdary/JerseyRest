package com.Abhi.Jersey.JerseyRest.CRUDRepo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.Abhi.Jersey.JerseyRest.Entities.VacationDetails;

public abstract class VacationDetailsCrudRepo extends VacationDetails{
	
	
	protected EntityManager GetEntityManager() {
		
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("PIK");
		return emf.createEntityManager();
		
	}
	
	

}
