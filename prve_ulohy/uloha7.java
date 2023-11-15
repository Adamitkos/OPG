// 7. Napíšte Java program, ktorý vezme číslo ako vstup a vypíše svoju tabuľku
// násobenia až do 10.
// Testovacie údaje:
// Zadajte číslo: 8
// Očakávaný výstup :
// 8 x 1 = 8
// 8 x 2 = 16
// 8 x 3 = 24
//  .
// 8 x 10 = 80
import java.util.Scanner;

public class uloha7 {
    public static void main(String[]args){
        Nasobilka(args);
    }
    static void Nasobilka(String[]args) {
        Scanner mojObj = new Scanner(System.in);
        System.out.println("Zadaj prve cislo");
        int cislo1=mojObj.nextInt();

        System.out.println(cislo1+" x 1 = "+cislo1*1);
        System.out.println(cislo1+" x 2 = "+cislo1*2);
        System.out.println(cislo1+" x 3 = "+cislo1*3);
        System.out.println(cislo1+" x 4 = "+cislo1*4);
        System.out.println(cislo1+" x 5 = "+cislo1*5);
        System.out.println(cislo1+" x 6 = "+cislo1*6);
        System.out.println(cislo1+" x 7 = "+cislo1*7);
        System.out.println(cislo1+" x 8 = "+cislo1*8);
        System.out.println(cislo1+" x 9 = "+cislo1*9);
        System.out.println(cislo1+" x 10 = "+cislo1*10);

    }}
