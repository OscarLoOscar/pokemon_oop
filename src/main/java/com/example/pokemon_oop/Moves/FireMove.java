package com.example.pokemon_oop.Moves;

public enum FireMove implements Moves {
  ARMOR_CANNON("Armor Cannon", MoveCategory.SPECIAL, 120, 9), //
  BITTER_BLADE("Bitter Blade", MoveCategory.PHYSICAL, 90, 9), //
  BLAST_BURN("Blast Burn", MoveCategory.SPECIAL, 150, 3), //
  BLAZE_KICK("Blaze Kick", MoveCategory.PHYSICAL, 85, 3), //
  BLAZING_TORQUE("Blazing Torque", MoveCategory.PHYSICAL, 80, 9), //
  BLUE_FLARE("Blue Flare", MoveCategory.SPECIAL, 130, 5), //
  BURN_UP("Burn Up", MoveCategory.SPECIAL, 150, 7), //
  BURNING_BULWARK("Burning Bulwark", MoveCategory.OTHER, 0, 9);

  private final String name;
  private final MoveCategory category;
  private final int power;
  private final int generation;

  FireMove(String name, MoveCategory category, int power, int generation) {
    this.name = name;
    this.category = category;
    this.power = power;
    this.generation = generation;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public MoveCategory getCategory() {
    return category;
  }

  @Override
  public int getPower() {
    return power;
  }

  @Override
  public int getGeneration() {
    return generation;
  }
}
