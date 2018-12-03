package CG;

public class Dice {

    public Dice(){

    }

    public int roll(){
        int random;
        random = (int) Math.random()*6;
        return random;
    }
}
