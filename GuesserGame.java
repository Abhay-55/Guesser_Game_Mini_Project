import java.util.*;
class Guesser{
    int guessNum;

    int guessNum(){
        System.out.print("Guesser kindly guess a number : ");
        Scanner g = new Scanner(System.in);
        guessNum = g.nextInt();
        return guessNum;
    }
}

class Player{
    int guessNum;

    int guessNum(){

        System.out.print("player kindly guess a number : ");
        Scanner p = new Scanner(System.in);
        guessNum = p.nextInt();
        return guessNum;
    }
}

class Umpire{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

     void collectFromGuesser(){
        Guesser guesser = new Guesser();
        numFromGuesser = guesser.guessNum(); 
     }

     void collectFromPlayer(){
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        numFromPlayer1 = p1.guessNum();
        numFromPlayer2 = p2.guessNum();
        numFromPlayer3 = p3.guessNum();

     }

    void compare(){
        if(numFromGuesser == numFromPlayer1){
            if(numFromGuesser == numFromPlayer2 &&
                numFromGuesser == numFromPlayer3){
                    System.out.println("All Three Playwer won!");
                }
            else if(numFromGuesser == numFromPlayer2){
                System.out.println("Player 1 & Player 2 won!");
            }
            else if(numFromGuesser == numFromPlayer3){
                System.out.println("Player 1 & Player 3 won!");
            }
            else{
                System.out.println("Player 1 won!");
            }

        }

        else if(numFromGuesser == numFromPlayer2){
            if(numFromGuesser==numFromPlayer3){
                System.out.println("Player 2 & Player 3 won!");
            }
            else{
                System.out.println("Player 2 won!");
            }
        }
        else if (numFromGuesser == numFromPlayer3){
            System.out.println("Player 3 Won!");
        }
        else{
            System.out.println("Game lost! try again.");

        }
    }
}



class GuesserGame{
    public static void main(String[] args) {
        Umpire u = new Umpire();
        u.collectFromGuesser();
        u.collectFromPlayer();
        u.compare();

        System.out.println("first Round is complete.");
    }
}