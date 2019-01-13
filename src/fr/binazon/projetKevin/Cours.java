package fr.binazon.projetKevin;

import java.util.ArrayList;
import java.util.List;

public class Cours {
	private String libelle;
	private String description;
	private List<Evolution> evolutions= new ArrayList<>();
	private List<Exercice> exercices = new ArrayList<>();
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean rechercheExo(Exercice exercice) {
		for(int i=0; i<exercices.size(); i++) {
			if(exercices.contains(exercice)) return true;
		}
		return false;
	}
	public List<Exercice> getExercices() {
		return exercices;
	}
	public void setExercices(List<Exercice> exercices) {
		this.exercices = exercices;
	}
}
