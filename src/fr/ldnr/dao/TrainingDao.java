package fr.ldnr.dao;

import fr.ldnr.entity.Training;
import java.util.List;

/**
 * DAO interface for accessing Formation data.
 */

public interface TrainingDao {
	
	List<Training> readAll();
	
	List<Training> readByKeyword(String keyword);
	
	List<Training> readByModality(String modality);
	
}
