public class Example {
  public static void main(String[] args) {
    System.out.println("We are making a new Pez Dispenser.");
    PezDispenser dispenser = new PezDispenser("Donatello");
    System.out.printf("The dispenser character is %s\n",
                      dispenser.getCharacterName());
    if (dispenser.isEmpty()) {
      System.out.println("It is currently Empty");
    }
    System.out.println("Loading...");
    dispenser.load();
    if (!dispenser.isEmpty()) {
      System.out.println("It is no longer empty.");
    }
    while (dispenser.dispense()) {
      System.out.println("Chomp!");
    }
    if (dispenser.isEmpty()) {
      System.out.println("Ate all of the Pez!");
    }
    dispenser.load(4);
    dispenser.load(2);
    while (dispenser.dispense()) {
      System.out.println("Chomp!");
    }
    try {
      dispenser.load(400);
      System.out.println("This should never happen");
    } catch (IllegalArgumentException iae) {
      System.out.println("WHOA!");
      System.out.printf("The error was: %s\n", iae.getMessage());
    }
  }
}
