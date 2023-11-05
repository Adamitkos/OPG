// 9. Napíšte Java program, ktorý vypočíta zadané výrazy a vypíše výstup.
// Údaje testu:
// ((25,5 * 3,5 - 3,5 * 3,5) / (40,5 - 4,5))
// Očakávaný výstup
// 2,138888888888889
public class uloha9 {
    public static void main(String[]args){
        Vysledok(args);
    }
    static void Vysledok(String[]args){
        double Vyraz1 = 25.5 * 3.5 - 3.5 * 3.5;
        double Vyraz2= 40.5 - 4.5;
        System.out.println((Vyraz1)/(Vyraz2));  
    }
    
}
