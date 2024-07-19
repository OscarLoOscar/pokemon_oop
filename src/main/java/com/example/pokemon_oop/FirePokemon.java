package com.example.pokemon_oop;

import java.util.HashSet;
import java.util.Set;
import com.example.pokemon_oop.Moves.FireMove;

public class FirePokemon extends Pokemon<FireMove> {

  private Set<FireMove> moves;

  public FirePokemon(String name) {
    super(name, PokemonType.FIRE);
    this.moves = new HashSet<>();
  }

  @Override
  public boolean learnMove(FireMove move) {
    if (moves.size() < 4 && !moves.contains(move)) {
      moves.add(move);
      return true;
    }
    return false;
  }

  @Override
  public boolean forgetMove(FireMove move) {
    return moves.remove(move);
  }

  @Override
  public Set<FireMove> getMoves() {
    return this.moves;
  }

  @Override
  public String attack() {
    return this.getName() + " uses Flame Thrower";
  }

  @Override
  public String specialAbility() {
    return this.getName() + " heats up the area!";
  }

}
