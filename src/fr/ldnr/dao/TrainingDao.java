package fr.ldnr.dao;

import fr.ldnr.entity.Training;
import java.util.List;

/**
 * Interface DAO pour l'accès aux données des formations.
 * Cette interface définit les méthodes permettant de récupérer des formations
 * depuis une source de données (base de données, fichier, API, etc.).
 */

public interface TrainingDao {
	
	/**
	 * Récupère l'ensemble des formations.
	 * @return une liste de toutes les formations
	 */
	List<Training> readAll();
	
	/**
	 * Récupère les formations correspondant à un mot-clé.
	 * Le mot-clé peut être recherché dans le nom ou la description de la formation.	
	 * @param keyword le mot-clé utilisé pour la recherche.
	 * @return une liste de formations correspondant au mot-clé.
	 */
	List<Training> readByKeyword(String keyword);
	
	/**
	 * Récupère les formations selon leur modalité.
	 * @param modality modalité de la formation (DISTANCIEL ou PRESENTIEL).
	 * @return une liste de formations correspondant à la modalité donnée.
	 */
	List<Training> readByModality(String modality);
	
}
