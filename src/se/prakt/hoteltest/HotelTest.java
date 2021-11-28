/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.prakt.hoteltest;

import se.prakt.buchungen.*;
import se.prakt.hotel.*;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hotel h1, h2, h3;
        Zimmer z1, z2, z3, z4, z5;
        Kunde k0, k1, k2, k3;
        Buchung b1, b2, b3, b4;

        h1 = new Hotel("Berlin", "Adlon");
        h2 = new Hotel("Hamburg", "Kaiser");
        h3 = new Hotel("Essen", "Schlafhof");

        z1 = new Zimmer(66, 134, h2);
        z2 = new Zimmer(115, 33, h2);
        z3 = new Zimmer(345, 66, h1);
        z4 = new Zimmer(234, 456, h2);
        z5 = new Zimmer(99, 334, h3);

        /* Hotel wird hier mit Zimmer assoziert */
        h1.addZimmer(z3);
        h2.addZimmer(z1);
        h2.addZimmer(z2);
        h2.addZimmer(z4);
        h3.addZimmer(z5);

        k1 = new Kunde("Peter", 334);
        k2 = new Kunde("Ernst", 445);
        k3 = new Kunde("Michael", 67);

        b1 = new Buchung(3, k1, z2);
        b2 = new Buchung(9, k1, z1);
        b3 = new Buchung(5, k3, z4);
        b4 = new Buchung(33, k2, z5);

        /* Zimmer wird hier mit Buchung assoziert */
        z2.addBuchung(b1);
        z1.addBuchung(b2);
        z4.addBuchung(b3);
        z5.addBuchung(b4);

        /* Kunde wird hier mit Buchung assoziert */
        k1.addBuchung(b1);
        k1.addBuchung(b2);
        k2.addBuchung(b4);
        k3.addBuchung(b3);

        System.out.println("Gesamtkosten fuer Peter ist " + k1.gesamtKosten());
        System.out.println("Gesamtkosten fuer Ernst ist " + k2.gesamtKosten());
        System.out.println("Gesamtkosten fuer Michael P ist " + k3.gesamtKosten());

    }

}
