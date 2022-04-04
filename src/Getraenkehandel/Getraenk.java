package Getraenkehandel;

import java.lang.*;
import java.util.Scanner;

public class Getraenk extends Artikel
{
	
	public Getraenk(){
		super();
	}
	public Getraenk(String name, int preis, int bestand, double lagertemp){
		super(name, preis, bestand, lagertemp);
	}

	protected String name;
	protected int preis;
	protected int bestand;
	
	
	// setzen der Werte Name,preis und Bestand
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPreis(int preis) {
		this.preis = preis;
	}

	public void setBestand(int bestand) {
		this.bestand = bestand;
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
	public String getraenkverkaufen(int verkaufsmenge)
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

	
	
	

}
	


