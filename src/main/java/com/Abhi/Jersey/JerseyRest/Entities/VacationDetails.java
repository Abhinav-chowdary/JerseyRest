package com.Abhi.Jersey.JerseyRest.Entities;

import java.sql.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="configuration")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
public class VacationDetails {

	@Id
	private long 	iD;
	private String	docName;
	private Date	fromDate;
	private Date	toDate;
	
	public VacationDetails() {}
	
	public VacationDetails(long iD, String docName, Date fromDate, Date toDate) {
		super();
		this.iD = iD;
		this.docName = docName;
		this.fromDate = fromDate;
		this.toDate = toDate;
	}
	public long getiD() {
		return iD;
	}
	public void setiD(long iD) {
		this.iD = iD;
	}
	public String getDocName() {
		return docName;
	}
	public void setDocName(String docName) {
		this.docName = docName;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

}
