//numberguess poject
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        int computerguess = rand.nextInt(100) + 1;
//        System.out.println("guess number is :"+computerguess);

        int userguess = 0;

        Scanner sc = new Scanner(System.in);

        int count = 0;
        while (true) {
            System.out.println("Enter your guess (1-100): ");

            userguess = sc.nextInt();
            if (userguess == computerguess) {
                System.out.println("Congratulation..! you guess correct");
                break;
            } else if (userguess > computerguess) {
                System.out.println(" your guess is high..! guess again");
                System.out.println("_____________________________________\n");
            } else {
                System.out.println(" your guess is lower..! guess again");
                System.out.println("_____________________________________\n");

            }
            count++;


        }
        System.out.println("Number of iteration requied to user to guess correct number is:" + count);

        if (count == 1) {
            System.out.println("user score is:" + 100);
        } else if (count > 1 && count < 10) {
            System.out.println("user score is:" + 50);
        } else {
            System.out.println("user score is:" + 10);
        }



        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            System.out.println("____________________________________");
            System.out.println("can you want to play one more round ?");
            System.out.println(" if yes press 1 or press 0 to end the game");
            int play = sc.nextInt();
            if (play == 1) {
                int count1 = 0;
                while (true) {
                    System.out.println("Enter your guess (1-100): ");

                    userguess = sc.nextInt();
                    if (userguess == computerguess) {
                        System.out.println("Congratulation..! you guess correct...");
                        break;
                    } else if (userguess > computerguess) {
                        System.out.println(" your guess is high..! guess again");
                        System.out.println("_____________________________________\n");
                    } else {
                        System.out.println(" your guess is lower..! guess again");
                        System.out.println("_____________________________________\n");

                    }
                    count1++;


                }
                System.out.println("Number of iteration required to user to guess correct number is:" + count1);

                if (count1 == 1) {
                    System.out.println("user score is:" + 100);
                } else if (count1 > 1 && count < 10) {
                    System.out.println("user score is:" + 50);
                } else {
                    System.out.println("user score is:" + 10);
                }


            } else {
                System.out.println("Thank you..!,End the game....");
                break;
            }

        }
    }

}
