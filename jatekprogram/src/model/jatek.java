
package model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Jatek {
    
    private Karakter[] karakterek;
    private int karakterDb;
    private boolean mukodik;

    public Jatek() {
        
        this(5);
    }
    
    
    

    public Jatek(int db) {
        
        karakterDb = 0;
        karakterek = new Karakter[db];
        mukodik = true;
        
       
    }
    
     public void bejelentkezik(Karakter karakter){
        if (mukodik) {
            if (karakterDb < karakterek.length) {
                karakterek[karakterDb++] = karakter;
            } else {
                System.out.println("Nem jelnekezhet be újabb játékos!");
            }
        } else {
            System.out.println("A játék nem működik!");
        }
        
     }
        
        
     public void kimeloJatek(){
            if(mukodik){
            for (Karakter karakter : karakterek) {
                karakter.setJatszott(true);
                if (karakter instanceof Predator) {
                    ((Predator) karakter).setTuzeroKimelo();
                }
            }
        }else{
            System.out.println("A jatek nem működik!");
        }
    }
     
     
     public void jatszik(){
        if (mukodik) {
            for (Karakter karakter: karakterek) {
                if (karakter != null) {
                    karakter.setJatszott(true);
                    if (karakter instanceof Predator) {
                        ((Predator) karakter).setTuzero();
                    }else if(karakter instanceof Alien){
                        ((Alien) karakter).csokken();
                    }
                }
            }
        } else {
            System.out.println("A jatek nem működik!");
        }
    }
     
     public Karakter kilep(String felhasznaloNeve){
        if (mukodik) {
            int i = 0;
            while (karakterek[i] == null || i < karakterDb && !(karakterek[i].getFelhasznaloNev().equals(felhasznaloNeve))) {
                i++;
            }
            if (i < karakterDb) {
                Karakter karakter = this.karakterek[i];
                boolean ingTipus = karakter instanceof Predator;
                String r_i = " karaktere";
                if (ingTipus) {
                    r_i = " ";
                }
                System.out.println(String.format("Kilépett %s %s!", felhasznaloNeve, r_i));
                karakterek[i] = null;
                return karakter;
            } else {
                System.out.println("Nincs ilyen jatekos !");
            }
        } else {
            System.out.println("A jatek nem működik!");
        }
        
        return null;
    }
     
     public String[] getKarakterekLeirasa() {
        String[] karakterek = new String[this.karakterek.length];
        for (int i = 0; i < karakterDb; i++) {
            Karakter karakter = this.karakterek[i];
            if(karakter != null){
                boolean predatorTipus = karakter instanceof Predator;
                String r_i = " predator karakterrel ";
                if(predatorTipus){
                    r_i = " alien karakterrel ";
                }
                karakterek[i] = karakter.getFelhasznaloNev() + r_i;
                karakterek[i] += karakter.isJatszott() ? "jatszott" : "nem jatszott";
                if(predatorTipus){
                    karakterek[i] += String.format(" (tuzereje: %.3f%%)", ((Predator)karakter).getTuzero());
                }else if(karakter instanceof Alien){
                    karakterek[i] += " sebessege: " + ((Alien)karakter).getSebesseg().toString();
                }
            }
        }
        return karakterek;
    }
     
     public Karakter[] getKarakter() {
        return karakterek;
    }
    
    
    public List<Karakter> getKarakterek(){
        List<Karakter> karakterekListaja = Arrays.asList(karakterek);
        return Collections.unmodifiableList(karakterekListaja);
    }
    
    public void aramKimaradas(){
        mukodik = false;
        karakterek = new Karakter[5];
    }
}
