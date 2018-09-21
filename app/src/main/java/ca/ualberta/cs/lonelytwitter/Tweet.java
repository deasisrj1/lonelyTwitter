package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

public abstract class Tweet {
    protected String message;
    protected Date date;
    protected ArrayList<String> listOfMoods = new ArrayList<String>();


    public void setMessage(String messagee) throws TweetTooLong {
        if (this.message.length() > 140) {
            throw new TweetTooLong();
        }
        this.message = message;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return this.message;
    }

    public Date getDate() {
        return this.date;
    }

    public void addMoodToList(String mood) {
        listOfMoods.add(mood);
    }

    public abstract Boolean isImportant();
}
