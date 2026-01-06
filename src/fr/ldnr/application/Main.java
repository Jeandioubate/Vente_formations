package fr.ldnr.application;

import fr.ldnr.entity.Training;

public class Main {

	public static void main(String[] args) {
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

	}

}
