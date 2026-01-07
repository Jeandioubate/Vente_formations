package fr.ldnr.business;

import fr.ldnr.dao.TrainingDao;
import fr.ldnr.entity.Training;
import java.util.List;

/**
 * Business logic for Training.
 */

public class BusinessTraining {
	
	private final TrainingDao trainingDao;

	public  BusinessTraining(TrainingDao trainingDao) {
		this.trainingDao = trainingDao;
	}
	
	public List<Training> getAllTrainings() {
		return trainingDao.readAll();
	}

}
