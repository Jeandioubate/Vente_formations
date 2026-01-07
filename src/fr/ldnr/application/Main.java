package fr.ldnr.application;

import fr.ldnr.entity.Training;
import fr.ldnr.dao.TrainingDao;
import fr.ldnr.dao.TrainingDaoImpl;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		/*
        // Création de quelques formations
        Training t1 = new Training(1, "Java Basics", "Introduction to Java", 5, "PRESENTIEL", 500.0);
        Training t2 = new Training(2, "Python Advanced", "Advanced Python topics", 3, "DISTANCIEL", 300.0);
        Training t3 = new Training(3, "Data Analysis", "Learn to analyze data", 4, "PRESENTIEL", 400.0);

        // Affichage des formations
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        // Accès aux getters
        System.out.println("Durée de la formation " + t1.getName() + " : " + t1.getDurationInDays() + " jours");
        System.out.println("Prix de la formation " + t2.getName() + " : " + t2.getPrice() + " €");
*/	
		TrainingDao dao = new TrainingDaoImpl();

        // ===== Test readAll() =====
        System.out.println("=== TEST readAll() ===");
        List<Training> allTrainings = dao.readAll();
        for (Training t : allTrainings) {
            System.out.println(t);
        }

        // ===== Test readByKeyword() =====
        System.out.println("\n=== TEST readByKeyword(\"Java\") ===");
        List<Training> javaTrainings = dao.readByKeyword("Java");
        for (Training t : javaTrainings) {
            System.out.println(t);
        }

        // ===== Test readByModality() =====
        System.out.println("\n=== TEST readByModality(\"PRESENTIEL\") ===");
        List<Training> presentielTrainings = dao.readByModality("PRESENTIEL");
        for (Training t : presentielTrainings) {
            System.out.println(t);
        }	
	}

}
