// 2. Napíšte Java program, ktorý vypíše súčet dvoch čísel.
// Údaje testu:
// 25 + 35
// Očakávaný výstup :
// 60

import java.util.Scanner;

public class uloha2 {
    public static void main(String[]args) {
            Scitanie(args);
        }
        static void Scitanie(String[]args) {
            Scanner mojObj = new Scanner(System.in);
            System.out.println("zadaj prve cislo");
            int cislo1=mojObj.nextInt();
            System.out.println("zadaj druhe cislo");
            int cislo2=mojObj.nextInt();
            System.out.println(cislo1+cislo2);
    }
    
}
