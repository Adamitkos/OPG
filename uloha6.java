// 6. Napíšte Java program, ktorý vypíše súčet (sčítanie), násobenie, odčítanie,
// delenie a zvyšok dvoch čísel.
// Údaje testu:
// Zadajte prvé číslo: 125
// Zadajte druhé číslo: 24
// Očakávaný výstup :
// 125 + 24 = 149
// 125 - 24 = 101
// 125 x 24 = 3000
// 125 / 24 = 5
// 125 mod 24 = 5

import java.util.Scanner;

public class uloha6 {
    public static void main(String[]args){
        Kalkulacka(args);
    }
    static void Kalkulacka(String[]args) {
        Scanner mojObj = new Scanner(System.in);
        System.out.println("Zadaj prve cislo");
        int cislo1=mojObj.nextInt();
        System.out.println("Zadaj druhe cislo");
        int cislo2=mojObj.nextInt();
        System.out.println(cislo1+cislo2);
        System.out.println(cislo1-cislo2);
        System.out.println(cislo1*cislo2);
        System.out.println(cislo1/cislo2);
        System.out.println(cislo1%cislo2);

    
}
}