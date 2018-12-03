package Administration;

public class Arena {
    Figure[] arenaArray;
    Figure[] startBoxP1;
    Figure[] finishBoxP1;
    Figure[] startBoxP2;
    Figure[] finishBoxP2;
    Figure[][] searchBox;

    public Arena(){
        arenaArray = new Figure[20];
        startBoxP1 = new Figure[]{ new Figure(1, 1), new Figure(1, 2), new Figure(1, 3) };
        finishBoxP1 = new Figure[3];
        startBoxP2 = new Figure[]{ new Figure(2, 4), new Figure(2, 5), new Figure(2, 6) };
        finishBoxP2 = new Figure[3];
        searchBox = new Figure[][] {arenaArray, startBoxP1, finishBoxP1, startBoxP1, finishBoxP2};
    }



    //GETTER AND SETTER:

    public int getFigurePosition(int figureID){
        int figurePosition;
        int id = -1;
        for(int i = 0; i == searchBox.length; i++){
            for(int j=0; j == searchBox[i].length; j++){
                id = searchBox[i][j].getId();
                    if(id == figureID){
                        break;
                    }

            }
        }
        return id;
    }

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

}
