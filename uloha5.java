// 5. Napíšte Java program, ktorý použije dve čísla ako vstup a zobrazí súčin
// dvoch čísel.
// Údaje testu:
// Zadajte prvé číslo: 25
// Zadajte druhé číslo: 5
// Očakávaný výstup :
// 25 x 5 = 125

import java.util.Scanner;

public class uloha5 {
    public static void main(String[]args){
        Sucin(args);
    }
    static void Sucin(String[]args){
        Scanner mojObj=new Scanner(System.in);
        System.out.println("Zadaj prve cislo");
        int cislo1=mojObj.nextInt();
        System.out.println("Zadaj druhe cislo");
        int cislo2=mojObj.nextInt();
        System.out.println(cislo1*cislo2);
    }

    
}
