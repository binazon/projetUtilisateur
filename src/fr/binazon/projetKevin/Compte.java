package fr.binazon.projetKevin;

import java.util.ArrayList;
import java.util.List;

public class Compte {
	private String login;
	private String motDePasse;
	private boolean connect = false;
	private List<Evolution> evolutions = new ArrayList<>();
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	public boolean estConnecte() {
		return this.connect==true;
	}
	public boolean estDeconnecte() {
		return this.connect==false;
	}
	public boolean isConnect() {
		return connect;
	}
	public void setConnect(boolean connect) {
		this.connect = connect;
	}
	public void suivreCours(Cours cours) {
		evolutions.add(new Evolution(this, cours));
		evolutions.get(evolutions.size()).setTermine(true);
	}
	public void traiterExercice(Cours cours, Exercice exercice) {
		cours.getExercices().add(exercice);
	}
}
