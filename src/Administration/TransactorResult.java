package Administration;

public class TransactorResult {

    final Arena arena;
    final boolean validMove;

    public TransactorResult(Arena arena, boolean validMove){
        this.arena = arena;
        this.validMove = validMove;
    }
}
