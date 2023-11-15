public class setterGetter {
    private int pocet=5;
    private String ovocie="Jablko";
    public int getpocet(){
        return pocet;
    }
    public void setPocet(int pocet){
        this.pocet=pocet;
    }
    public String getOvocie(){
        return ovocie;
    }
    public void setOvocie(String ovocie){
        this.ovocie=ovocie;
    }
    public void zobraz(){
        System.out.println("pocet: "+pocet);
        System.out.println("Ovocie: "+ovocie);
    }
    public static void main(String[] args) {
        setterGetter myObject = new setterGetter();
        myObject.zobraz();
    }
    
}
