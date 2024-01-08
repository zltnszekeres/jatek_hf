package model;


public class Predator extends Karakter {
    public double tuzero;

    public Predator( String felhasznaloNev) {
        super(felhasznaloNev);
        this.tuzero = 100;
    }
    
    public double getTuzero(){
        return tuzero;
    }
    
    public void setTuzero(){
    
        this.tuzero *= .96;
    }
    
    public void setTuzeroKimelo (){
    
    this.tuzero *= .99;
    }

    @Override
    public String toString() {
        
        String os =super.toString();
        return os +" <|ext-- "
                + "Predator{" + "tuzero=" + tuzero + '}';
    }

    
}
