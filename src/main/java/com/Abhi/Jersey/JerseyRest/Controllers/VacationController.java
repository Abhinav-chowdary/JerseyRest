package com.Abhi.Jersey.JerseyRest.Controllers;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.Abhi.Jersey.JerseyRest.Entities.VacationDetails;
import com.Abhi.Jersey.JerseyRest.Services.VacationManager;



@Path("/staffservice")
public class VacationController {
	
	
	VacationManager vM = new VacationManager();
	//private List<VacationDetails> details;
	
	String details;
	
	@GET
	@Path("/allstaff")
	@Produces("application/json")
	public String GetAllDetails(){
		System.out.println("success");
		details=vM.GetAllDetails();
		
		return details;
		
	}
	
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public String GetStaffDetails(@PathParam("id") long id){
		
//		details=vM.GetstaffDetails(id);
//		
		return details;
		
	}
	
	@POST
	@Path("/vacation")
	@Consumes("application/json")
	public String Vacation(VacationDetails vd){
		String response = vM.SaveVacationDetails(vd.getiD(), vd.getDocName(), 
				vd.getFromDate(), vd.getToDate());
		return response;
	}
	

}
