

package model;


public class Alien extends Karakter {
    
     private KarakterSebessegek sebesseg;

    public Alien(KarakterSebessegek sebesseg, String felhasznaloNev) {
        super(felhasznaloNev);
        this.sebesseg = sebesseg;
    }

    public Alien(String felhasznaloNev) {
        this(KarakterSebessegek.GYORS,felhasznaloNev);
    }
    public void csokken(){
        if (sebesseg != KarakterSebessegek.KIMULOFELBEN){
    
            sebesseg = KarakterSebessegek.values()[sebesseg.ordinal()-1];
    }
    
    
    

   

    
    
    
}

    @Override
    public String toString() {
        
        String os = super.toString();
                
        return os + " <|ext-- "
                +"Alien{" + "sebesseg=" + sebesseg + '}';
    }
    
    
    public KarakterSebessegek getSebesseg() {
        return sebesseg;
    }
    
    
    
    
}
