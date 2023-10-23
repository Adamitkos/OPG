import java.util.Random;

class Plodiny {
    public static void main(String[] args) {
        Random rng = new Random();
        int pocetPlodin = rng.nextInt(100) + 1; 
        String[] typy = {"ovocie", "zelenina", "obilnina"};
        String typPlodiny = typy[rng.nextInt(typy.length)]; 
        double uroda = rng.nextDouble() * 100; 
        System.out.println("Počet plodín: " + pocetPlodin);
        System.out.println("Typ plodiny: " + typPlodiny);
        System.out.println("Úroda na jednu plodinu: "+ uroda +" kg");
    }
}