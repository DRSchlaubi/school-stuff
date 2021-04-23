package exppuzzlefor;

public class ExpPuzzlefor {

    public static void main(String[] args) {
       
        int n = 0;
        //zählt zahlen von 1 bis 10 zusammen: 55
        for (int i = 0; i < 11; i++){
            n = n + i;
        }
        
        System.out.println(n); // Hier Ergebnis einfügen!
        
        int b = 0;
        for (int i = 0; i <=5; i++) {
            b += Math.pow(i, 2);
        }
        System.out.println("Das Ergebniss ist: " + b);
    }
    
}
