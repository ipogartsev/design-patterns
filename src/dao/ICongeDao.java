package dao;

import java.util.Date;
import java.util.List;
import model.Conge;

public interface ICongeDao {
	/**
	 * recuperer tous les conges
	 * @return list des conges
	 */
	public List<Conge> getAllConge();
	
	/**
	 * recuperer un conge par son id unique
	 * @param id cle primaire
	 * @return un conge
	 */
	public Conge getCongeById(int id);
	
	/**
	 * recuperer un conge par date de debut de conge
	 * @param debut date
	 * @return un conge
	 */
	public List<Conge> getCongeByDebut(Date debut);
	
	/**
	 * recuperer un conge par date de debut et date de fin
	 * @param debut date
	 * @param fin date
	 * @return
	 */
	public List<Conge> getCongeByDebutFin(Date debut, Date fin);

}
