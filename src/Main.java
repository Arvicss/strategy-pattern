import strategy.attack.CastSpell;
import strategy.attack.ShootArrow;
import strategy.attack.SwingSword;
import strategy.defense.CreateMagic;
import strategy.defense.Dodge;
import strategy.defense.Shield;
import character.Character;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    do {
      System.out.println("\nChoose your character: \n[1]: Knight \n[2]: Wizard \n[3]: Archer");
      System.out.print("Select an option: ");
      int choice = scanner.nextInt();
      scanner.nextLine();

      Character character = null;

      switch (choice) {
        case 1:
          character = new Character(new SwingSword(), Arrays.asList(new Shield(), new Dodge(), new CreateMagic()));
          break;
        case 2:
          character = new Character(new CastSpell(), List.of(new CreateMagic()));
          break;
        case 3:
          character = new Character(new ShootArrow(), List.of(new Dodge()));
          break;
        default:
          System.out.println("Invalid choice. Try again.");
          continue;
      }

      boolean characterActive = true;
      do {
        System.out.println("\nChoose an action: \n[1]: Attack \n[2]: Defend \n[3]: Quit");
        System.out.print("Select an option: ");
        int action = scanner.nextInt();
        scanner.nextLine();

        switch (action) {
          case 1:
            character.attack();
            break;
          case 2:
            character.defend();
            break;
          case 3:
            System.exit(0);
            break;
          default:
            System.out.println("Invalid action. Try again.");
        }
      } while (true);

    } while (true);
  }
}
