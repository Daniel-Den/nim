import java.util.*;

public class Nim{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Welcome to my game of Nim.");
    int turncheck = (int) (Math.random() * 2); //bug: comp doesn't go second
    int n = 0;
    int compturn = 0;
    if (turncheck == 1){
      System.out.println("This time I am going to go first.");
      while(n >= 30 || n <= 20){
        System.out.println("You must pick n number of toothpicks  greater than 20 and less than 30.");
        System.out.print("How many toothpicks would you like there to be? ");
        n = keyboard.nextInt();
      }
      compturn = (int) ((Math.random() * 3) + 1);
      System.out.println("My Turn. There are " + n + " toothpicks left. I, the Computer, will remove " + compturn + " of them.");
      n -= compturn;
    }
    if (turncheck == 0){
      System.out.println("This time you are going to go first.");
      n = ((int) (Math.random() * 9) + 21);
      System.out.println("I choose the total number of toothpicks to be " + n);
    }
    int playerturn = 0;
    while(true){
      while(true){
        System.out.print("Your Turn. There are " + n + " toothpicks left. How many toothpicks do you want to remove? ");
        playerturn = keyboard.nextInt();
        if (playerturn >= 1 && playerturn <= 3){
          break;
        }
      }
      n -= playerturn;

      compturn = (int) ((Math.random() * 3) + 1);
      if (n<=0){
        System.out.println("YOU LOSE!");
        break;
      }
      if (n==4){
        compturn = 3;
      }
      if (n==3){
        compturn = 2;
      }
      if (n==2){
        compturn = 1;
      }
      System.out.println("My Turn. There are " + n + " toothpicks left. I, the Computer, will remove " + compturn + " of them.");
      n -= compturn;
      if (n <=0){
        System.out.println("YOU WIN!");
        break;
      }
    }
  }
}
