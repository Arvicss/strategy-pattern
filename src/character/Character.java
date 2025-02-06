package character;

import strategy.attack.IAttackStrategy;
import strategy.defense.IDefenseStrategy;

import java.util.List;

public class Character {
  private final IAttackStrategy attackStrategy;
  private final List<IDefenseStrategy> defenseStrategies;

  public Character(IAttackStrategy attackStrategy, List<IDefenseStrategy> defenseStrategies) {
    this.attackStrategy = attackStrategy;
    this.defenseStrategies = defenseStrategies;
  }

  public void attack() {
    attackStrategy.attack();
  }

  public void defend() {
    for (IDefenseStrategy strategy : defenseStrategies) {
      strategy.defend();
    }
  }
}
