
package huiswerkie4;

public class Cirkel {
    private double straal;

    public Cirkel(double straal) {
        this.straal = straal;
    }

    public double berekenOmtrek() {
        return 2 * Math.PI * straal;

    }
    
    public double berekenOppervlakte(){
        return Math.PI * Math.pow(straal, 2);
    }

    
}
