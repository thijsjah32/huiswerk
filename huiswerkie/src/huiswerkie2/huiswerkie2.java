
package huiswerkie2;

public class huiswerkie2 {
    
     public static void main(String[] args) {
    Auto Auto1 = new Auto();
    System.out.println(Auto1);
    Auto1.setMerk("Skoda");
    Auto1.setType("Fabia");
    Auto1.setPk(30);
    System.out.println(Auto1);
    Auto Auto2 = new Auto();
    Auto2.setMerk("Tesla");
    Auto2.setType("S");
    Auto2.setPk(400);
    System.out.println(Auto2);
    if (Auto1.pk>Auto2.pk){
        int Verschil = Auto1.pk - Auto2.pk;
        System.out.println("de Skoda heeft meer vermogen dan de Tesla, het verschil is " + Verschil + " pk");
    } else if(Auto2.pk>Auto1.pk){
        int Verschil = Auto2.pk - Auto1.pk;
        System.out.println("de Tesla heeft meer vermogen dan de Skoda, het verschil is " + Verschil + " pk");
    } else{
        System.out.println("de Skoda heeft even veel vermogen als de Tesla");
    }
}
}