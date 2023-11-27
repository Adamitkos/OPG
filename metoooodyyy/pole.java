public class pole{
    static void vypisPole(int pole[]){
        for(int i=0;i<pole.length;i++)
        System.out.println(pole[i]);
    }
    static void minimum(int pole[]){
        int min=pole[0];
        for (int i=1;i<pole.length;i++){
            if(min>pole[i]){
                min=pole[i];
            }}
        System.out.println(min);

    }
    static void maximum(int pole[]){
        int max=pole[0];
        for (int i=1;i<pole.length;i++){
            if(max<pole[i]){
                max=pole[i];
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int pole[]={50,60,88,32,1,87};
        System.out.println("Pole je:");
        vypisPole(pole);
        System.out.print("Najmensie cislo je: ");
        minimum(pole);
        System.out.print("Najvacsie cislo je: ");
        maximum(pole);

    }

}