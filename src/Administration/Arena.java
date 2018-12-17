package Administration;

public class Arena {
    final int[] arenaArray;
    final int finishBoxP1;
    final int finishBoxP2;
    final int startBoxP1;
    final int startBoxP2;
    final Boolean playeroneturn;

    public Arena(){
        arenaArray = new int[16];
        finishBoxP1 = 0;
        finishBoxP2 = 0;
        startBoxP1 = 3;
        startBoxP2 = 3;
        playeroneturn = true;
    }

    public Arena(int[] arenaArray, int finishBoxP1, int finishBoxP2, int startBoxP1, int startBoxP2, boolean playeroneturn){
        this.arenaArray = arenaArray;
        this.finishBoxP1 = finishBoxP1;
        this.finishBoxP2 = finishBoxP2;
        this.startBoxP1 = startBoxP1;
        this.startBoxP2 = startBoxP2;
        this.playeroneturn = playeroneturn;
    }

    public Arena(int[] arenaArray, int finishBoxP1, int finishBoxP2, int startBoxP1, int startBoxP2){
        this.arenaArray = arenaArray;
        this.finishBoxP1 = finishBoxP1;
        this.finishBoxP2 = finishBoxP2;
        this.startBoxP1 = startBoxP1;
        this.startBoxP2 = startBoxP2;
        this.playeroneturn = null;
    }

    public Arena(Arena arena, boolean playeroneturn){
        this.arenaArray = arena.arenaArray;
        this.playeroneturn = playeroneturn;
        this.finishBoxP1 = arena.finishBoxP1;
        this.finishBoxP2 = arena.finishBoxP2;
        this.startBoxP1 = arena.startBoxP1;
        this.startBoxP2 = arena.startBoxP2;
    }

    //Tests
    public Arena move(int from, int to){
        if(arenaArray[from] == 0){
            throw new RuntimeException("invalid move");
        }
        return null;

    }

    //GETTER AND SETTER:


}
