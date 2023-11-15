//     a. -5 + 8 * 6
// b. (55+9) % 9
// c. 20 + -3*5 / 8
// d. 5 + 15 / 3 * 2 - 8 % 3
// Očakávaný výstup :
// 43

public class uloha4 {
    public static void main(String[]args) {
        Priklady(args);
    }
            static void Priklady(String[]args) {
                int vysledok=-5+8*6;
                System.out.println(vysledok);
                vysledok=(55+9) % 9;
                System.out.println(vysledok);
                vysledok=20 + -3*5 / 8;
                System.out.println(vysledok);
                vysledok=5 + 15 / 3 * 2 - 8 % 3;
                System.out.println(vysledok);
}
    
}
