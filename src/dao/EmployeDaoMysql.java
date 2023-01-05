package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Employe;

	public class EmployeDaoMysql implements IEmployeDao{
		
		Connection conn = null;
		Statement state = null;
		ResultSet result = null;
		

		public EmployeDaoMysql(Connection connection){
			this.conn = connection;
		}
		
		@Override
		public List<Employe> getAllEmploye(){
			List<Employe> employes = new ArrayList<Employe>();
			Employe employe = null;
			try {
				state = conn.createStatement();
				result = state.executeQuery("SELECT * FROM employe");
				while(result.next()) {
					employe = new Employe();
					employe.setId(result.getInt("id"));
					employe.setNom(result.getString("nom"));
					employe.setPrenom(result.getString("prenom"));
					employes.add(employe);
	            }
				result.close();
				state.close();
			}
			catch (SQLException e) {e.printStackTrace();}
			return employes;
		}

		@Override
		public Employe getEmployeById(int id) {
			Employe employe = null;
			try {
				state = conn.createStatement();
				result = state.executeQuery("SELECT * FROM conge WHERE id=" + id);
				while(result.next()) {
					employe = new Employe();
					employe.setId(result.getInt("id"));
					employe.setNom(result.getString("nom"));
					employe.setPrenom(result.getString("prenom"));
					
				}
				result.close();
				state.close();
			}
			catch (SQLException e) {e.printStackTrace();}
			return employe;
		}
		
}
