package java_projects;

import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your choice: rock = 1, paper = 2, scissor = 3 ");
        int UserInput = sc.nextInt();

        Random random = new Random();
        int ComputerInput = random.nextInt(3) + 1;
        if(UserInput==ComputerInput){
            System.out.println("draw!!");
        } else if(UserInput==1 && ComputerInput==3 || UserInput==2 && ComputerInput==1
                || UserInput==3 && ComputerInput==2){
            System.out.println("you win !!");
        } else{
            System.out.println("computer win !!");
        }
        if(ComputerInput==1){
            System.out.println("computer choice: rock");
        }if(ComputerInput==2){
            System.out.println("computer choice: paper");
        }if(ComputerInput==3){
            System.out.println("computer choice: scissor");
        }
    }
}
