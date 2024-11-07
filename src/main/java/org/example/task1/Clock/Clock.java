package org.example.task1.Clock;

public class Clock implements Readable{
    private int hour;
    private int minute;
    private int second;

    public void setHour (int hour) {
    this.hour = hour;
}
    public void setMinute ( int minute) {
    this.minute = minute;
}
    public void setSecond( int second) {
    this.second = second;
}
public int getHour () {
        return this.hour;
    }
public int getMinute () {
    return this.minute;
    }
public int getSecond() {
        return this.second;
    }
public void tick (int second) {
        second++;
//        this.second = second;
    System.out.println("Измененное время: " + second );
}

    @Override
    public void readTime() {
        System.out.println("Текущее время: " + hour + ": " + minute+ ": " + second);
    }
}
