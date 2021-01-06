/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelplace;

/**
 *
 * @author user
 */
public class TravelPlace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("---AFRICA---");
        continentAfrica cf = new continentAfrica("Seychelles", " Pulau Praslin");
        System.out.println("Africa Continent : " + cf.toString());
        cf.food();
        cf.food1();
        cf.car();
        
    
        System.out.println("\n---ASIA---");
        continentAsia1 ca = new continentAsia1("Perak", " Pulau Pangkor");
        System.out.println("Asia Continent : " + ca.toString());
        cf.food();
        ca.food2();
        ca.car();
        
        System.out.println("\n---AUSTRALIA---");
        continentAustralia cs = new continentAustralia("Queensland", " Pulau Fraser");
        System.out.println("Australia Continent : " + cs.toString());
        cf.food();
        cs.food3();
        cs.car();
        cs.temp(); //abstraction methods
        
        System.out.println("\n---EUROPE---");
        continentEurope ce = new continentEurope("Norway", " Pulau Lyngor");
        System.out.println("Europe Continent : " + ce.toString());
        cf.food();
        cf.car();
        ce.food4();
        
        
       
        
        
        
    }
    
}
