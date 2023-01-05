package tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import dao.DaoFactory;
import dao.ICongeDao;
import dao.IEmployeDao;
import model.Conge;
import model.Employe;




public class FactoryTest {
	
	
	public static void main(String[] args) {
		try {
			// Charger le driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("DRIVER OK!");
			// Se connecter à la BDD
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/formation","root", "");
            System.out.print("Database is connected !");
            
            // Instancier les DAO
            IEmployeDao employeDao = DaoFactory.getEmployeDao(conn);   
            ICongeDao congeDao =  DaoFactory.getCongeDao(conn);
            
            // Demander la list des employers
            List<Employe> employes = employeDao.getAllEmploye();
            System.out.println("\n-------------------Get All Employe------------------------");
            for(Employe employe: employes) {
            	System.out.println(employe.toString());
            	System.out.println("\n----------------------------------------------------");
            }
            
            List<Conge> conges = congeDao.getAllConge();
            System.out.println("\n-------------------Get All Conge------------------------");
            for(Conge conge: conges) {
            	System.out.println(conge.toString());
            	System.out.println("\n----------------------------------------------------");
            }
		}
		catch(Exception e) {}
		
	}
}
