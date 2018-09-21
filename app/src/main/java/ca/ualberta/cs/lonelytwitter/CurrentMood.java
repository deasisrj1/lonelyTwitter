package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class CurrentMood {
    protected Date date;

    public CurrentMood() {
        this.date = new Date();
    }
    public CurrentMood(Date date) {
        this.date = date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate(){
        return this.date;
    }


    public abstract String returnMood();
}
