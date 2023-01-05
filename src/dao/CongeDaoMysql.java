package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.Conge;

public class CongeDaoMysql implements ICongeDao{
	
	Connection conn = null;
	Statement state = null;
	ResultSet result = null;
	
	/*public void stateCreate() {
		try {
			state = conn.createStatement();
		} catch(SQLException e) {e.printStackTrace();}
	}*/

	public CongeDaoMysql(Connection connection){
		 this.conn = connection;
	}
	
	@Override
	public List<Conge> getAllConge(){
		List<Conge> conges = new ArrayList<Conge>();
		Conge conge = null;
		try {
			state = conn.createStatement();
			result = state.executeQuery("SELECT * FROM conge");
			while(result.next()) {
				conge = new Conge();
				conge.setId(result.getInt("id"));
				conge.setEmpId(result.getInt("empId"));
				conge.setDebut(result.getDate("debut"));
				conge.setFin(result.getDate("fin"));
				conge.setEtat(result.getString("etat"));
				conges.add(conge);
            }
			result.close();
			state.close();
		}
		catch (SQLException e) {e.printStackTrace();}
		return conges;
	}

	@Override
	public Conge getCongeById(int id) {
		Conge conge = null;
		try {
			state = conn.createStatement();
			result = state.executeQuery("SELECT * FROM conge WHERE id=" + id);
			while(result.next()) {
				conge = new Conge();
				conge.setId(result.getInt("id"));
				conge.setEmpId(result.getInt("empId"));
				conge.setDebut(result.getDate("debut"));
				conge.setFin(result.getDate("fin"));
				conge.setEtat(result.getString("etat"));
			}
			result.close();
			state.close();
		}
		catch (SQLException e) {e.printStackTrace();}
		return conge;
	}
	
	@Override
	public List<Conge> getCongeByDebut(Date debut) {
		List<Conge> conges = new ArrayList<Conge>();
		Conge conge = null;
		try {
			state = conn.createStatement();
			result = state.executeQuery("SELECT * FROM conge WHERE debut=" + debut);
			while(result.next()) {
				conge = new Conge();
				conge.setId(result.getInt("id"));
				conge.setEmpId(result.getInt("empId"));
				conge.setDebut(result.getDate("debut"));
				conge.setFin(result.getDate("fin"));
				conge.setEtat(result.getString("etat"));
				conges.add(conge);
			}
			result.close();
			state.close();
		}
		catch (SQLException e) {e.printStackTrace();}
		return conges;
	}
	@Override
	public List<Conge> getCongeByDebutFin(Date debut, Date fin) {
		List<Conge> conges = new ArrayList<Conge>();
		Conge conge = null;
		try {
			state = conn.createStatement();
			result = state.executeQuery("SELECT * FROM conge WHERE debut=" + debut +  "AND fin=" + fin );
			while(result.next()) {
				conge = new Conge();
				conge.setId(result.getInt("id"));
				conge.setEmpId(result.getInt("empId"));
				conge.setDebut(result.getDate("debut"));
				conge.setFin(result.getDate("fin"));
				conge.setEtat(result.getString("etat"));
				conges.add(conge);
			}
			result.close();
			state.close();
		}
		catch (SQLException e) {e.printStackTrace();}
		return conges;
	}
}
	
	

