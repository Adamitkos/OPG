import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type show whitespaces,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Auto []sklad = new Auto[100];
        int pocetAut = 0;
        Scanner sc = new Scanner(System.in);
        boolean onRun = true;
        Auto mojeAuto = null;
        while (onRun){
            System.out.println("Menu\n"+
                    "1.Objekt auto\n"+
                    "2.Obchod\n"+
                    "3. Koniec");
            int volba = Integer.parseInt(sc.nextLine());

            switch (volba){
                case 1:
                    System.out.println("Zadaj parameter auta:");
                    System.out.print("Znacka:");
                    String znacka = sc.nextLine();
                    System.out.print("Model:");
                    String model = sc.nextLine();
                    System.out.print("Cena:");
                    int cena = Integer.parseInt(sc.nextLine());
                    System.out.print("Vykon motora:");
                    int vm = Integer.parseInt(sc.nextLine());
                    mojeAuto = new Auto(znacka, model, cena, vm);
                    System.out.println("Objekt"+mojeAuto+"bol vytvoreny.");
                    sklad[pocetAut] = mojeAuto;
                    pocetAut++;


                    break;
                case 2:
                    System.out.println("V obchode mame toto:");

                    for(int i = 0; i < pocetAut; i++){
                        System.out.println(sklad[i]);
                    }
                    break;
                case 3:
                    onRun = false;
                    break;
                default:
                    System.out.println("Neznamy prikaz");
            }
        }
    }
}