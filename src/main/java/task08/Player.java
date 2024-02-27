package task08;

import java.util.ArrayList;
import java.util.List;

public class Player {
  private List<Number[]> moves = new ArrayList<>();
  private char symbol;

  public Player(char symbol) {
    this.symbol = symbol;
  }

  public void makeMove(Number x, Number y) {
    moves.add(new Number[] { x, y });
  }

  public char getSymbol() {
    return symbol;
  }
}
