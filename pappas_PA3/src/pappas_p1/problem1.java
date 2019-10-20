package pappas_p1;
import java.util.Random;
import java.util.Scanner;
import java.security.SecureRandom;

public class problem1 {

    public static void questionType()
    {
        System.out.println("\nPlease enter the type of problem you'd like to practice");
        System.out.println("1 - Addition");
        System.out.println("2 - Multiplication");
        System.out.println("3 - Subtraction");
        System.out.println("4 - Division");
        System.out.println("5 - Mixture of all");
    }

    public static void main(String[] args) {
        while (true)
        {
            Scanner scan = new Scanner(System.in);
            Random rand = new SecureRandom();
            int i, randResponse, userChoice, randMix;
            double userAnswer, rand1, rand2, answer;
            double n = 0;
            double avg;
            double userAnswerDiv;
            double answerDiv;

            System.out.println("What is your level of difficulty?");
            int difficulty = scan.nextInt();
            
            questionType();

            userChoice = scan.nextInt();
            switch (userChoice) {
                case 1:// Addition
                {
                    for (i = 0; i < 10; i++) {
                        randResponse = rand.nextInt(5);
                        rand1 = rand.nextInt(10);
                        rand2 = rand.nextInt(10);
                        System.out.println("What is " + rand1 + " plus " + rand2);
                        answer = rand1 + rand2;
                        userAnswer = scan.nextDouble();
                        if (Double.compare(userAnswer, answer) == 0) {
                            n++;
                            switch (randResponse) {

                                case 0:
                                    System.out.println("Very good!");
                                    break;
                                case 1:
                                    System.out.println("Excellent!");
                                    break;
                                case 2:
                                    System.out.println("Nice Work!");
                                    break;
                                case 3:
                                    System.out.println("Keep up the good work!");
                                    break;
                            }
                        } else {
                            switch (randResponse) {

                                case 0:
                                    System.out.println("No. \nPlease try again.");
                                    break;
                                case 1:
                                    System.out.println("Wrong. Try once more.");
                                    break;
                                case 2:
                                    System.out.println("Don't give up!");
                                    break;
                                case 3:
                                    System.out.println("No. Keep trying.");
                                    break;
                            }
                        }
                    }
                    avg = n / 10;
                    System.out.println("Answers Correct: " + n);
                    System.out.println("Answers Incorrect: " + (10 - n));
                    if (avg > .75)
                        System.out.println("\nCongratulations, you are ready to go to the next level!");

                    else
                        System.out.println("\nPlease ask your teacher for extra help.");
                    break;
                }

                case 2:// Multiplication
                {
                    for (i = 0; i < 10; i++) {
                        randResponse = rand.nextInt(5);
                        rand1 = rand.nextInt(10);
                        rand2 = rand.nextInt(10);
                        System.out.println("What is " + rand1 + " times " + rand2);
                        answer = rand1 * rand2;
                        userAnswer = scan.nextDouble();
                        if (Double.compare(userAnswer, answer) == 0) {
                            n++;
                            switch (randResponse) {

                                case 0:
                                    System.out.println("Very good!");
                                    break;
                                case 1:
                                    System.out.println("Excellent!");
                                    break;
                                case 2:
                                    System.out.println("Nice Work!");
                                    break;
                                case 3:
                                    System.out.println("Keep up the good work!");
                                    break;
                            }
                        } else {
                            switch (randResponse) {

                                case 0:
                                    System.out.println("No. \nPlease try again.");
                                    break;
                                case 1:
                                    System.out.println("Wrong. Try once more.");
                                    break;
                                case 2:
                                    System.out.println("Don't give up!");
                                    break;
                                case 3:
                                    System.out.println("No. Keep trying.");
                                    break;
                            }
                        }
                    }
                    avg = n / 10;
                    System.out.println("Answers Correct: " + n);
                    System.out.println("Answers Incorrect: " + (10 - n));
                    if (avg < .75)
                        System.out.println("\nPlease ask your teacher for extra help.");

                    else
                        System.out.println("\nCongratulations, you are ready to go to the next level!");
                    break;
                }

                case 3:// Subtraction
                {
                    for (i = 0; i < 10; i++) {
                        randResponse = rand.nextInt(5);
                        rand1 = rand.nextInt(10);
                        rand2 = rand.nextInt(10);
                        System.out.println("What is " + rand1 + " minus " + rand2);
                        answer = rand1 - rand2;
                        userAnswer = scan.nextDouble();
                        if (Double.compare(userAnswer, answer) == 0) {
                            n++;
                            switch (randResponse) {

                                case 0:
                                    System.out.println("Very good!");
                                    break;
                                case 1:
                                    System.out.println("Excellent!");
                                    break;
                                case 2:
                                    System.out.println("Nice Work!");
                                    break;
                                case 3:
                                    System.out.println("Keep up the good work!");
                                    break;
                            }
                        } else {
                            switch (randResponse) {

                                case 0:
                                    System.out.println("No. \nPlease try again.");
                                    break;
                                case 1:
                                    System.out.println("Wrong. Try once more.");
                                    break;
                                case 2:
                                    System.out.println("Don't give up!");
                                    break;
                                case 3:
                                    System.out.println("No. Keep trying.");
                                    break;
                            }
                        }
                    }
                    avg = n / 10;
                    System.out.println("Answers Correct: " + n);
                    System.out.println("Answers Incorrect: " + (10 - n));
                    if (avg < .75)
                        System.out.println("\nPlease ask your teacher for extra help.");
                    else
                        System.out.println("\nCongratulations, you are ready to go to the next level!");
                    break;
                }

                case 4:// Division
                {
                    for (i = 0; i < 10; i++) {
                        randResponse = rand.nextInt(5);
                        rand1 = rand.nextInt(10);
                        rand2 = rand.nextInt(9) + 1;
                        System.out.println("What is " + rand1 + " divided by " + rand2);
                        answerDiv = rand1 / rand2;
                        userAnswerDiv = scan.nextDouble();
                        if (Double.compare(userAnswerDiv, answerDiv) == 0) {
                            n++;
                            switch (randResponse) {

                                case 0:
                                    System.out.println("Very good!");
                                    break;
                                case 1:
                                    System.out.println("Excellent!");
                                    break;
                                case 2:
                                    System.out.println("Nice Work!");
                                    break;
                                case 3:
                                    System.out.println("Keep up the good work!");
                                    break;
                            }
                        } else {
                            switch (randResponse) {

                                case 0:
                                    System.out.println("No. \nPlease try again.");
                                    break;
                                case 1:
                                    System.out.println("Wrong. Try once more.");
                                    break;
                                case 2:
                                    System.out.println("Don't give up!");
                                    break;
                                case 3:
                                    System.out.println("No. Keep trying.");
                                    break;
                            }
                        }
                    }
                    avg = n / 10;
                    System.out.println("Answers Correct: " + n);
                    System.out.println("Answers Incorrect: " + (10 - n));
                    if (avg < .75)
                        System.out.println("\nPlease ask your teacher for extra help.");
                    else
                        System.out.println("\nCongratulations, you are ready to go to the next level!");
                    break;
                }

                case 5:// Mix
                {
                    for (i = 0; i < 10; i++) {
                        rand1 = rand.nextInt(10);
                        rand2 = rand.nextInt(9) + 1;
                        randMix = rand.nextInt(4);
                        switch (randMix) {
                            case 0: //Addition
                            {
                                System.out.println("What is " + rand1 + " plus " + rand2);
                                userAnswer = scan.nextDouble();
                                answer = rand1 + rand2;
                                randResponse = rand.nextInt(5);
                                if (Double.compare(userAnswer, answer) == 0) {
                                    n++;
                                    switch (randResponse) {

                                        case 0:
                                            System.out.println("Very good!");
                                            break;
                                        case 1:
                                            System.out.println("Excellent!");
                                            break;
                                        case 2:
                                            System.out.println("Nice Work!");
                                            break;
                                        case 3:
                                            System.out.println("Keep up the good work!");
                                            break;
                                    }
                                } else {
                                    switch (randResponse) {

                                        case 0:
                                            System.out.println("No. \nPlease try again.");
                                            break;
                                        case 1:
                                            System.out.println("Wrong. Try once more.");
                                            break;
                                        case 2:
                                            System.out.println("Don't give up!");
                                            break;
                                        case 3:
                                            System.out.println("No. Keep trying.");
                                            break;
                                    }
                                }
                                break;
                            }

                            case 1: //Subtraction
                            {
                                System.out.println("What is " + rand1 + " minus " + rand2);
                                userAnswer = scan.nextDouble();
                                answer = rand1 - rand2;
                                randResponse = rand.nextInt(5);
                                if (Double.compare(userAnswer, answer) == 0) {
                                    n++;
                                    switch (randResponse) {

                                        case 0:
                                            System.out.println("Very good!");
                                            break;
                                        case 1:
                                            System.out.println("Excellent!");
                                            break;
                                        case 2:
                                            System.out.println("Nice Work!");
                                            break;
                                        case 3:
                                            System.out.println("Keep up the good work!");
                                            break;
                                    }
                                } else {
                                    switch (randResponse) {

                                        case 0:
                                            System.out.println("No. \nPlease try again.");
                                            break;
                                        case 1:
                                            System.out.println("Wrong. Try once more.");
                                            break;
                                        case 2:
                                            System.out.println("Don't give up!");
                                            break;
                                        case 3:
                                            System.out.println("No. Keep trying.");
                                            break;
                                    }
                                }
                                break;
                            }

                            case 2: //Multiplication
                            {
                                System.out.println("What is " + rand1 + " times " + rand2);
                                userAnswer = scan.nextDouble();
                                answer = rand1 * rand2;
                                randResponse = rand.nextInt(5);
                                if (Double.compare(userAnswer, answer) == 0) {
                                    n++;
                                    switch (randResponse) {

                                        case 0:
                                            System.out.println("Very good!");
                                            break;
                                        case 1:
                                            System.out.println("Excellent!");
                                            break;
                                        case 2:
                                            System.out.println("Nice Work!");
                                            break;
                                        case 3:
                                            System.out.println("Keep up the good work!");
                                            break;
                                    }
                                } else {
                                    switch (randResponse) {

                                        case 0:
                                            System.out.println("No. \nPlease try again.");
                                            break;
                                        case 1:
                                            System.out.println("Wrong. Try once more.");
                                            break;
                                        case 2:
                                            System.out.println("Don't give up!");
                                            break;
                                        case 3:
                                            System.out.println("No. Keep trying.");
                                            break;
                                    }
                                }
                                break;
                            }

                            case 3: //Division
                            {
                                System.out.println("What is " + rand1 + " divided by " + rand2);
                                rand2 = rand.nextInt() + 1;
                                userAnswerDiv = scan.nextDouble();
                                answerDiv = rand1 * rand2;
                                randResponse = rand.nextInt(5);
                                if (Double.compare(userAnswerDiv, answerDiv) == 0) {
                                    n++;
                                    switch (randResponse) {

                                        case 0:
                                            System.out.println("Very good!");
                                            break;
                                        case 1:
                                            System.out.println("Excellent!");
                                            break;
                                        case 2:
                                            System.out.println("Nice Work!");
                                            break;
                                        case 3:
                                            System.out.println("Keep up the good work!");
                                            break;
                                    }
                                } else {
                                    switch (randResponse) {

                                        case 0:
                                            System.out.println("No. \nPlease try again.");
                                            break;
                                        case 1:
                                            System.out.println("Wrong. Try once more.");
                                            break;
                                        case 2:
                                            System.out.println("Don't give up!");
                                            break;
                                        case 3:
                                            System.out.println("No. Keep trying.");
                                            break;
                                    }
                                }
                            }
                        }
                    }
                    avg = n / 10;
                    System.out.println("Answers Correct: " + n);
                    System.out.println("Answers Incorrect: " + (10 - n));
                    if (avg < .75)
                        System.out.println("\nPlease ask your teacher for extra help.");
                    else
                        System.out.println("\nCongratulations, you are ready to go to the next level!");
                    break;
                }
            }
            System.out.println("Would you like to continue? 1 for yes 0 for no");
            int restart;
            restart = scan.nextInt();

            if (restart == 0)
               break;
        }
    }
}