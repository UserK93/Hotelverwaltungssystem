/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.prakt.buchungen;
import java.util.*;
import se.prakt.hotel.*;
/**
 *
 * @author user
 */
public class Kunde {
    private String name;
    private int kundenNr;
    private ArrayList<Buchung> buchung;
    
    public Kunde(String eName, int eKundenNr)
    {
        this.name=eName;
        this.kundenNr=eKundenNr;
        buchung= new ArrayList<Buchung>();
    }
    
    public String getName()
    {return this.name;}
    
    public int getKundenNr()
    {return this.kundenNr;}
    
    public void setName(String eName)
    {this.name=eName;}

    public void setKundenNr(int eKundenNr)
    {this.kundenNr=eKundenNr;}
    
    public void addBuchung(Buchung eBuchung)
    { buchung.add(eBuchung);}
    public void delBuchung (Buchung eBuchung)
    { buchung.remove(eBuchung);}
    
    
    public int gesamtKosten()
    {
        int i;
        int anzahlTage;
        int preis=0;
        
        for (i=0;i<this.buchung.size();i++)
        {
            anzahlTage = this.buchung.get(i).getAnzahlTage();
            preis += anzahlTage * this.buchung.get(i).getZimmerBuchung().getTagespreis();
        
        
            
        }
        return preis;
    }
}
