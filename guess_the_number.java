package java_projects;

import java.util.Random;
import java.util.Scanner;
class game{
    public int number;
    public int InputNumber;
    public int noOfGuessses;

    public int getNoOfGuessses() {
        return noOfGuessses;
    }
    public void setNoOfGuessses(int noOfGuessses) {
        this.noOfGuessses = noOfGuessses;
    }

     game(){
        Random random = new Random();
        this.number = random.nextInt(100)+1;
    }
    void takeUserInput(){
        System.out.println("guess the number between 1 to 100");
       Scanner sc = new Scanner(System.in);
       InputNumber = sc.nextInt();
       noOfGuessses++;
    }
    boolean isCorrectNumber( int InputNumber){
        if(InputNumber == number){
            System.out.format("yes the correct number is %d\n you choose the correct number in %d attempts\n ", number, noOfGuessses);
        } else if(InputNumber>number){
            System.out.println("too high...");
        } else if(InputNumber<number){
            System.out.println("too less...");
        }
        return false;
    }
}
public class guess_the_number {
    public static void main(String[] args) {
       game g = new game();
       boolean b = false;
       while(!b){
            g.takeUserInput();
         b =  g.isCorrectNumber(g.InputNumber);
        }
    }
}
