package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

public class DomesticDuck extends Animal implements FlyingBehaviour{
    public DomesticDuck(String type, String food) {
        super(type, food);
    }

    @Override
    public void swim() {
        Log.d("cmput301", "Yeah, I love to swim.");
    }

    public void doesLikeFlying(){
        Log.d("cmput301", "No, I fly only when a cat attacks me.")
    }
}
