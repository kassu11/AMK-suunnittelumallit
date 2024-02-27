package task08;

import java.util.ArrayList;
import java.util.List;

public class TicTacToe extends Game {
    private char[][] board = new char[3][3];
    private List<Integer[]> validMoved = new ArrayList<>();
    private Player[] players;
    private boolean gameOver = false;
    private Player winner;

    void initializeGame() {
        boolean randomSymbol = Math.random() < 0.5;
        this.players = new Player[] { new Player(randomSymbol ? 'X' : 'O'), new Player(randomSymbol ? 'O' : 'X') };
        this.validMoved.clear();
        this.gameOver = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.board[i][j] = ' ';
                this.validMoved.add(new Integer[] { i, j });
            }
        }

        System.out.println("Initial board:");
        renderBoard();
    }

    void makePlay(int player) {
        if (this.validMoved.size() == 0) {
            this.gameOver = true;
            return;
        }

        int randomIndex = (int) (Math.random() * this.validMoved.size());
        Integer[] move = this.validMoved.get(randomIndex);
        players[player].makeMove(move[0], move[1]);
        this.validMoved.remove(randomIndex);
        this.board[move[0]][move[1]] = players[player].getSymbol();

        renderBoard();
    }

    boolean endOfGame() {
        for (Player player : this.players) {
            char symbol = player.getSymbol();
            if (this.board[1][1] == symbol && ((this.board[0][0] == symbol && this.board[2][2] == symbol)
                    || (this.board[0][2] == symbol && this.board[2][0] == symbol))) {
                this.gameOver = true;
                this.winner = player;
                return this.gameOver;
            }

            for (int i = 0; i < 3; i++) {
                if ((this.board[i][0] == symbol && this.board[i][1] == symbol && this.board[i][2] == symbol) ||
                        (this.board[0][i] == symbol && this.board[1][i] == symbol && this.board[2][i] == symbol)) {
                    this.gameOver = true;
                    this.winner = player;
                    return this.gameOver;
                }
            }
        }

        return this.gameOver;
    }

    void printWinner() {
        if (this.winner != null) {
            System.out.println("Player " + this.winner.getSymbol() + " wins!");
        } else {
            System.out.println("It's a draw!");
        }
        System.out.println("\n");
    }

    private void renderBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + this.board[i][0] + " | " + this.board[i][1] + " | " + this.board[i][2]);
            if (i < 2) {
                System.out.println("---|---|---");
            }
        }

        System.out.println("\n");
    }
}
