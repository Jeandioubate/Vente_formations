package fr.ldnr.application;

import fr.ldnr.entity.Training;
import fr.ldnr.business.BusinessTraining;
import fr.ldnr.dao.TrainingDaoImpl;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		BusinessTraining business = new BusinessTraining(new TrainingDaoImpl());
		Scanner scan = new Scanner(System.in);
			
	}

}
