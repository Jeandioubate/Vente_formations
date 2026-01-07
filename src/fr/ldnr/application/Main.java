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
		
		while (true) {
			
			System.out.println("\n=== MENU TRAININGS SALES ===");
			System.out.println("1 - All trainings");
			System.out.println("2 - Search by keywords");
			System.out.println("3 - Trainings by modality");
			System.out.println("0 - Exit");
			System.out.println("Your choice : ");
			
			String choice = scan.nextLine();
			
			if (choice.equals("0")) {
				System.out.println("Goodbye");
				break;
			}
			
			switch (choice) {
			
				case "1":
					business.getAllTrainings()
							.forEach(System.out::println);
					break;
				
				case "2":
					System.out.print("Keyword : ");
					String keyword = scan.nextLine();
					
					try {
						business.searchByKeyword(keyword)
								.forEach(System.out::println);
					} catch (IllegalArgumentException e) {
						System.out.println(e.getMessage());
					}
					break;
			
			}
			
		}
			
	}

}
