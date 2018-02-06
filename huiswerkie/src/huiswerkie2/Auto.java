
package huiswerkie2;

public class Auto {
    public String merk;

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }
    public String type;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
    public int pk;

    public void setPk(int pk) {
        this.pk = pk;
    }

    public int getPk() {
        return pk;
    }
    private boolean opgevoerd;

    public boolean isOpgevoerd() {
        return opgevoerd;
    }
    public boolean isOpgevoerd;

    public boolean isIsOpgevoerd() {
        return isOpgevoerd;
    }
    public Auto(){
        this.merk = "merk onbekend";
        this.type = "";
        this.pk = 20;
        this.opgevoerd = false;
    }
    public String toString(){
        return merk + " " + type + " " + "(" + pk + " pk, maximaal op te voeren met " + berekenOpvoerMogelijkheid() + " pk)"; 
    }
    public void voerOp(int extraPk) {
        if(opgevoerd == true) {
            System.out.println("u heeft al opfgevoerd");
            return;
        }
        
        if(extraPk > berekenOpvoerMogelijkheid()){
            System.out.println("te veel pk om oip te voeeren");
            return;
        }
        
        System.out.println(merk + " opvoeren met " + extraPk + " pk");  

        pk += extraPk;

        System.out.println("resultaat: " + this.toString());
        this.opgevoerd = true;
    }
    
    public int berekenOpvoerMogelijkheid(){
        if(opgevoerd == true){
            return 0;
        } 
        return pk - 20;
    }

    
}
