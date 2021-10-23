package com.zahrou.EXO10;

public class Etediant2 extends personne  {
	private String spes;

	public Etediant2(String nom, String prenom, String spes) {
		super(nom, prenom);
		this.spes = spes;
	}
	public static boolean identique(Etediant2 nom1, Etediant2 pre) {
		return (nom1.nom == pre.nom)&&(nom1.prenom==pre.prenom);
	}
	public boolean identique(Etediant2 per){
		System.out.println(" 1 " + per.spes +" 2 " + spes);
		return (per.nom == nom)&&(per.prenom==prenom)&&(per.spes == spes);
	}
}
