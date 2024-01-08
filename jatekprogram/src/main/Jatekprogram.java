
package main;

import model.Alien;
import model.Predator;
import model.Jatek;

public class Jatekprogram {

   private Jatek jatek;
    
    public static void main(String[] args) {
        new Jatekprogram();
    }
    
     public Jatekprogram() {
        jatek = new Jatek(4);
        
        
        jatek.bejelentkezik(new Predator("XXXYYYY"));
        jatek.bejelentkezik(new Alien("micimacko"));
        jatek.bejelentkezik(new Predator("gamer21"));
        jatek.bejelentkezik(new Predator("foreveryoung"));
        
        System.out.println("--- jatek ELoTT:");
        jatekKarakterKiir();
        
        System.out.println("--- az 1. szokásos jatek UTaN:");
        jatek.jatszik();
        jatekKarakterKiir();
        
        System.out.println("--- a 2.  szokasos jatek UTaN:");
        jatek.jatszik();
        jatekKarakterKiir();
        
        System.out.println("--- a 3. Tuzerokimélojatek  UTaN:");
        jatek.kimeloJatek();
        jatekKarakterKiir();
        
        for (int i = 0; i < 3; i++) {
            jatek.kimeloJatek();
        System.out.println("--- 3 TuzeroKimélo jatek utan:");
        jatek.kimeloJatek();
        jatekKarakterKiir();
    }
    }
    private void jatekKarakterKiir() {
        for (String karakter : jatek.getKarakterekLeirasa()) {
            if(karakter != null){
                System.out.println(karakter);
            }
        }
  
    
}
    
}
