import java.util.*;
public class Chess {
    public static void main(String[] args) {
        String team = "Pawn Elephant knight Bishop King Minister";
        StringTokenizer enemy = new StringTokenizer(team);
        while(enemy.hasMoreTokens()){
            String initial = enemy.nextToken();
            System.out.println(enemy.nextToken() + "");
        }
    }
}
