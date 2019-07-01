package org.clock.logic;

public class ClockLogic {
    private int hour;
    private int minute;
    private int second;

    public ClockLogic(int hour, int minute, int second) {

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setClock(int hour, int minute, int second) {
        if (hour < 24 && hour > -1)
            this.hour = hour;
        if (minute < 60 && minute > -1)
            this.minute = minute;
        if (second < 60 && minute > -1)
            this.second = second;
    }
    public void tik (int second) {
        this.second += second;
        if (this.second > 60) {
            this.second = second % 60;
            this.minute += second / 60;
        }
        if (this.minute > 60) {
            this.minute = minute % 60;
            this.hour += minute / 60;
        }
        if (this.hour > 24) {
           this.hour = hour % 24;
        }
    }

        public int getHour () {
            return hour;
        }

        public int getMinute () {
            return minute;
        }

        public int getSecond () {
            return second;
        }
    }