
package Weerbericht;

public class Weerbericht {
    
    private double temperatuur;
    private int windkracht;
    private String windrichting;
    private boolean bewolking;
    private boolean neerslag;
    private boolean zon;
    
    public Weerbericht(double temperatuur, int windkracht, String windrichting, boolean bewolking, boolean neerslag, boolean zon){
        this.temperatuur = temperatuur;
        this.windkracht = windkracht;
        this.windrichting = windrichting;
        setBewolking(bewolking);
        setNeerslag(neerslag);
        setZon(zon);
    }
    
    public Weerbericht(double temperatuur, int windkracht, String windrichting){
        this(temperatuur, windkracht, windrichting, false, false, false);
        
    }
    
    public String toString(){
        String totaleWeerbericht = "Weerbericht-temperatuur: " + temperatuur + ", wind: " + windkracht + " " + windrichting;
        
        if(bewolking) {
            totaleWeerbericht += ", Bewolked";
        }
        
        if(neerslag) {
            totaleWeerbericht += ", Neerslag ";
        }
        
        if(zon) {
            totaleWeerbericht += ", Zonnig ";
        }
        
        return totaleWeerbericht;
    }
    
    

    public void setTemperatuur(double temperatuur) {
        this.temperatuur = temperatuur;
    }
    public void setWindkracht(int windkracht) {
        this.windkracht = windkracht;
    }
    public void setWindrichting(String windrichting) {
        this.windrichting = windrichting;
    }
    public void setBewolking(boolean bewolking) {
        this.bewolking = bewolking;
        if(bewolking == false){
            zon = true;
            neerslag = false;
        }
    }
    public void setNeerslag(boolean neerslag) {
        this.neerslag = neerslag;
        if(neerslag == true){
            bewolking = true;
            zon = false;
        }
    }
    public void setZon(boolean zon) {
        this.zon = zon;
        if(zon == true){
            bewolking = false;
            neerslag = false;
        }
    }
    public double getTemperatuur() {
        return temperatuur;
    }
    public int getWindkracht() {
        return windkracht;
    }
    public String getWindrichting() {
        return windrichting;
    }
   
    
    
}