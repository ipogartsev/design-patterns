package model;

public class Employe {
	 private int id;
	 private String nom;
	 private String prenom;
	 private String login;
	 private String password;
	 
	public Employe(int id, String nom, String prenom, String login, String password) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.password = password;
	}
	public Employe() {
		this.id = 0;
		this.nom = null;
		this.prenom = null;
		this.login = null;
		this.password = null;
	}
	
	

	@Override
	public String toString() {
		return "Employe [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	 
	 

}
