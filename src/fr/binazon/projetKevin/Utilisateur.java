package fr.binazon.projetKevin;

public class Utilisateur {
	private String nom;
	private String prenom;
	private Compte compte;
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
}
