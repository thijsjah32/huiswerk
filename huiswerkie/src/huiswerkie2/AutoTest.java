
package huiswerkie2;

public class AutoTest {
    public static void main(String[] args) {
        Auto Auto1 = new Auto();
        
        System.out.println(Auto1);
        Auto1.setMerk("Skoda");
        Auto1.setType("Fabia");
        Auto1.setPk(60);
        
        System.out.println(Auto1);
        
        Auto Auto2 = new Auto();
        
        Auto2.setMerk("Tesla");
        Auto2.setType("S");
        Auto2.setPk(400);
        
        System.out.println(Auto2);
        
        Auto1.voerOp(Auto2.pk-Auto1.pk);
        
        Auto1.setPk(60); // Skoda weer terug naar af
        
        int maxOpvoerPks;
        while(Auto1.pk+Auto1.berekenOpvoerMogelijkheid() < Auto2.pk){
            if(Auto1.isOpgevoerd()) {
                System.out.println("STOPPEN MAAR");
                break;
            } else {
                Auto1.voerOp(Auto1.berekenOpvoerMogelijkheid());
            }
        }
        
        Auto1.voerOp(Auto2.pk-Auto1.pk);


    }
}
