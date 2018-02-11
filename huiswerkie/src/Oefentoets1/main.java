
package Oefentoets1;

import java.time.DayOfWeek;

public class main {
    
    public static void main (String[] args){
       
        Melding melding1 = new Melding("De kroketten zijn op");
        System.out.println(melding1);
        
        int niveau = 0;
        Melding melding2 = new Melding("Dekantine is gesloten.", niveau);
        System.out.println(melding2);
        
        melding1.setAangepasteDag(DayOfWeek.FRIDAY);
        System.out.println(melding1);
    }
    
}
