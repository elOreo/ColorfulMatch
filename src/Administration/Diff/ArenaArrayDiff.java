package Administration.Diff;

import Administration.Arena;

public class ArenaArrayDiff implements Diff {
    public final int index;
    public final int before;
    public final int after;

    public ArenaArrayDiff(int index, int before, int after){
        this.after = after;
        this.before = before;
        this.index = index;
    }
}
