package Administration;

public class Dice {

    public Dice(){

    }

    public int roll(){
        int random;
        random = (int) Math.ceil(Math.random()*6);
        return random;
    }
}
