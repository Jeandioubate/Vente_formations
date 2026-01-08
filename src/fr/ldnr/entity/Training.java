package fr.ldnr.entity;

/**
 * Représente une formation.
 * La classe (Training) contient les informations relatives à une formation,
 * telles que son identifiant, son nom, sa description, sa durée, sa modalité et son prix.
 */

public class Training {
	
	private int id;
	private String name;
	private String description;
	private int durationInDays;
	private String modality; // PRESENTIEL OR DISTANCIEL
	private double price;
	
	/**
	 * Construit une nouvelle formation avec les informations fournies
	 * @param id identifiant unique de la formation
	 * @param name nom de la formation
	 * @param description description détaillée de la formation
	 * @param durationInDays durée de la formation en jours
	 * @param modality modalité de la formation (PRESENTIEL ou DISTANCIEL)
	 * @param price prix de la formation
	 */
	public Training(int id, String name, String description, int durationInDays, String modality, double price) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.durationInDays = durationInDays;
		this.modality = modality;
		this.price = price;
	}
	
	/**
	 * Retourne l'identifiant de la formation
	 * @return id de la formation
	 */
	public int getId() {return id;}
	
	/**
	 * Retourne le nom de la formation
	 * @return name de la formation
	 */
	public String getName() {return name;}
	
	/**
	 * Retourne la description de la formation
	 * @return description de la formation
	 */
	public String getDescription() {return description;}
	
	/**
	 * Retourne la durée de la formation en jours
	 * @return durationInDays de la formation en jours
	 */
	public int getDurationInDays() {return durationInDays;}
	
	/**
	 * Retourne la modalité de la formation
	 * @return modality de la formation
	 */
	public String getModality() {return modality;}
	
	/**
	 * Retourne le prix de la formation
	 * @return price de la formation
	 */
	public double getPrice() {return price;}
	
	/**
	 * Affiche textuellement la formation
	 * @return une chaîne de caractères contenant les informations de la formation.
	 */
	@Override
	public String toString() {
		return id + " | (" + name + ") | " + description + " | (" + modality + ") | (" + durationInDays + ") | " + price + " €";
	}

}
