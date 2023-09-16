import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        while(true){
        String[] rps = {"r","p","s"};
        String computerMove = rps[new Random().nextInt(rps.length)];

    
        String playerMove;

        while(true){
            System.out.println("choose your move (r, p, or s)");
            playerMove = scanner.nextLine();
            if(playerMove.equals("r")|| playerMove.equals("p")|| playerMove.equals("s")){
                break;
            }
            System.out.println(playerMove + "is not a valid move.");

        }
        System.out.println("Computer played:" + computerMove);
        if(playerMove.equals(computerMove)) {
            System.out.println("The game was a tie!");
        }
        else if(playerMove.equals("r")){
            if(computerMove.equals("p")){
                System.out.println(" OOpssss...you Lose!.");
            }
            else if(computerMove.equals("s")){
                System.out.println("Hurrhhhhh you WIN!.....");
            }
        }
        else if(playerMove.equals("p")){
            if(computerMove.equals("r")){
                System.out.println("yes ... you Win!!!!");

            } else if(computerMove.equals("s")){
                System.out.println("you LOSE!");
            }
        }

        else if(playerMove.equals("s")){
            if(computerMove.equals("p")){
                System.out.println("hyyyy you win!!...");
            }else if (computerMove.equals("r")){
                System.out.println("Ohh nooo you Lose!!...");
            }
        }
        System.out.println("Do you want to play again? (y/n)");
        String playAgain=scanner.nextLine();
        if(!playAgain.equals("y")){
              break;
            }
        }
            }
}
