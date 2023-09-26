package com.sold.easy.model.car.history.ownershiphistory;

import jakarta.persistence.*;

@Entity
public class Documentation 
{
	@Id
	@SequenceGenerator( name = "documentation_id" , sequenceName = "documentation_id_gen")
	@GeneratedValue( generator = "documentation_id_gen")
	private long id ; 
	private String name;
	private DocumentationType documentType;
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public DocumentationType getDocumentType() 
	{
		return documentType;
	}
	
	public void setDocumentType(DocumentationType documentType) 
	{
		this.documentType = documentType;
	}
	
	

}
 
