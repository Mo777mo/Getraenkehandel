package Getraenkehandel;

import java.lang.*;

public class Snack extends Artikel {
	
	public Snack(){
		super();
	}
	public Snack(String name, double preis, int bestand, double lagertemp){
		super(name, preis, bestand, lagertemp);
	}
	
	protected String name;
	protected double preis;
	protected int bestand;
	protected double lagertemp;
	
	
	// setzen der Werte Name,preis und Bestand
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPreis(int preis) {
		this.preis = preis;
	}

	public void setBestand(int bestand){
		this.bestand = bestand;
	}
	
	public void setLagertemp(double lagertemp){
		this.lagertemp = lagertemp;
	}
	
	//Methode zum berechnen und ausgeben des Kassenbons
	public String kassenzettelDrucken(int verkaufsmenge) {
		// TODO Auto-generated method stub
		String kassenzettel;
		double gesamtpreis;
		gesamtpreis = preis * verkaufsmenge;
		kassenzettel ="Name:" +name+ 
				"\nVerkausmenge:" +verkaufsmenge+
				"\nPreis in Euro:" +preis+
				"\nGesamtpreis:" +gesamtpreis+
				"\n";
		return kassenzettel;
	}
	//Methode zum erhöhen des Bestandsmenge
	public void bestandErhoehen(int wert){
		bestand = bestand + wert;
	}
	//Methode zum reduzieren der Bestandsmenge
	public String snackverkaufen(int verkaufsmenge)
	{
		String ausgabetext;
		bestand = bestand - verkaufsmenge;
		ausgabetext = kassenzettelDrucken(verkaufsmenge);
		return ausgabetext;
	}
	public void PreisVeraendern(int neuerpreis)
	{
		preis = neuerpreis;
	}
	


	public String getName() {
		return name;
	}
	public double getPreis() {
		return preis;
	}
	public int getBestand() {
		return bestand;
	}
	public double getLagertemp() {
		return lagertemp;
	}
	
	
	

}
	


