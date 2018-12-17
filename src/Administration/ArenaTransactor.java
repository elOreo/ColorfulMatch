package Administration;

import Administration.Diff.ArenaArrayDiff;
import Administration.Diff.Diff;

import java.util.ArrayList;
import java.util.List;

public class ArenaTransactor {

    public final static int playeronestart = 0;
    public final static int playertwostart = 8;

    public static TransactorResult transact(Arena current, Arena next, int roll){
        List<ArenaArrayDiff> arenaArrayDiffs = new ArrayList<>();
        for(int i = 0; i<current.arenaArray.length; i++){
            int currentPos = current.arenaArray[i];
            int nextPos = next.arenaArray[i];

            if(currentPos != nextPos){
                arenaArrayDiffs.add(new ArenaArrayDiff(i, currentPos, nextPos));
            }

        }

        int finishBoxP1Diff = next.finishBoxP1 - current.finishBoxP1;
        int finishBoxP2Diff = next.finishBoxP2 - current.finishBoxP2;
        int startBoxP1Diff = next.startBoxP1 - current.startBoxP1;
        int startBoxP2Diff = next.startBoxP2 - current.startBoxP2;



        //Figur von A nach B Prüfung:
        boolean noStartDiffs = startBoxP1Diff == 0 && startBoxP2Diff == 0;
        boolean noFinishDiffs = finishBoxP1Diff == 0 && finishBoxP2Diff == 0;
        boolean noStartFinishDiffs = noStartDiffs && noFinishDiffs;

        next = new Arena(next, !current.playeroneturn);

        if(arenaArrayDiffs.size()== 2){
            ArenaArrayDiff diff1 = arenaArrayDiffs.get(0);
            ArenaArrayDiff diff2 = arenaArrayDiffs.get(1);
            if(diff1.index == (diff2.index + roll) % current.arenaArray.length){
                ArenaArrayDiff tmp = diff1;
                diff1 = diff2;
                diff2 = tmp;
            }
            if(diff2.index == (diff1.index + roll) % current.arenaArray.length
                    && diff1.before == diff2.after
                    && diff1.after == 0
                    && (diff1.before == 1) == current.playeroneturn
                    && diff1.before != 0 && (noStartFinishDiffs && diff2.before == 0
                    || (current.playeroneturn && startBoxP2Diff == 1 && startBoxP1Diff == 0
                    || !current.playeroneturn && startBoxP1Diff == 1 && startBoxP2Diff == 0)
                    && noFinishDiffs)) {


                return new TransactorResult(next, true);

            }
        }
        else if(arenaArrayDiffs.size() == 1){
            ArenaArrayDiff diff = arenaArrayDiffs.get(0);
            if (noFinishDiffs && roll == 6  && (diff.after == 1) == current.playeroneturn && diff.after != 0
                    && (current.playeroneturn && startBoxP1Diff == -1 && diff.index == playeronestart
                        && (startBoxP2Diff == 0 && diff.before == 0 || startBoxP2Diff == 1 && diff.before == 2)
                    || !current.playeroneturn && startBoxP2Diff == -1 && diff.index == playertwostart
                        && (startBoxP1Diff == 0 && diff.before == 0 || startBoxP1Diff == 1 && diff.before == 1))){

                return new TransactorResult(next, true);
            }
            else if(noStartDiffs && diff.after == 0
                    && (current.playeroneturn && diff.index + roll >= (playeronestart -1) % current.arenaArray.length
                    && finishBoxP1Diff == 1 && finishBoxP2Diff == 0
                    || !current.playeroneturn && diff.index + roll >= (playertwostart -1) % current.arenaArray.length
                    && finishBoxP2Diff == 1 && finishBoxP1Diff == 0)){

                return new TransactorResult(next, true);
            }

        }
        return new TransactorResult(current, false);
    }

}
