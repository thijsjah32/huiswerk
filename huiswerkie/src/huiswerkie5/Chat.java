
package huiswerkie5;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Chat {
    public String naamChat;
    public static ArrayList berichten;
    private static int nummer;
    public static LocalDateTime datumCheck;
    private boolean later;
    private Bericht bericht;
    
    public Chat(String naamChat){
        this.naamChat = naamChat;
        this.nummer = 1;
     
        Gebruiker gebruiker1 = new Gebruiker("jan", 47);
        Gebruiker gebruiker2 = new Gebruiker("peter", 18);
        Bericht bericht1 = new Bericht(gebruiker1, "wwar is mijn geld, godverdomme");
        Bericht bericht2 = new Bericht(gebruiker2, "hey wolla, rustig G. ik betaal zekers wel, direct na scorro. aight?");
        Bericht bericht3 = new Bericht(gebruiker1, "ok, maar waag het niet mij te dissen vieze buitenlander. anders vallen er klapjes");
        
        ArrayList<Bericht> berichten = new ArrayList<>();
        berichten.add(bericht1);
        berichten.add(bericht2);
        berichten.add(bericht3);
        this.berichten = berichten;
        this.bericht = berichten.get(nummer);
        
        
        
<<<<<<< HEAD
    }
    
    public static void voegToe(Bericht bericht){
        berichten.add(bericht);
    }
    
    public static void printChat(){
        String aantal ="Er zijn: " + berichten.size() + " berichten:";
        System.out.println(aantal);
        for(int i=0; i<berichten.size(); i++){
            System.out.println(berichten.get(nummer));
            nummer += 1;
        }
    }
    
    public void printBerichtenSinds(LocalDateTime datum){
        this.datumCheck = datum;
        for(int i=0; i<berichten.size(); i++){
            if(datumCheck.isBefore(bericht.datum))
            System.out.println(berichten.get(nummer));
            nummer += 1;
        }
                 
    }
    
    ArrayList<Bericht> ZoekBerichtenVan(Gebruiker gebruiker){
        ArrayList<Bericht> berichtenVan = new ArrayList<>();
        
        return berichtenVan;
=======
    }
    
    public static void voegToe(Bericht bericht){
        berichten.add(bericht);
    }
    
    public static void printChat(){
        String aantal ="Er zijn: " + berichten.size() + " berichten:";
        System.out.println(aantal);
        for(int i=0; i<berichten.size(); i++){
            System.out.println(berichten.get(nummer));
            nummer += 1;
        }
    }
    
    public void printBerichtenSinds(LocalDateTime datum){
        this.datumCheck = datum;
        for(int i=0; i<berichten.size(); i++){
            if(datumCheck.isBefore(bericht.datum))
            System.out.println(berichten.get(nummer));
            nummer += 1;
        }
                 
>>>>>>> d5ddbce144491b7d39de8bdba40d1e13c67f6fa2
    }
}    
