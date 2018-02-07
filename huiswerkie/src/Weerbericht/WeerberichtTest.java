
package Weerbericht;

public class WeerberichtTest {
     public static void main(String[] args) {
         
        Weerbericht weerbericht = new Weerbericht(5.7, 7, "NO");
        System.out.println(weerbericht.getTemperatuur());
        System.out.println(weerbericht.getWindkracht());
        System.out.println(weerbericht.getWindrichting());
        
        System.out.println(weerbericht);
        weerbericht.setBewolking(true);
        System.out.println(weerbericht);
        weerbericht.setNeerslag(true);
        System.out.println(weerbericht);
        
        Weerbericht weerbericht2 = new Weerbericht(5.7, 7, "NO", true, true, true);
        System.out.println(weerbericht2);
        
        // geen bewolking, wel neerslag, geen zon: dat kan niet, 
        // dus geen bewolking? dan ook geen neerslag en wel zon
        Weerbericht weerbericht3 = new Weerbericht(4.0, 9, "NO", false, true, false);
        System.out.println(weerbericht3);
        // geen wolken? dan dus ook geen neerslag en wel zon
        weerbericht3.setBewolking(false);
        System.out.println(weerbericht3);



     }
    
}
