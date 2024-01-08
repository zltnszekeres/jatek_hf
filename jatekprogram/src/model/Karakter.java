
package model;


public abstract class Karakter {
    private String felhasznaloNeve;
    private boolean jatszott;

    public Karakter( String felhasznaloNev) {
        
        this.felhasznaloNeve=felhasznaloNev;
        this.jatszott = false;
        
    }

    public String getFelhasznaloNev() {
        return felhasznaloNeve;
    }

    public boolean isJatszott() {
        return jatszott;
    }

    public void setFelhasznaloNev(String felhasznaloNeve) {
        this.felhasznaloNeve = felhasznaloNeve;
    }

    public void setJatszott(boolean jatszott) {
        this.jatszott = jatszott;
    }

    @Override
    public String toString() {
        return "Karakter{" + "felhasznaloNeve=" + felhasznaloNeve + ", jatszott=" + jatszott + '}';
    }
    
    
}
