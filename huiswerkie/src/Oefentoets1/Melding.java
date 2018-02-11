
package Oefentoets1;
import java.time.LocalDate;
import java.time.DayOfWeek;

public class Melding {
    private String berichtTekst;
    private int niveau;
    private String dagAanduiding;
    private LocalDate aanmaakDatum;
    private DayOfWeek dagVanBericht;
    public String niveauAlsTekst;
    public DayOfWeek aangepasteDag;
    private String nieuweDagAanduiding;
    
    
    public Melding(String berichtTekst, int niveau){
        this.berichtTekst = berichtTekst;
        setNiveau(niveau);
        setAangepasteDag(aangepasteDag);
        this.dagAanduiding = "vandaag";
        this.aanmaakDatum = LocalDate.now();
        this.dagVanBericht = aanmaakDatum.getDayOfWeek();
        this.nieuweDagAanduiding = "morgen";
    }
    
    public Melding(String berichtTekst){
        this(berichtTekst, 1);
    }
    
    public String toString(){
        return getNiveauAlsTekst() + berichtTekst+ " (" + dagAanduiding + ", " + dagVanBericht + " " + aanmaakDatum + ")";
    }
    
    public void setAangepasteDag(DayOfWeek aangepasteDag){
        this.aangepasteDag = aangepasteDag;
        
        if(dagVanBericht == aangepasteDag){
            dagAanduiding = "vandaag";
        } else {
            while(dagVanBericht != aangepasteDag) {
                dagVanBericht = dagVanBericht.plus(1);
                dagAanduiding = "over" + nieuweDagAanduiding;
                nieuweDagAanduiding = dagAanduiding;
            }
            nieuweDagAanduiding = "morgen";
        }
          
    }
    
    public String getNiveauAlsTekst(){
        niveauAlsTekst ="";
        if(niveau == 1){
            niveauAlsTekst += "Mededeling: ";
        }
        
        if(niveau == 2){
            niveauAlsTekst += "WAARSCHUWING: ";
        }
        
        if(niveau == 3){
            niveauAlsTekst += "NOODSITUATIE: ";
        }
        
        return niveauAlsTekst;
    }
    public String getBerichtTekst() {
        return berichtTekst;
    }
    public int getNiveau() {
        return niveau;
    }
    public String getDagAanduiding() {
        return dagAanduiding;
    }
    public LocalDate getAanmaakDatum() {
        return aanmaakDatum;
    }
    public DayOfWeek getDagVanBericht() {
        return dagVanBericht;
    }
    public void setNiveau(int niveau) {
        this.niveau = niveau;
        if(niveau < 1){
            setNiveau(1);
        }
        
        if(niveau > 3){
            setNiveau(3);
        }
    }
    
    
    
    
}
