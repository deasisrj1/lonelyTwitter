package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class Happy extends CurrentMood {
    public String mood = "I am happy";

    public Happy() {
        super();
    }
    public Happy(Date date){
        super(date);
    }

    @Override
    public String returnMood(){
        return this.mood;
    }
}
