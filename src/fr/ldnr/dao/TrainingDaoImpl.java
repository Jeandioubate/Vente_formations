package fr.ldnr.dao;

import fr.ldnr.entity.Training;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Implémentation de l'interface (TrainingDao).
 * Cette classe permet l'accès aux données des formations sotckées
 * dans une base de données MariaDB via JDBC.
 */
public class TrainingDaoImpl implements TrainingDao {
	
	private static final String URL = "jdbc:mariadb://localhost:3308/Sales";
	private static final String USER = "root";
	private static final String PASSWORD = "fms2025";
	
	/**
	 * Récupère toutes les formations présentes dans la base de données.
	 * @return une liste contenant toutes les formations.
	 */
	@Override
	public List<Training> readAll() {
		List<Training> courses =  new ArrayList<>();
		String sql = "SELECT * FROM training";
		
		try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
			 Statement statement = connection.createStatement();
			 ResultSet rs = statement.executeQuery(sql)) {
			
			while (rs.next()) {
				Training training = new Training(
						rs.getInt("t_id"),
						rs.getString("t_name"),
						rs.getString("t_description"),
						rs.getInt("t_time"),
						rs.getString("t_modality"),
						rs.getDouble("t_price")
			  );
			  courses.add(training);
			}
		} catch (SQLException e) {
			e.printStackTrace(); // 
		}
		
		return courses;
	}
	
	/**
	 * Récupère les formations dont le nom contient un mot-clé donné.
	 * @param keyword le mot-clé utilisé pour la recherche
	 * @return une liste de formations correspondant au mot-clé.
	 */
	@Override
	public List<Training> readByKeyword(String keyword) {
	    List<Training> courses = new ArrayList<>();
	    String sql = "SELECT * FROM training WHERE t_name LIKE ?";

	    try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
	         PreparedStatement ps = connection.prepareStatement(sql)) {

	        ps.setString(1, "%" + keyword + "%");
	        ResultSet rs = ps.executeQuery();

	        while (rs.next()) {
	            Training training = new Training(
	                    rs.getInt("t_id"),
	                    rs.getString("t_name"),
	                    rs.getString("t_description"),
	                    rs.getInt("t_time"),
	                    rs.getString("t_modality"),
	                    rs.getDouble("t_price")
	            );
	            courses.add(training);
	        }

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return courses;
	}
	
	/**
	 * Récupère les formations selon leur modalité.
	 * @param modality la modalité de la formation (PRESENTIEL ou DISTANCIEL).
	 * @return une liste de formations correspondant à la modalité donnée.
	 */
	@Override
	public List<Training> readByModality(String modality) {
	    List<Training> courses = new ArrayList<>();
	    String sql = "SELECT * FROM training WHERE t_modality = ?";

	    try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
	         PreparedStatement ps = connection.prepareStatement(sql)) {

	        ps.setString(1, modality);
	        ResultSet rs = ps.executeQuery();

	        while (rs.next()) {
	            Training training = new Training(
	                    rs.getInt("t_id"),
	                    rs.getString("t_name"),
	                    rs.getString("t_description"),
	                    rs.getInt("t_time"),
	                    rs.getString("t_modality"),
	                    rs.getDouble("t_price")
	            );
	            courses.add(training);
	        }

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return courses;
	}


}
