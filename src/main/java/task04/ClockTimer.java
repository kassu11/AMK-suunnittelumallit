package task04;

import java.util.Observable;

public class ClockTimer extends Observable {
    private int hour, minute, second;

    public void tick() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }

        setChanged();
        notifyObservers();
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
        setChanged();
        notifyObservers();
    }

    public void setMinute(int minute) {
        this.minute = minute;
        setChanged();
        notifyObservers();
    }

    public void setSecond(int second) {
        this.second = second;
        setChanged();
        notifyObservers();
    }
}
