package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class Sad extends CurrentMood {
    String mood = "I am Sad.";

    public Sad(){
        super();
    }

    public Sad(Date date){
        super(date);
    }

    @Override
    public String returnMood(){
        return this.mood;
    }
}
