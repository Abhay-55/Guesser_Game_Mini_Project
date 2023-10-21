import java.util.*;
class Guesser{
    int guessNum;

    int guessNum(){
        
        Scanner g = new Scanner(System.in);
        int a;
        while(true){
            System.out.print("Guesser kindly guess a number between 1-10 : ");
            a = g.nextInt();
            if(a>0 & a<11){
                guessNum = a;
                break;
            }
            else{
                System.out.println("Invalid Number! Please enter between 1 - 10");
            }

    }
        return guessNum;
    }
}

class Player1{
    int guessNum;

    int guessNum(){
        
        Scanner p = new Scanner(System.in);
        int a;
        while(true){
            System.out.print("player_1 kindly guess a number between 1-10 : ");
            a = p.nextInt();
            if(a>0 & a<11){
                guessNum = a;
                break;
            }
            else{
                System.out.println("Invalid Number! Please enter between 1 - 10");
            }
        }
        return guessNum;
    }
}

class Player2{
    int guessNum;

    int guessNum(){
        
        Scanner p = new Scanner(System.in);
        int a;
        while(true){
            System.out.print("player_2 kindly guess a number between 1-10 : ");
            a = p.nextInt();
            if(a>0 & a<11){
                guessNum = a;
                break;
            }
            else{
                System.out.println("Invalid Number! Please enter between 1 - 10");
            }
        }
        return guessNum;
    }
}

class Player3{
    int guessNum;

    int guessNum(){
        
        Scanner p = new Scanner(System.in);
        int a;
        while(true){
            System.out.print("player_3 kindly guess a number between 1-10 : ");
            a = p.nextInt();
            if(a>0 & a<11){
                guessNum = a;
                break;
            }
            else{
                System.out.println("Invalid Number! Please enter between 1 - 10");
            }
        }
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
        Player1 p1 = new Player1();
        Player2 p2 = new Player2();
        Player3 p3 = new Player3();

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
