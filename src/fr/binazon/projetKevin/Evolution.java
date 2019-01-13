package fr.binazon.projetKevin;

public class Evolution {
	private boolean termine = false;
	private Cours cours;
	private Compte compte;
	public boolean getTermine() {
		return termine;
	}
	public Evolution(Compte compte, Cours cours) {
		this.compte = compte;
		this.cours = cours;
	}

	public void setTermine(boolean termine) {
		this.termine = termine;
	}
	public boolean estTermine() {
		return this.termine==true;
	}
}
