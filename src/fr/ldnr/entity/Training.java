package fr.ldnr.entity;

/**
 * Represents a training course.
 */

public class Training {
	
	private int id;
	private String name;
	private String description;
	private int durationInDays;
	private String modality; // PRESENTIEL OR DISTANCIEL
	private double price;
	
	
	public Training(int id, String name, String description, int durationInDays, String modality, double price) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.durationInDays = durationInDays;
		this.modality = modality;
		this.price = price;
	}
	
	public int getId() {return id;}
	public String getName() {return name;}
	public String getDescription() {return description;}
	public int getDurationInDays() {return durationInDays;}
	public String getModality() {return modality;}
	public double getPrice() {return price;}
	
	@Override
	public String toString() {
		return name + " (" + modality + ") - (" + description + ") - " + price + " €";
	}

}
