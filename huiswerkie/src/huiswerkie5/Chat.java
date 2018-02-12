
package huiswerkie5;

import java.util.ArrayList;

public class Chat {
    public String naam;
    public static ArrayList<Bericht> berichten;
    
    public Chat(String naam){
        this.naam = naam;
        
        Gebruiker gebruiker1 = new Gebruiker("jan", 47);
        Gebruiker gebruiker2 = new Gebruiker("peter", 18);

        Bericht bericht1 = new Bericht(gebruiker1, "wwar is mijn geld, godverdomme");
        Bericht bericht2 = new Bericht(gebruiker2, "hey wolla, rustig G. ik betaal zekers wel, direct na scorro. aight?");
        Bericht bericht3 = new Bericht(gebruiker1, "ok, maar waag het niet mij te dissen vieze buitenlander. anders vallen er klapjes");
        
        berichten = new ArrayList<>();
        
        berichten.add(bericht1);
        berichten.add(bericht2);
        berichten.add(bericht3);
    }
    
    private void voegToe(Bericht bericht){
        
    }
    
    
    
}
