package com.Abhi.Jersey.JerseyRest.Services;

import java.sql.Date;
import java.util.Collection;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.text.Document;

import com.Abhi.Jersey.JerseyRest.CRUDRepo.VacationDetailsCrudRepo;
import com.Abhi.Jersey.JerseyRest.Entities.VacationDetails;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.Abhi.Jersey.JerseyRest.MongoConnection.MongoConnection;


public class VacationManager extends VacationDetailsCrudRepo {

	public static final String DB_NAME = "test";
    public static final String COLL_NAME = "Staff";
    protected MongoDatabase db;

    
	private EntityManager em;
	private List<VacationDetails> vacationDetails;
	
	MongoClient mc = new MongoClient();
	
	MongoConnection mongoClient  = new MongoConnection();
	
	VacationDetails vCD = new VacationDetails();
	
	{
		String connect = mongoClient.MongoConnect();
	}

	
	public MongoCollection<org.bson.Document> GetAllDetails(){
		
		System.out.println("reached here");
		
		System.out.println("in here");
		
		MongoDatabase database = mc.getDatabase("test");
		
		MongoCollection<Document> col = database.getCollection("VacationDetails");
		
		Document doc =  collection
		
		System.out.println(col);
		
//		em = GetEntityManager();
//		em.getTransaction().begin();
//		vacationDetails = 
//		em.getTransaction().commit();
//		em.close();
		
		return col;
	}
	
	@SuppressWarnings("unchecked")
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
