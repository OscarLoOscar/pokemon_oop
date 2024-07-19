package com.example.pokemon_oop;

import java.util.HashSet;
import java.util.Set;
import com.example.pokemon_oop.Moves.Moves;

public abstract class Pokemon<T extends Moves> implements Attackable {
  private String name;
  private PokemonType type;
  private Set<T> moves;

  public Pokemon(String name, PokemonType type) {
    this.name = name;
    this.type = type;
    this.moves = new HashSet<>();
  }

  public String getName() {
    return this.name;
  }

  public PokemonType getType() {
    return this.type;
  }

  public boolean learnMove(T move) {
    if (moves.size() < 4 && !moves.contains(move)) {
      moves.add(move);
      return true;
    }
    return false;
  }

  public boolean forgetMove(T move) {
    return moves.remove(move);
  }

  public Set<T> getMoves() {
    return this.moves;
  }

  public abstract String specialAbility();
}
