package Getraenkehandel;

import java.util.ArrayList;
import java.util.Scanner;

public class Getraenkeverwaltung 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		//Getränk 1
		Getraenk getraenk1 = new Getraenk ();
		getraenk1.setName("vodka");
		String name1 = getraenk1.getName();
		
		getraenk1.setPreis (12);
		double preis1 = getraenk1.getPreis();
		getraenk1.setBestand (20);
		
		//Getränk 2
		Getraenk getraenk2 = new Getraenk ();
		getraenk2.setName("Whiskey");
		String name2 = getraenk2.getName();
		
		getraenk2.setPreis (15);
		double preis2 = getraenk2.getPreis();
		getraenk2.setBestand (30);
		
		//Getränk 3
		Getraenk getraenk3 = new Getraenk ();
		getraenk3.setName("Wein");
		String name3 = getraenk1.getName();
		
		getraenk3.setPreis (10);
		double preis3 = getraenk1.getPreis();
		getraenk3.setBestand (45);
		
		//Snack 1
		Snack snack1 = new Snack ();
		snack1.setName("Bretzel");
		String s_name1 = snack1.getName();
		double lagertemp1 = snack1.getLagertemp();
		
		snack1.setPreis (1);
		double s_preis1 = snack1.getPreis();
		snack1.setBestand(40);
		snack1.setLagertemp(20);
		
		//Snack 2
		Snack snack2 = new Snack ();
		snack2.setName("Nic Nac's");
		String s_name2 = snack2.getName();
		
		snack2.setPreis (2);
		double s_preis2 = snack2.getPreis();
		snack2.setBestand(50);
		snack2.setLagertemp(20);
		
		//Snack 3
		Snack snack3 = new Snack ();
		snack3.setName("Chips");
		String s_name3 = snack3.getName();
		
		snack3.setPreis (2);
		double s_preis3 = snack3.getPreis();
		snack3.setBestand(100);
		snack3.setLagertemp(20);
		
		//Arraylist erstellen
		ArrayList<Getraenk> getraenkeListe = new ArrayList<Getraenk>();
		
		getraenkeListe.add(getraenk1);
		getraenkeListe.add(getraenk2);
		getraenkeListe.add(getraenk3);
		
		System.out.println("Getraenkeliste: \n");
		
		for(Getraenk g : getraenkeListe)
			{
			System.out.print("Getraenkename: " +g.getName()+ "\n");
			System.out.print("Bestand des Getraenks: " +g.getBestand()+ " Flaschen \n");
			System.out.print("Getraenkepreis: " +g.getPreis()+ " € \n" + " \n");
			}
		
		
		ArrayList<Snack> snackListe = new ArrayList<Snack>();
				
			snackListe.add(snack1);
			snackListe.add(snack2);
			snackListe.add(snack3);
			
			System.out.println("Snackliste: \n");
			
			for(Snack s : snackListe)
				{
				System.out.print("Snackname: " +s.getName()+ "\n");
				System.out.print("Snackbestand: " +s.getBestand()+ " Packungen \n");
				System.out.print("Snackpreis: " +s.getPreis()+ " €" + "\n");
				System.out.print("Lagertemperatur:" + s.getLagertemp()+ " °C" + "\n" + "\n");
				}
		
		
		
		 
	
		//Startausgabe
		System.out.println("Herzlich Willkommen zur Getränke-/Snackverwaltung! \n");
		
		//Ausgabe des Bestandes vor erhöhung
		System.out.println("Bestand an " + getraenk1.getName() +" vor Bestellung:");
				System.out.println(getraenk1.getBestand());
				
				//Bestellung von 1000 Einheiten des ersten Getränks:
				getraenk1.bestandErhoehen(1000);
				
				System.out.println("Bestand an " + getraenk1.getName() +" nach Bestellung:");
				System.out.println(getraenk1.getBestand() + " \n");
				
				
				//Verkauf von 500 Einheiten des ersten Getränks:
				System.out.println(getraenk1.getraenkverkaufen(500));
				
				System.out.println("Bestand nach Verkauf:");
				System.out.println(getraenk1.getBestand());
				
		System.out.println("Getraenk: " + getraenk1.getName() + ". Preis: " + getraenk1.getPreis()+ " €" + "\n");
		
		System.out.println("[1] " + "Bestanderhoehung Getränke");
		System.out.println("[2] " + "Getraenkeverkauf");
		System.out.println("[3] " + "Preisaenderung Getränke");
		System.out.println("[4] " + "Bestanderhoehung Snacks");
		System.out.println("[5] " + "Snackverkauf");
		System.out.println("[6] " + "Preisaenderung Snacks");
		
		{
			Scanner tastatur = new Scanner(System.in);
			
			int x = tastatur.nextInt();

		    switch ( x )
		    {
		      case 1:
		    	  System.out.println("\n" + "<Bestandserhoehung Getränke> Bitte Getraenk auswaehlen:" + "\n");
		    	  System.out.println("[1] " + "Bestandserhoehung Vodka");
		    	  System.out.println("[2] " + "Bestandserhoehung Whiskey");
		    	  System.out.println("[3] " + "Bestandserhoehung Wein");
		    	  
		    	  int y = tastatur.nextInt();
		    	  
		    	  switch ( y )
		    	  {
		    	  case 1:
		    		  	System.out.println("\n" + "<Bestandserhoehung Vodka> Bitte Menge eingeben:");
		    	  		int bestandserhoehung1 =   tastatur.nextInt();
		    	  		getraenk1.bestandErhoehen(bestandserhoehung1);
		    	  		System.out.println("Der neue Bestand von " +getraenk1.getName()+ " betraegt:"+getraenk1.getBestand()+ " Flaschen.");
		    	  		
		    	  		break;
		    	  case 2:
		    		  	System.out.println("\n" + "<Bestandserhoehung Whiskey> Bitte Menge eingeben:");
		    		  	int bestandserhoehung2 =   tastatur.nextInt();
			    	  	getraenk2.bestandErhoehen(bestandserhoehung2);
			    	  	System.out.println("Der neue Bestand von " +getraenk2.getName()+ " betraegt:"+getraenk2.getBestand()+ " Flaschen.");
			    	  	break;
		    	  case 3:
		    		  	System.out.println("\n" + "<Bestandserhoehung Wein> Bitte Menge eingeben:");
		    		  	int bestandserhoehung3 =   tastatur.nextInt();
			    	  	getraenk3.bestandErhoehen(bestandserhoehung3);
			    	  	System.out.println("Der neue Bestand von " +getraenk3.getName()+ " betraegt:"+getraenk3.getBestand()+ " Flaschen.");
			    	  	break;
		    	  default:
				        System.err.println( "Auswahl " + y + " nicht moeglich");
		    	  }
		        break;
		        
		      case 2:
		    	  System.out.println("\n" + "<Getraenkeverkauf> Bitte Getraenk auswaehlen:" + "\n");
		    	  System.out.println("[1] " + "Getraenkeverkauf Vodka");
		    	  System.out.println("[2] " + "Getraenkeverkauf Whiskey");
		    	  System.out.println("[3] " + "Getraenkeverkauf Wein");
		    	  
		    	  int z = tastatur.nextInt();
		    	  
		    	  switch ( z )
		    	  {
		    	  case 1:
		    		  	System.out.println("\n" + "<Getraenkeverkauf Vodka> Bitte Verkaufsmenge eingeben:");
		    	  		int getraenkverkaufen1 =   tastatur.nextInt();
		    	  		getraenk1.getraenkverkaufen(getraenkverkaufen1);
		    	  		System.out.println("Der neue Bestand nach dem Verkauf von " +getraenk1.getName()+ " betraegt:"+getraenk1.getBestand()+ " Flaschen.");
		    	  		System.out.println(getraenk1.getraenkverkaufen(getraenkverkaufen1));
		    	  		break;
		    	  case 2:
		    		  	System.out.println("\n" + "<Getraenkeverkauf Whiskey> Bitte Verkaufsmenge eingeben:");
		    		  	int getraenkverkaufen2 =   tastatur.nextInt();
			    	  	getraenk2.getraenkverkaufen(getraenkverkaufen2);
			    	  	System.out.println("Der neue Bestand nach dem Verkauf von " +getraenk2.getName()+ " betraegt:"+getraenk2.getBestand()+ " Flaschen.");
			    	  	System.out.println(getraenk2.getraenkverkaufen(getraenkverkaufen2));
			    	  	break;
		    	  case 3:
		    		  	System.out.println("\n" + "<Getraenkeverkauf Wein> Bitte Verkaufsmenge eingeben:");
		    		  	int getraenkverkaufen3 =   tastatur.nextInt();
			    	  	getraenk3.getraenkverkaufen(getraenkverkaufen3);
			    	  	System.out.println("Der neue Bestand nach dem Verkauf von " +getraenk3.getName()+ " betraegt:"+getraenk3.getBestand()+ " Flaschen.");
						System.out.println(getraenk3.getraenkverkaufen(getraenkverkaufen3));
			    	  	break;
		    	  default:
				        System.err.println( "Auswahl " + z + " nicht moeglich");
		    	  }
		        break;
		        
		      case 3:
		    	  System.out.println("\n" + "<Preisaenderung> Bitte Getraenk auswaehlen:" + "\n");
		    	  System.out.println("[1] " + "Preisaenderung Vodka");
		    	  System.out.println("[2] " + "Preisaenderung Whiskey");
		    	  System.out.println("[3] " + "Preisaenderung Wein");
		    	  
		    	  int g = tastatur.nextInt();
  
		    	  switch ( g )
		    	  {
		    	  case 1:
		    		  	System.out.println("\n" + "<Preisaenderung Vodka> Bitte den neuen Preis eingeben:");
		    	  		int PreisVeraendern1 =   tastatur.nextInt();
		    	  		getraenk1.PreisVeraendern(PreisVeraendern1);
		    	  		System.out.println("Der neue Preis nach der Preisaenderung von " +getraenk1.getName()+ " betraegt:"+getraenk1.getPreis()+ " Euro.");
		    	  		break;
		    	  case 2:
		    		  	System.out.println("\n" + "<Preisaenderung Whiskey> Bitte den neuen Preis eingeben:");
		    		  	int PreisVeraendern2 =   tastatur.nextInt();
			    	  	getraenk2.PreisVeraendern(PreisVeraendern2);
			    	  	System.out.println("Der neue Preis nach der Preisaenderung von " +getraenk2.getName()+ " betraegt:"+getraenk2.getPreis()+ " Euro.");
			    	  	break;
		    	  case 3:
		    		  	System.out.println("\n" + "<Preisaenderung Wein> Bitte den neuen Preis eingeben:");
		    		  	int PreisVeraendern3 =   tastatur.nextInt();
			    	  	getraenk3.PreisVeraendern(PreisVeraendern3);
			    	  	System.out.println("Der neue Preis nach der Preisaenderung von " +getraenk3.getName()+ " betraegt:"+getraenk3.getPreis()+ " Euro.");
			    	  	break;
		    	  default:
				        System.err.println( "Auswahl " + g + " nicht moeglich");
		    	  }
		    	 break;
		      
		      case 4:
		    	  System.out.println("\n" + "<Bestandserhoehung Snacks> Bitte Snack auswaehlen:" + "\n");
		    	  System.out.println("[1] " + "Bestandserhoehung Bretzel");
		    	  System.out.println("[2] " + "Bestandserhoehung Nic Nac's");
		    	  System.out.println("[3] " + "Bestandserhoehung Chips");
		    	  
		    	  int i = tastatur.nextInt();
		    	  
		    	  switch ( i )
		    	  {
		    	  case 1:
		    		  	System.out.println("\n" + "<Bestandserhoehung Bretzel> Bitte Menge eingeben:");
		    	  		int bestandserhoehung1 =   tastatur.nextInt();
		    	  		snack1.bestandErhoehen(bestandserhoehung1);
		    	  		System.out.println("Der neue Bestand von " +snack1.getName()+ " betraegt:"+snack1.getBestand()+ " Flaschen.");
		    	  		
		    	  		break;
		    	  case 2:
		    		  	System.out.println("\n" + "<Bestandserhoehung Nic Nac's> Bitte Menge eingeben:");
		    		  	int bestandserhoehung2 =   tastatur.nextInt();
		    		  	snack2.bestandErhoehen(bestandserhoehung2);
			    	  	System.out.println("Der neue Bestand von " +snack2.getName()+ " betraegt:"+snack2.getBestand()+ " Flaschen.");
			    	  	break;
		    	  case 3:
		    		  	System.out.println("\n" + "<Bestandserhoehung Chips> Bitte Menge eingeben:");
		    		  	int bestandserhoehung3 =   tastatur.nextInt();
		    		  	snack3.bestandErhoehen(bestandserhoehung3);
			    	  	System.out.println("Der neue Bestand von " +snack3.getName()+ " betraegt:"+snack3.getBestand()+ " Flaschen.");
			    	  	break;
		    	  default:
				        System.err.println( "Auswahl " + i + " nicht moeglich");
				        
		    	  }
	    		  	break;
	    		  	
	    	  case 5:
	    		  System.out.println("\n" + "<Snackverkauf> Bitte Snack auswaehlen:" + "\n");
		    	  System.out.println("[1] " + "Snackverkauf Bretzel");
		    	  System.out.println("[2] " + "Snackverkauf Nic Nac's");
		    	  System.out.println("[3] " + "Snackverkauf Chips");
		    	  
		    	  int a = tastatur.nextInt();
		    	  
		    	  switch ( a )
		    	  {
		    	  case 1:
		    		  	System.out.println("\n" + "<Snackverkauf Vodka> Bitte Verkaufsmenge eingeben:");
		    	  		int snackverkaufen1 =   tastatur.nextInt();
		    	  		snack1.snackverkaufen(snackverkaufen1);
		    	  		System.out.println("Der neue Bestand nach dem Verkauf von " +snack1.getName()+ " betraegt:"+snack1.getBestand()+ " Flaschen.");
		    	  		System.out.println(snack1.snackverkaufen(snackverkaufen1));
		    	  		break;
		    	  case 2:
		    		  	System.out.println("\n" + "<Getraenkeverkauf Whiskey> Bitte Verkaufsmenge eingeben:");
		    		  	int snackverkaufen2 =   tastatur.nextInt();
		    		  	snack2.snackverkaufen(snackverkaufen2);
			    	  	System.out.println("Der neue Bestand nach dem Verkauf von " +snack2.getName()+ " betraegt:"+snack2.getBestand()+ " Flaschen.");
			    	  	System.out.println(snack2.snackverkaufen(snackverkaufen2));
			    	  	break;
		    	  case 3:
		    		  	System.out.println("\n" + "<Getraenkeverkauf Wein> Bitte Verkaufsmenge eingeben:");
		    		  	int snackverkaufen3 =   tastatur.nextInt();
		    		  	snack3.snackverkaufen(snackverkaufen3);
			    	  	System.out.println("Der neue Bestand nach dem Verkauf von " +snack3.getName()+ " betraegt:"+snack3.getBestand()+ " Flaschen.");
						System.out.println(snack3.snackverkaufen(snackverkaufen3));
			    	  	break;
		    	  default:
				        System.err.println( "Auswahl " + a + " nicht moeglich");
		    	  }
	    		  	break;
	    	  case 6:
	    		  System.out.println("\n" + "<Preisaenderung> Bitte Snack auswaehlen:" + "\n");
		    	  System.out.println("[1] " + "Preisaenderung Bretzel");
		    	  System.out.println("[2] " + "Preisaenderung Nic Nac's");
		    	  System.out.println("[3] " + "Preisaenderung Chips");
		    	  
		    	  int b = tastatur.nextInt();
  
		    	  switch ( b )
		    	  {
		    	  case 1:
		    		  	System.out.println("\n" + "<Preisaenderung Bretzel> Bitte den neuen Preis eingeben:");
		    	  		int PreisVeraendern1 =   tastatur.nextInt();
		    	  		snack1.PreisVeraendern(PreisVeraendern1);
		    	  		System.out.println("Der neue Preis nach der Preisaenderung von " +snack1.getName()+ " betraegt:"+snack1.getPreis()+ " Euro.");
		    	  		break;
		    	  case 2:
		    		  	System.out.println("\n" + "<Preisaenderung Nic Nac's> Bitte den neuen Preis eingeben:");
		    		  	int PreisVeraendern2 =   tastatur.nextInt();
			    	  	snack2.PreisVeraendern(PreisVeraendern2);
			    	  	System.out.println("Der neue Preis nach der Preisaenderung von " +snack2.getName()+ " betraegt:"+snack2.getPreis()+ " Euro.");
			    	  	break;
		    	  case 3:
		    		  	System.out.println("\n" + "<Preisaenderung Chips> Bitte den neuen Preis eingeben:");
		    		  	int PreisVeraendern3 =   tastatur.nextInt();
			    	  	snack3.PreisVeraendern(PreisVeraendern3);
			    	  	System.out.println("Der neue Preis nach der Preisaenderung von " +snack3.getName()+ " betraegt:"+snack3.getPreis()+ " Euro.");
			    	  	break;
		    	  default:
				        System.err.println( "Auswahl " + b + " nicht moeglich");
		    	  }
	    		  return;
	    	  default:
			        System.err.println( "Auswahl " + x + " nicht moeglich");
		    }
		}
	}
}
