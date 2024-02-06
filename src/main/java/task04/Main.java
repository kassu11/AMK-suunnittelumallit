package task04;

public class Main {
    public static void main(String[] args) {
        ClockTimer timer = new ClockTimer();
        new DigitalClock(timer);

        for (int i = 0; i < 100; i++) {
            timer.tick();
        }

        timer.setHour(12);
        timer.setMinute(59);
        timer.setSecond(59);

        timer.tick();
    }
}
