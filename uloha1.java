// 1. Napíšte Java program, ktorý vypíše na obrazovku 'Ahoj Peter, chcem ti iba
// povedať, že mám rád Javu' a potom vypíše svoje meno na samostatný riadok.
// Očakávaný výstup :
// Ahoj Peter, chcem ti iba povedať, že mám rád Javu!
// Jano

import java.util.Scanner;

public class uloha1 {
    public static void main(String[]args) {
        Vystup(args);
    }
    static void Vystup(String[]args) {
        System.out.println("Ahoj Peter, chcem ti iba povedať, že mám rád Javu!");
        System.out.println("Jano");
    }
}
