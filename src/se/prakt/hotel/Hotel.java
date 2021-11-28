/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.prakt.hotel;
import java.util.*;
/**
 *
 * @author user
 */
public class Hotel {
    private String stadt;
    private String name;
    private ArrayList<Zimmer> zimmer;
    
    public Hotel(String eStadt,String eName)
    { 
      this.stadt= eStadt;
      this.name=eName;
      zimmer=new ArrayList<Zimmer>();
    }
    
    public String getStadt ()
    {  return this.stadt;}
    public String getName ()
    {return this.name;}
    
    public void setStadt (String eStadt)
    { this.stadt=eStadt;}
    public void setName (String eName)
    { this.name=eName;}
    
    public void addZimmer(Zimmer eZimmer)
    {zimmer.add(eZimmer);}
    public void delZimmer (Zimmer eZimmer)
    {zimmer.remove(eZimmer);}
}
