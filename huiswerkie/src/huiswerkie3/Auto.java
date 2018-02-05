/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huiswerkie3;

/**
 *
 * @author Stink Rat
 */
public class Auto {
    private final boolean isGay = true;
    private static String name;
    
    public static void main(String args[]) {
        name = "Tinus";
        
        System.out.println(isGay("Tinus"));
    }
    
    static String isGay(String name) {
        if("Tinus".equals(name)) {
            return "Ja die is best wel gay";
        }
        
        return "Geintje natuurtlijk beetje gay is okay";
    }
}
//hallo?//Hallo?????????????????????? druk of6
//hey dit is de ene laatste check
// en dity is de laatste