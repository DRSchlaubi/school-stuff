
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MiRi217740
 */

  enum Flavor {

    CAPPUCCINO(1, .5, "Cappuchino", "Original italienisch"),
    CAPPUCCINO_SPECIAL(2, .5, "Cappuchino spezial", "mit einem Schuss Schokolade"),
    CHOCOLATE(3, .4, "Cappuchino spezial", "mit einem Schuss Schokolade"),
    BLACK_COFFEE(4, .3, "Kaffe Schwarz", "frisch gemahlen aus ganzen Bohnen"),
    CAFE_AU_LAIT(5, .5, "Cafe au lait", "Milchkaffe"),
    LATTE_MACCHIATO(6, .8, "Latte Macchiato", "Milchschaum mit Espresso"),
    ESPRESSO(7, .3, "Espresso", "klein, schwarz, kräftig"),
    ESPRESSO_MACCHIATO(8, .5, "Espresso", "Espresso mit Milchschaum"),
    VANILLA_MILK(9, .4, "Vanillemilch", "heiße Milch mit Vanillegeschmack"),
    VANILLA_FLAVOUR(10, .5, "Vanille flavour", "Cappuchino mit Vanillegeschmack");


    private final int selector;
    private final double price;
    private final String name;
    private final String description;

    Flavor(int selector, double price, String name, String description) {
      this.selector = selector;
      this.price = price;
      this.name = name;
      this.description = description;
    }

    public int getSelector() {
      return selector;
    }

    public double getPrice() {
      return price;
    }

    public String getName() {
      return name;
    }

    public String getDescription() {
      return description;
    }

    /**
     * Searches the {@link Flavor} corresponding to the selector.
     *
     * @param selector the selector for the flavor
     * @return the corresponding flavor
     * @throws IllegalArgumentException if the selector was invalid
     */
    @NotNull
    public static Flavor forSelector(int selector) {
      return Arrays.stream(values())
          .filter(flavor -> flavor.getSelector() == selector)
          .findFirst()
          .orElseThrow(() -> new IllegalArgumentException("Invalid selector: " + selector));
    }

    //private static Flavor forSelector2(int selector) {
      //return switch (selector) {
        //case 1 -> Flavor.CAPPUCCINO;
        //case 2 -> Flavor.CAPPUCCINO_SPECIAL;
        //case 3 -> Flavor.CHOCOLATE;
        //case 4 -> Flavor.BLACK_COFFEE;
        //case 5 -> Flavor.CAFE_AU_LAIT;
        //case 6 -> Flavor.LATTE_MACCHIATO;
        //case 7 -> Flavor.ESPRESSO;
        //case 8 -> Flavor.ESPRESSO_MACCHIATO;
        //case 9 -> Flavor.VANILLA_MILK;
        //case 10 -> Flavor.VANILLA_FLAVOUR;
        //default -> throw new IllegalArgumentException("Invalid selector: " + selector);
      //};
    //}

    private static Flavor forSelector3(int selector) {
      Flavor flavor;
      //noinspection EnhancedSwitchMigration
      switch (selector) {
        case 1:
          flavor = Flavor.CAPPUCCINO;
          break;
        case 2:
          flavor = Flavor.CAPPUCCINO_SPECIAL;
          break;
        case 3:
          flavor = Flavor.CHOCOLATE;
          break;
        case 4:
          flavor = Flavor.BLACK_COFFEE;
          break;
        case 5:
          flavor = Flavor.CAFE_AU_LAIT;
          break;
        case 6:
          flavor = Flavor.LATTE_MACCHIATO;
          break;
        case 7:
          flavor = Flavor.ESPRESSO;
          break;
        case 8:
          flavor = Flavor.ESPRESSO_MACCHIATO;
          break;
        case 9:
          flavor = Flavor.VANILLA_MILK;
          break;
        case 10:
          flavor = Flavor.VANILLA_FLAVOUR;
          break;
        default:
          throw new IllegalArgumentException("Invalid selector: " + selector);
      }

      return flavor;
    }
  }
