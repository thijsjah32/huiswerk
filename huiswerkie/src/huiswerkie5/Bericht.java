
package huiswerkie5;

import java.time.LocalDateTime;

public class Bericht {
    private Gebruiker afzender;
    private String bericht;
    public LocalDateTime datum;
    
    public Bericht(Gebruiker afzender, String bericht){
        this.afzender = afzender;
        this.bericht = bericht;
        this.datum = LocalDateTime.now();
        
    }
    
    public String toString(){
        return afzender + " (" + datum + "): " + bericht;
    }

    public Gebruiker getAfzender() {
        return afzender;
    }
    public void setAfzender(Gebruiker afzender) {
        this.afzender = afzender;
    }
    public String getBericht() {
        return bericht;
    }
    public void setBericht(String bericht) {
        this.bericht = bericht;
    }
    public LocalDateTime getDatum() {
        return datum;
    }
    public void setDatum(LocalDateTime datum) {
        this.datum = datum;
    }
    
    
    
}
