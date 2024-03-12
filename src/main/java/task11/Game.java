package task11;

public class Game {
    static int minNum = 0, maxNum = 10;

    public void joinGame(Player player) {
        Memento memento = new Memento();
        memento.setAnswer((int) (minNum + Math.random() * (maxNum - minNum)));
        player.setAnswer(memento);
        player.setGame(this);
    }

    public boolean checkAnswer(Player player, int answer) {
        Memento memento = (Memento) player.getAnswer();
        if (memento.getAnswer() == answer) {
            System.out.printf("Player %s answered correctly \"%d\"!!! \n", player.getPlayerName(), answer);
        } else {
            System.out.printf("Player %s answered incorrectly \"%d\" \n", player.getPlayerName(), answer);
        }

        return memento.getAnswer() == answer;
    }
}
