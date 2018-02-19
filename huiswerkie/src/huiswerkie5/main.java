package huiswerkie5;

import java.time.LocalDateTime;

public class main {
    
    public static void main(String[] args){
        Gebruiker gebruiker2 = new Gebruiker("peter", 18);
        Bericht bericht4 = new Bericht(gebruiker2, "ik weet, ik weet. chill mattie. alles gucci aight?");
        Chat chat1 = new Chat("druggkiddies");
        
        chat1.voegToe(bericht4);
        chat1.printChat();
        
        chat1.printBerichtenSinds(LocalDateTime.now().plusHours(1));

        


    }    
}
    
    

