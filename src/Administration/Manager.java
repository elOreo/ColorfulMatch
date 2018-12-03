package Administration;

public class Manager {

    private Player p1;
    private Player p2;
    private Arena arena;
    private Dice dice;
    private int activePlayer = 1;

    public Manager(){
        p1 = new Player(1);
        p2 = new Player(2);
        arena = new Arena();
        dice = new Dice();
    }

    //GETTER AND SETTER:
    public Player getP1() {
        return p1;
    }

    public Player getP2() {
        return p2;
    }

    public Arena getArena() {
        return arena;
    }

    public Dice getDice() {
        return dice;
    }

    public int getActivePlayer() {
        return activePlayer;
    }
}
