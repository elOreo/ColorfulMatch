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

    //GETTER AND SETTER:

    public Figure[] getArenaArray() {
        return arenaArray;
    }

    public Figure[] getStartBoxP1() {
        return startBoxP1;
    }

    public Figure[] getFinishBoxP1() {
        return finishBoxP1;
    }

    public Figure[] getStartBoxP2() {
        return startBoxP2;
    }

    public Figure[] getFinishBoxP2() {
        return finishBoxP2;
    }

    public void setArenaArray(Figure[] arenaArray) {
        this.arenaArray = arenaArray;
    }

    public void setStartBoxP1(Figure[] startBoxP1) {
        this.startBoxP1 = startBoxP1;
    }

    public void setFinishBoxP1(Figure[] finishBoxP1) {
        this.finishBoxP1 = finishBoxP1;
    }

    public void setStartBoxP2(Figure[] startBoxP2) {
        this.startBoxP2 = startBoxP2;
    }

    public void setFinishBoxP2(Figure[] finishBoxP2) {
        this.finishBoxP2 = finishBoxP2;
    }
}
