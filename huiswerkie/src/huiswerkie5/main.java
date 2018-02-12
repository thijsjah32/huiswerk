package huiswerkie5;

public class main {
    
    public static void main(String[] args){
        
        Gebruiker gebruiker1 = new Gebruiker("jan", 47);
        Gebruiker gebruiker2 = new Gebruiker("peter", 18);

        Bericht bericht1 = new Bericht(gebruiker1, "wwar is mijn geld, godverdomme");
        Bericht bericht2 = new Bericht(gebruiker2, "hey wolla, rustig G. ik betaal zekers wel, direct na scorro. aight?");
        Bericht bericht3 = new Bericht(gebruiker1, "ok, maar waag het niet mij te dissen vieze buitenlander. anders vallen er klapjes");
        
        Bericht[] berichten = {
            bericht1, bericht2, bericht3
        };

        String aantal ="Er zijn: " + berichten.length + " berichten:";
        System.out.println(aantal);

        int nummer = 0;

        for(int i=0; i<3; i++){
            System.out.println(berichten[nummer]);
            nummer += 1;
        }



    }    
}
    
    

