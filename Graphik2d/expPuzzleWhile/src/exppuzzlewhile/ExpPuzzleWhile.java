package exppuzzlewhile;

public class ExpPuzzleWhile {

    public static void main(String[] args) {
        int n = 0, i = 0;
        //n = 0;
        //i = 0; (Oben schon initsialisiert)
        // Summe aller Zahlen von 1-10: 55
        while (i < 11) {
            n = n + i;
            i++; // Notwendig da i sonst immer 0 wäre
        }

        System.out.println(n); // Hier Ergebnis einfügen!
        // Hier einfügen
        int b = 0;
        int i2 = 0;
        while (i2 <= 5) {
            b += Math.pow(i2, 2);
            i2++;
        }
        System.out.println("Das Ergebniss ist: " + b);
    }

}
