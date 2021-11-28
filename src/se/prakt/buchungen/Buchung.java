/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.prakt.buchungen;
import se.prakt.hotel.*;
/**
 *
 * @author user
 */
public class Buchung {
    private int anzahlTage;
    private Kunde buchung;
    private Zimmer zimmerBuchung;
    
   
    public Buchung (int eAnzahlTage, Kunde k , Zimmer zb)
    {
        this.anzahlTage=eAnzahlTage;
        buchung=k; 
        zimmerBuchung=zb;
    }
    
    public int getAnzahlTage()
    {return this.anzahlTage;}
    
    public void setAnzahlTage(int eAnzahlTage)
    {this.anzahlTage=eAnzahlTage;}

    public Zimmer getZimmerBuchung()
    {return this.zimmerBuchung;}
}
