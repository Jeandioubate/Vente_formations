package fr.ldnr.business;

import fr.ldnr.dao.TrainingDao;
import fr.ldnr.entity.Training;
import java.util.List;

/**
 * Couche métier pour la gestion des formations.
 * Cette classe contient la couche métier liée aux formations et sert d'intermédiaire
 * entre la couche DAO et la couche de présentation.
 */

public class BusinessTraining {
	
	/**DAO utilisé pour l'accès aux données des formations*/
	private final TrainingDao trainingDao;
	
	/**
	 * Construit un service métier pour les formations.
	 * @param trainingDao l'implémentation du DAO utiliséé pour accéder aux données
	 */

	public  BusinessTraining(TrainingDao trainingDao) {
		this.trainingDao = trainingDao;
	}
	
	/**
	 * Récupère l'ensemble des formations.
	 * @return une liste de toutes les formations.
	 */
	public List<Training> getAllTrainings() {
		return trainingDao.readAll();
	}
	
	/**
	 * Recherche des formations à partir d'un mot-clé.
	 * Une exception est levée si le mot-clé est nul ou vide.
	 * @param keyword le mot-clé utilisé pour la recherche.
	 * @return une liste de formations correspondant au mot-clé
	 */
	public List<Training> searchByKeyword(String keyword) {
		if (keyword == null || keyword.trim().isEmpty()) {
			throw new IllegalArgumentException("Keyword must not be empty");
		}
		return trainingDao.readByKeyword(keyword);
	}
	
	/**
	 * Filtre les formations selon leur modalité.
	 * Seules les modalités (PRESENTIEL && DISTANCIEL) sont autorisées.
	 * @param modality la modalité de la formation.
	 * @return une liste de formations correspondant à la modalité.
	 */
	public List<Training> filterByModality(String modality) {
		if (!modality.equalsIgnoreCase("PRESENTIEL") && 
			!modality.equalsIgnoreCase("DISTANCIEL")) {
			throw new IllegalArgumentException("Invalid modality");
		}
		return trainingDao.readByModality(modality);
	}

}
