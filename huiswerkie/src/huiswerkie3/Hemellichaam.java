
package huiswerkie3;

public class Hemellichaam {
    private String naam;
    private String type;
    private int tempMin;
    private int tempMax;
    
    public Hemellichaam(String naam, String type){
        this.naam = naam;
        this.type = type;
        this.tempMin = 0;
        this.tempMax = 0;
    }
    
    public Hemellichaam (String naam){
        this.naam = naam;
        this.type = "onbekend btw haHA";
        this.tempMin = 0;
        this.tempMax = 0;
    }
    
    public void setTemperatuur(int tempMin, int tempMax){
        this.tempMin = tempMin;
        this.tempMax = tempMax;
    }
    
    public void setTemperatuur(int temp){
        this.tempMin = temp;
        this.tempMax = temp;
    }
    
    public void printTemperatuur(){
        if (tempMin != tempMax){
        System.out.println("het is minimaal " + tempMin + " graden, en maximaal " + tempMax + " graden");
    } else {
            System.out.println("de temperatuur is onegeveer (" + tempMin + ") graden");
        }
    }
    
            
    public String toString(){
        return naam + " (" + type + ")";
    }
    

    public int getTempMin() {
        return tempMin;
    }
    public void setTempMin(int tempMin) {
        this.tempMin = tempMin;
    }
    public int getTempMax() {
        return tempMax;
    }
    public void setTempMax(int tempMax) {
        this.tempMax = tempMax;
    }
    public void setNaam(String naam) {
        this.naam = naam;
    }
    public void setType(String type) {
        this.type = type;
        System.out.println("wow dit gebeurd echt nooit, weet je het zeker? je kan nu nog terug");
    }
    public String getNaam() {
        return naam;
    }
    public String getType() {
        return type;
    }
   
}
