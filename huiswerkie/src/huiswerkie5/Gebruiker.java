
package huiswerkie5;

public class Gebruiker {
    public String naam;
    public int leeftijd;
    
    public Gebruiker(String naam, int leeftijd){
        this.naam = naam;
        this.leeftijd = leeftijd;
}

    
    public String toString(){
        return naam + "(" + leeftijd + ")";
    }

    public String getNaam() {
        return naam;
    }
    public void setNaam(String naam) {
        this.naam = naam;
    }
    public int getLeeftijd() {
        return leeftijd;
    }
    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }
    
    
}
