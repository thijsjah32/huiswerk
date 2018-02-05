
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

    }
}
