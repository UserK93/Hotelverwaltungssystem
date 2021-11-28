/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.prakt.hotel;
import java.util.*;
import se.prakt.buchungen.*;
/**
 *
 * @author user
 */
public class Zimmer {
    private int tagespreis;
    private int zimmerNr;
    private Hotel zimmer;
    private ArrayList<Buchung> zimmerBuchung;
    
    public Zimmer(int eTagespreis , int eZimmerNr, Hotel h)
    { 
        this.tagespreis=eTagespreis;
        this.zimmerNr= eZimmerNr;
        zimmer = h;
        zimmerBuchung = new ArrayList<Buchung>();
    }
    
    public int getTagespreis()
    {return this.tagespreis;}
    
    public int getZimmerNr()
    {return this.zimmerNr;}
    
    public void setTagespreis (int eTagespreis)
    {this.tagespreis= eTagespreis;}
    
    public void setZimmerNr (int eZimmerNr)
    {this.zimmerNr=eZimmerNr;}
    
    public void addBuchung (Buchung eBuchung)
    {zimmerBuchung.add(eBuchung);}
    public void delBuchung (Buchung eBuchung)
    {zimmerBuchung.remove(eBuchung);}
}
