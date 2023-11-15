import java.util.Scanner;

public class uloha12 {
    public static void main(String[] args) {
        Scanner mojObj = new Scanner(System.in);
        System.out.println("Zadaj prve cislo");
        float cislo1=mojObj.nextFloat();
        System.out.println("Zadaj druhe cislo");
        float cislo2=mojObj.nextFloat();
        System.out.println("Zadaj tretie cislo");
        float cislo3=mojObj.nextFloat();
        System.out.println("Priemer tychto cisel je: "+(cislo1+cislo2+cislo3)/3);
    }
    
}
