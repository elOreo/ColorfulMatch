package Administration;


public class Main {

    public static void main(String[] args){

        Dice dice = new Dice();
        int random = dice.roll();
        System.out.println(random);

    }
}
