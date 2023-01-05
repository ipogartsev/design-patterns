package model;

import java.util.Date;

public class Conge {
	@Override
	public String toString() {
		return "Conge [id=" + id + ", empId=" + empId + ", debut=" + debut + ", fin=" + fin + ", etat=" + etat + "]";
	}

	private int id;
	private int empId;
	private Date debut;
	private Date fin;
	private String etat;
	
	public Conge(int id, int empId, Date debut, Date fin, String etat) {
		this.id = id;
		this.empId = empId;
		this.debut = debut;
		this.fin = fin;
		this.etat = etat;
	}
	public Conge() {
		this.id = 0;
		this.empId = 0;
		this.debut = null;
		this.fin = null;
		this.etat = null;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public Date getDebut() {
		return debut;
	}

	public void setDebut(Date debut) {
		this.debut = debut;
	}

	public Date getFin() {
		return fin;
	}

	public void setFin(Date fin) {
		this.fin = fin;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}
	
	

}
