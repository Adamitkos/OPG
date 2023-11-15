import java.util.Scanner;

public class uloha13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zadajte šírku obdĺžnika: ");
        double sirka = scanner.nextDouble();
        System.out.print("Zadajte výšku obdĺžnika: ");
        double vyska = scanner.nextDouble();
        double plocha = sirka * vyska;
        double obvod = 2 * (sirka + vyska);
        System.out.println("Plocha obdĺžnika: " + plocha);
        System.out.println("Obvod obdĺžnika: " + obvod);
        scanner.close();
    }
}
