import java.util.Scanner;

public class uloha1 {
    public static void main(String[] args) {
        Scanner mojScanner=new Scanner(System.in);
        System.out.print("Zadaj prve cislo: ");
        int cislo1=mojScanner.nextInt();
        System.out.print("Zadaj druhe cislo: ");
        int cislo2=mojScanner.nextInt();
        System.out.print("Zadaj tretie cislo: ");
        int cislo3=mojScanner.nextInt();
        najmensie(cislo1,cislo2,cislo3);
    }
    public static void najmensie(int a,int b,int c){
        System.out.println(Math.min(Math.min(a,b),c));

    }
}