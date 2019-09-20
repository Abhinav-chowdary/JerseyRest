package com.Abhi.Jersey.JerseyRest.Services;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.Abhi.Jersey.JerseyRest.CRUDRepo.VacationDetailsCrudRepo;
import com.Abhi.Jersey.JerseyRest.Entities.VacationDetails;


public class VacationManager extends VacationDetailsCrudRepo {

	private EntityManager em;
	private List<VacationDetails> vacationDetails;

	
	public List<VacationDetails> GetAllDetails(){
		System.out.println("in here");
		
		
		em = GetEntityManager();
		em.getTransaction().begin();
		vacationDetails = em.Quer
		em.getTransaction().commit();
		em.close();
		return vacationDetails;
	}
	
	public List<VacationDetails> GetstaffDetails(long iD){
		em = GetEntityManager();
		em.getTransaction().begin();
		vacationDetails = (List<VacationDetails>) em.find(VacationDetails.class, iD);
		em.getTransaction().commit();
		em.close();
	return vacationDetails;
	}
	
	public String SaveVacationDetails(long iD, String docName,Date date,Date date2){
		em = GetEntityManager();
		em.getTransaction().begin();
		VacationDetails vd = new VacationDetails(iD, docName, date, date2);
		em.persist(vd);
		em.getTransaction().commit();
		em.close();
	return "Success";
	}
	
}
