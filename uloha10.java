// 10. Napíšte Java program na výpočet zadaného vzorca.
// Špecifikovaný vzorec:
// 4,0 * (1 - (1,0/3) + (1,0/5) - (1,0/7) + (1,0/9) - (1,0/11))
// Očakávaný výstup
// 2,9760461760461765
public class uloha10 {
    public static void main(String[]args){
        Vysledok(args);
    }
    static void Vysledok(String[]args){
        double Vyraz1 = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        System.out.println(Vyraz1);
    }
    
}
    
