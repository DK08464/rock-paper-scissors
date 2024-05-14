import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        String[] choices = {"rock", "paper", "scissors"};
        Random rand = new Random();
        int n = rand.nextInt(3); // Generates a random number from 0 to 2
        String op = choices[n]; // Computer's choice

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice (rock, paper, or scissors):");
        String inp = sc.next().toLowerCase(); // User's choice

        System.out.println("Computer chose: " + op);

        switch (inp) {
            case "rock"->{
                if (op.equals("rock")) {
                    System.out.println("Tie");
                } else if (op.equals("paper")) {
                    System.out.println("You lose!");
                } else { 
                    System.out.println("You win!");
                }
            }  

            case "paper"->{
                if (op.equals("rock")) {
                    System.out.println("You win!");
                } else if (op.equals("paper")) {
                    System.out.println("Tie");
                } else {
                    System.out.println("You lose!");
                }
            }

            case "scissors"->{
                if (op.equals("rock")) {
                    System.out.println("You lose!");
                } else if (op.equals("paper")) {
                    System.out.println("You win!");
                } else {
                    System.out.println("Tie");
                }
            }  

            default -> {
                System.out.println("Please check the correct spelling: rock, paper, or scissors ;)");
                System.out.println("So, computer wins!");
            }
                
        }
    }
}
