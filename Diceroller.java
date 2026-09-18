import java.util.*;
import java.util.Random;


public class Diceroller{
    public static void main(String args[]){



        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numofdice;
        int total = 0;

        System.out.print("Enter no. of dices to roll: ");
        numofdice = sc.nextInt();

        if(numofdice > 0)
        {
            for(int i = 0;i < numofdice;i++){
                int roll = random.nextInt(1,7);
                printDie(roll);
                System.out.println("you rolled : "+ roll);
                total = total + roll;
            }
            System.out.println("total = " +total);
        }
        else
        {
            System.out.println("no. of dice must be greater than 0");
        }


         
        
        //display the ascii code


       sc.close();
    }
    static void printDie(int roll){

        String die1 = """ 
                     -------
                    |       |
                    |   O   |
                    |       |
                     -------

                     """;
        String die2 = """ 
                     -------
                    | O     |
                    |       |
                    |     O |
                     -------

                     """;
        String die3 = """ 
                     -------
                    | O     |
                    |   O   |
                    |     O |
                     -------

                     """;
        String die4 = """ 
                     -------
                    | O   O |
                    |       |
                    | O   O |
                     -------

                     """;             
        String die5 = """ 
                     -------
                    | O   O |
                    |   O   |
                    | O   O |
                     -------

                     """;  
        String die6 = """ 
                     -------
                    | O   O |
                    | O   O |
                    | O   O |
                     -------

                     """;        

        switch(roll){
            case 1 -> System.out.print(die1);
            case 2 -> System.out.print(die2);
            case 3 -> System.out.print(die3);
            case 4 -> System.out.print(die4);
            case 5 -> System.out.print(die5);
            case 6 -> System.out.print(die6);
            default -> System.out.println("Invalid roll!");

        }



                             
                             
                             


    }
}
