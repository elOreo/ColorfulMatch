package Administration;

public class Figure {
    private int playerNumber;
    private int id;


    public Figure(int playerNumber, int id){
        this.playerNumber = playerNumber;
        this.id = id;
    }

    //GETTER AND SETTER:

    public int getPlayerNumber() {
        return playerNumber;
    }

    public int getId() {
        return id;
    }
}
