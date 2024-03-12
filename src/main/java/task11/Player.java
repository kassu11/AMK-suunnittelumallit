package task11;

public class Player extends Thread {
    private String playerName;
    private Object answer;
    private Game game;

    public Player(String name) {
        this.playerName = name;
    }

    public boolean makeAGuess(Game game) {
        int guess = (int) (Game.minNum + Math.random() * (Game.maxNum - Game.minNum));
        return game.checkAnswer(this, guess);
    }

    public void run() {
        while (!makeAGuess(game)) {
            System.out.println(this.playerName + " will try again!");
        }
        System.out.println(this.playerName + " won the game!");
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setAnswer(Object answer) {
        this.answer = answer;
    }

    public Object getAnswer() {
        return answer;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
