package dao;

import java.util.List;

import model.Employe;


public interface IEmployeDao {
	/**
	 * recuperer tous les employes
	 * @return list des employes
	 */
	public List<Employe> getAllEmploye();
	
	/**
	 * recuperer un conge par son id unique
	 * @param id cle primaire
	 * @return un employe
	 */
	public Employe getEmployeById(int id);
	
}
