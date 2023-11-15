public class Auto {
    String znacka;
    String model;
    int cena;
    int vykonMotora;
    double stavNadrze;

    public Auto(String znacka, String model, int cena, int vykonMotora) {
        this.znacka = znacka;
        this.model = model;
        this.cena = cena;
        this.vykonMotora = vykonMotora;
        stavNadrze = 1.5;
    }
   @Override
    public String toString() {
        return "Auto{" +
                "znacka='" + znacka + ''' +
                ", model='" + model + ''' +
                ", cena=" + cena +
                ", vykonMotora=" + vykonMotora +
                ", stavNadrze=" + stavNadrze +
                '}';
    }
}