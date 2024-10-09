import java.util.Scanner;
import java.util.Random;
public class Task8 {
    public static void main(String[] args){
        //initializing variables
        Scanner in = new Scanner(System.in);
        Random ran = new Random();
        boolean done = false;
        int yn;
        int die1;
        int die2;
        int die3;
        int sum;
        String trash;
        //start of the main loop
            do{
                boolean done2 = false;
                int round = 0;
                //input for YES or NO
                System.out.println("Roll the dice? (0 for no, 1 for yes)");
                if(in.hasNextInt()) {
                    yn = in.nextInt();
                    in.nextLine();
                    //check for a yes input
                    if(yn == 1) {
                        //header
                        System.out.println("Roll\t\tDie1\t\tDie2\t\tDie3\t\tSum");
                        System.out.println("----------------------------------------------------------");
                        do{
                            //random rolls
                            die1 = ran.nextInt(6)+1;
                            die2 = ran.nextInt(6)+1;
                            die3 = ran.nextInt(6)+1;
                            sum = die1 + die2 + die3;
                            round++;
                            //result print
                            System.out.println(round + "\t\t\t" + die1 + "\t\t\t" + die2 + "\t\t\t" + die3 + "\t\t\t" + sum);
                            //check for triple roll
                            if(die1 == die2 & die2 == die3){
                                System.out.println("You win!");
                                System.out.println();
                                done2 = true;
                            }
                        }while(!done2);
                    }
                    //end program if no
                    else if(yn == 0){
                        done = true;
                    }
                    else{
                        System.out.println("You entered an invalid input.");
                    }
                }
                //invalid input
                else {
                    trash = in.next();
                    System.out.println("You entered an invalid input.");
                    in.nextLine();
                }
            }while(!done);
        }
    }
