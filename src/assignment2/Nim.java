import java.util.Scanner;

public class Nim {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sticks = in.nextInt();
        int botMove = 0;
        int round = 0;
        
        while (sticks > 0) {
            int humanMove = 0;
            while (humanMove < 1 || humanMove > 2 || humanMove > sticks) {
                humanMove = in.nextInt();
                    }

            System.out.println("Round " + round + ": " + sticks + " at start human takes " + humanMove + ", so " + (sticks - humanMove) + " remain");
            sticks -= humanMove;
            round++;
            
            if (sticks > 0) {
            while (botMove < 1 || botMove > 2 || botMove > sticks) {
                botMove = (int) (Math.random() * 10);
                }
            }
            else {
                System.out.println("The computer loses / you win!");
                break;
            }

            System.out.println("Round " + round + ": " + sticks + " at start bot takes " + botMove + ", so " + (sticks - botMove) + " remain");
            sticks -= botMove;
            if (sticks == 0) {
                System.out.println("The computer wins / you lose!");
            }
            round++;
        }
    }
}
