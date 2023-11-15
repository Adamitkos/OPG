import java.util.Scanner; import java.lang.Math;

public class uloha11 {
    public static void main(String[] args) {
        Scanner mojObj = new Scanner(System.in);
        System.out.println("Zadaj prve cislo");
        float cislo1=mojObj.nextFloat();
        System.out.println("obvod je:"+2*Math.PI*cislo1);
        System.out.println("obsah je:"+Math.PI*Math.pow(cislo1,2));

    }
    
}
