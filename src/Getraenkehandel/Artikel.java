package Getraenkehandel;

public class Artikel { //Deklaration der Attribute
    protected String name;
    protected double preis;
    protected int bestand;
    protected double lagertemp;

    //Konstruktor
     public Artikel() {
       
    }
     
    public Artikel(String name, double preis, int bestand, double lagertemp) {
        this.name = name;
        this.preis = preis;
        this.bestand = bestand;
        this.lagertemp = lagertemp;
     }
  
//get-und set-Methoden
     public void setName(String name) {
        this.name = name;
     }
    public void setPreis(double preis) {
        this.preis = preis;
     }
    public void setBestand(int bestand) {
        this.bestand = bestand;
     }
        
    public void setLagertemp(double lagertemp) {
    	this.lagertemp = lagertemp;
     }

     public String getName()  {
        return name;
     }

     public double getPreis()  {
        return preis;
     }

     public int getBestand()  {
        return bestand;
     }
     
     public double getLagertemp()  {
         return lagertemp;
      }

     //Methoden zur Verwaltung der Getraenke
     //Diese Methode erhoeht den Bestand um die eingegebene Menge
     public void bestandErhoehen (int menge) {
        bestand = bestand + menge;
     }

     //Diese Methode verringert den Bestand um die Verkaufsmenge, ruft die Methode kassenzettelDrucken() auf und gibt den von ihr als Rueckgabewert erhaltenen String zurück
     public String verkaufen (int verkaufsmenge) {
      String ausgabetext;  
      if(bestand>=verkaufsmenge) {
            bestand = bestand - verkaufsmenge;
            ausgabetext = kassenzettelDrucken(verkaufsmenge);}
         else {
            ausgabetext= "Nicht genug Bestand";}
        return ausgabetext;
     }

     //Diese Methode berechnet den Gesamtpreis und gibt den Kassenzettel als String zurück
     public String kassenzettelDrucken (int verkaufsmenge) {
          String kassenzettel;

        double gesamtpreis;

        gesamtpreis = preis * verkaufsmenge;

        kassenzettel = "Name: " + name + 

        "\nVerkaufsmenge: " + verkaufsmenge+

        "\nPreis in Euro: " + preis +

        "\nGesamtpreis: " + gesamtpreis +     

        "\n";

        return kassenzettel;

    }
  
 }   

    
