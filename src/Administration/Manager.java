package Administration;

public class Manager {


    public static void main(String[] args){
        Arena arena = new Arena();
        Arena arena2 = new Arena(new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 0, 0, 2, 3);
        System.out.println(ArenaTransactor.transact(arena, arena2, 6).validMove);

    }

}
