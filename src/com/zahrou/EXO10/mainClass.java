package com.zahrou.EXO10;

public class mainClass {

	public static void main(String[] args) {
		personne myPerssone = new personne("zahrou","soualem");
		Etediant1 MyEtud =new Etediant1("zahrou","soualem","informatique");
		Etediant1 MySecEtud =new Etediant1("zahrou","soualem","mathemathique");
		System.out.println(MyEtud.identique(MySecEtud));
		System.out.println(myPerssone.identique(MyEtud));
		System.out.println(MyEtud.identique(myPerssone));
		System.out.println(personne.identique(MyEtud,MySecEtud));
		
		
		System.out.println("The Second output is : ");
		personne myPerssone1 = new personne("zahrou","soualem");
		Etediant2 MyEtud1 =new Etediant2("zahrou","soualem","informatique");
		Etediant2 MySecEtud1 =new Etediant2("zahrou","soualem","mathemathique");
		//MyEtud1.identique(MySecEtud1);
		System.out.println(MyEtud1.identique(MySecEtud1));
		System.out.println(myPerssone1.identique(MyEtud1));
		System.out.println(MyEtud1.identique(myPerssone1));
		System.out.println(personne.identique(MyEtud,MySecEtud1));

		
	}

}
