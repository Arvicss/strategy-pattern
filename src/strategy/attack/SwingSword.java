package strategy.attack;

public class SwingSword implements IAttackStrategy{
  @Override
  public void attack() {
    System.out.println("Knight attacks with a sword!");
  }
}
