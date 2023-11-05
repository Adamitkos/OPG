// 3. Napíšte program Java na delenie čísla a vypísanie na obrazovku. Vytvorte
// variantu s načítaním údajov od užívateľa a variantu s pevne zadanými
// vstupmi.
// Údaje testu:
// 50/3
// Očakávaný výstup :
// 16
import java.util.Scanner;

public class uloha3 {
    public static void main(String[]args) {
        Delenie(args);
    }
    static void Delenie(String[]args) {
        Scanner mojObj = new Scanner(System.in);
        System.out.println("Zadaj prve cislo");
        int cislo1=mojObj.nextInt();
        System.out.println("Zadaj druhe cislo");
        int cislo2=mojObj.nextInt();
        int vysledok=cislo1/cislo2;
        System.out.println(vysledok);
    }
    
}
