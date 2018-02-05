
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
    public Auto(){
        this.merk = "merk onbekend";
        this.type = "";
        this.pk = 20;
    }
    public String toString(){
        return merk + " " + type + " " + "(" + pk + ")"; 
    }
    
}
