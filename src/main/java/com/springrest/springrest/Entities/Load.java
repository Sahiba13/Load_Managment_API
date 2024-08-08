package com.springrest.springrest.Entities;



import java.time.LocalDate;
import java.util.UUID;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Load {
    
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID loadId;
    private String loadingPoint;
    private String unloadingPoint;
    private String productType;
    private String truckType;
    private String noOfTrucks;
    private String weight;
    private String comment;
    private UUID shipperId;
    private LocalDate date;
    
 // Getters and Setters
    
	public Load(UUID loadId, String loadingPoint, String unloadingPoint, String productType, String truckType,
			String noOfTrucks, String weight, String comment, UUID shipperId, LocalDate date) {
		super();
		this.loadId = loadId;
		this.loadingPoint = loadingPoint;
		this.unloadingPoint = unloadingPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.noOfTrucks = noOfTrucks;
		this.weight = weight;
		this.comment = comment;
		this.shipperId = shipperId;
		this.date = date;
		
		
	}

	public Load() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UUID getLoadId() {
		return loadId;
	}

	public void setLoadId(UUID loadId) {
		this.loadId = loadId;
	}

	public String getLoadingPoint() {
		return loadingPoint;
	}

	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}

	public String getUnloadingPoint() {
		return unloadingPoint;
	}

	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getTruckType() {
		return truckType;
	}

	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}

	public String getNoOfTrucks() {
		return noOfTrucks;
	}

	public void setNoOfTrucks(String noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public UUID getShipperId() {
		return shipperId;
	}

	public void setShipperId(UUID shipperId) {
		this.shipperId = shipperId;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Load [loadId=" + loadId + ", loadingPoint=" + loadingPoint + ", unloadingPoint=" + unloadingPoint
				+ ", productType=" + productType + ", truckType=" + truckType + ", noOfTrucks=" + noOfTrucks
				+ ", weight=" + weight + ", comment=" + comment + ", shipperId=" + shipperId + "]";
	}
    
    
    
    
}
