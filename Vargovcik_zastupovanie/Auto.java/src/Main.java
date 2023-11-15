import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);//1.Scanner= údajový typ 2.Scanner=konštruktor
        boolean onRun=true;
        while(onRun){
            System.out.println("MENU:\n"+
                                "1.Objekt auto\n"+
                                "2.Obchod\n"+
                                "3.Koniec");
            //String volba=sc.nextLine();
            int volba=Integer.parseInt(sc.nextLine());
            switch (volba) {
                case 1:
                    System.out.println("Zadaj parametre auta");
                    System.out.print("Znacka");
                    String znacka=sc.nextLine();
                    System.out.print("Model");
                    String model=sc.nextLine();
                    System.out.print("Cena");
                    int cena=Integer.parseInt(sc.nextLine());
                    System.out.print("Vykon motora");
                    int vm=Integer.parseInt(sc.nextLine());
                    Auto mojePrveAuto=new Auto(znacka,model,cena,vm);
                    System.out.println("Objekt "+mojePrveAuto+ "bol vytvoreny");
                case 2:
                    System.out.println("V obchode mame takyto tovar:");
                    break;
                case 3:
                    onRun=false;
                    break;
                default:
                    System.out.println("neznamy prikaz");
            }
        }
    }
    
}