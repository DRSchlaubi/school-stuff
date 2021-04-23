import java.util.Scanner;

public class CoffeeMachine {

  public static void main(String[] args) {
    System.out.println("Verfügbare Optionen:");
    for (Flavor flavor : Flavor.values()) {
      System.out
          .printf("- %d. %s: %.2f€ - %s%n", flavor.getSelector(), flavor.getName(),
              flavor.getPrice(),
              flavor.getDescription());
    }

    System.out.println("Bitte treffe eine Auswahl: ");
    Scanner input = new Scanner(System.in);
    Flavor flavor;
    try {
      flavor = Flavor.forSelector(input.nextInt());
    } catch (IllegalArgumentException e) {
      System.out.println("Diese Option ist ungültig");
      return;
    }
    System.out.println("");
        

    System.out.println("Möchten sie Extra-Milch (true/false): ");
    boolean milk = input.nextBoolean();

    System.out.println("Möchten sie Zucker (true/false): ");
    boolean sugar = input.nextBoolean();
    System.out.println("");

    double price = flavor.getPrice();
    StringBuilder additionBuilder = new StringBuilder();
    if(milk) {
        price += .5;
        additionBuilder.append(" mit Milch");
    }
    if(sugar) {
        price += .5;
        if(additionBuilder.length() == 0) {
            additionBuilder.append(" und Zucher");
        } else {
            additionBuilder.append(" mit Zucker");
        }
    }
    
    String additions = additionBuilder.toString();

    System.out
        .println(String.format("Ihre Wahl: %s - %s%s. Preis: %.2f€", flavor.getName(), flavor.getDescription(),
            additions, price));
    double payed = 0;
    do {
      System.out.println(String.format("Zu Zahlender Betrag: %.2f. Bitte Münze einwerfen", price - payed));
      double value = input.nextDouble();
      Money coin;
      try {
        coin = Money.forValue(value);
      } catch(IllegalArgumentException e) {
          System.out.println("Falschgeld wird nicht akzeptiert");
          return;
      }
      payed += coin.getValue();
    } while(payed < price);
    
      System.out.println("Danke für ihren Einkauf");
      
      Change change = CheckoutUtil.calculateChange(price, payed);
      if(!change.isEmpty()) {
        System.out.println(change.buildSummary());
      }
  }

}
