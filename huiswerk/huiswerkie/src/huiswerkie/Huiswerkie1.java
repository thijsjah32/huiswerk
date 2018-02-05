
package huiswerkie;


public class Huiswerkie1 {

    public static void main(String[] args) {
        //opdracht 4a
        System.out.println("Opdracht 4a");
        String groet = new String("hallo");
        System.out.println(groet);
        //opdracht 4b
        System.out.println("opdracht 4b");
        String naam1 = new String("sjonnie");
        String naam2 = new String("kees");
        System.out.print(naam1 + " ");
        System.out.print(naam1.length() + " ");
        System.out.println("letters");
        //opdracht 4c
        System.out.println("opdracht 4c");
        int naam1Length = naam1.length();
        int naam2Length = naam2.length();
        if (naam1Length>naam2Length){
            System.out.println(naam1 + " is een langere naam dan " + naam2);
        }else{
            System.out.println(naam2 + " is een langere naam dan " + naam1);
        }
        //opdracht 5a
        System.out.println("opdracht 5a");
        String tekst = "aa";
        System.out.println(tekst);
        System.out.println(tekst + tekst);
        System.out.println(tekst + tekst + tekst + tekst);
        //opdracht 5b
        System.out.println("opdracht 5b");
        System.out.println(tekst + tekst.length());
        System.out.println(tekst + tekst + tekst.length()*2);
        System.out.println(tekst + tekst + tekst + tekst + tekst.length()*4);
        //opdracht 5c
        System.out.println("opdracht 5c");
        System.out.println(tekst.toUpperCase() + tekst.length());
        System.out.println(tekst + tekst + tekst.length()*2);
        System.out.println(tekst.toUpperCase() + tekst.toUpperCase() + tekst.toUpperCase() + tekst.toUpperCase() + tekst.length()*4);
        //opdracht 6
        System.out.println("opdracht 6");
        int aantal = 2;
        System.out.print("ik zie " + aantal + " vogel");
        if(aantal>1){
            System.out.println("s");
        }
        
        
    }
    
}
