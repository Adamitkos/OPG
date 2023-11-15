// Napíšte program v jazyku Java, ktorý bude generovať náhodné údaje o úrode na farme. Program by mal generovať nasledujúce údaje:
// Počet plodín: od 1 do 100
// Typ plodiny: ovocie, zelenina alebo obilnina
// Úroda na jednu plodinu: od 0 do 100 kg
 
// Očakávaný výstup:
// Počet plodín: 50
// Typ plodiny: ovocie
// Úroda na jednu plodinu: 75.50 kg
 
// Možné pod úlohy a rozšírenia:
// Program by sa dal rozšíriť o nasledujúce funkcie:
// Možnosti generovania: Program by mohol ponúkať možnosti na výber typu plodiny a rozsahu úrody.
// Správa chýb: Program by mal byť vybavený mechanizmom na správu chýb, napríklad ak sa vygeneruje počet plodín mimo rozsahu.
// Grafické rozhranie: Program by mohol byť vybavený grafický rozhraním, ktoré by uľahčilo používanie.

// Program by sa dal rozšíriť o funkciu, ktorá by počítala celkovú úrodu na farme. Táto funkcia by sa dala implementovať nasledovne:
// Očakávaný výstup:
// Počet plodín: 50
// Typ plodiny: ovocie
// Úroda na jednu plodinu: 75.50 kg
// Celková úroda: 3775 kg

import java.util.Random;

public class PlodinyV2 {
    public static void main(String[] args) {
        Random rng=new Random();
        int pocetPlodin=rng.nextInt(100)+1;
        String[] plodiny={"ovocie","zelenina","obilnina"};
        String vyberPlodinu=plodiny[rng.nextInt(plodiny.length)];
        double uroda = rng.nextDouble() * 100; 
        System.out.println("Počet plodín:"+pocetPlodin);
        System.out.println("Typ plodiny:"+vyberPlodinu);
        System.out.printf("Úroda na jednu plodinu: %.2f kg\n",uroda);
        System.out.printf("Celková úroda: %.2f kg\n",uroda*pocetPlodin);
    }
    
}
