package Administration;

public class Arena {
    Figure[] arenaArray;
    Figure[] startBoxP1;
    Figure[] finishBoxP1;
    Figure[] startBoxP2;
    Figure[] finishBoxP2;

    public Arena(){
        arenaArray = new Figure[20];
        startBoxP1 = new Figure[3];
        finishBoxP1 = new Figure[3];
        startBoxP2 = new Figure[3];
        finishBoxP2 = new Figure[3];
    }
}
