package task04;

import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer {
    private ClockTimer timer;

    public DigitalClock(ClockTimer clockTimer) {
        timer = clockTimer;
        timer.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object object) {
        if (observable == timer) {
            draw();
        }
    }

    public String formatTime(int time) {
        return String.format("%2s", (time)).replace(" ", "0");
    }

    private void draw() {
        String hour = formatTime(timer.getHour());
        String minute = formatTime(timer.getMinute());
        String second = formatTime(timer.getSecond());

        System.out.println(hour + ":" + minute + ":" + second);
    }
}
