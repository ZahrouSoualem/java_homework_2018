package com.zahrou.EXO10;

public class personne {
	protected  String nom;
	protected String prenom;
	protected int age ;
	public personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
		
	}
	public static boolean identique(personne nom1, personne pre) {
		return (nom1.nom == pre.nom)&&(nom1.prenom==pre.prenom);
	}
	public boolean identique(personne per){
		return (per.nom == nom)&&(per.prenom==prenom)&&(per.age == age);
	}
}
