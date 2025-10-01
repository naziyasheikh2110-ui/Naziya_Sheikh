package java_projects;

import java.util.Scanner;

public class college_result {
    public static void main(String[] args)
    {
        // take input of roll no. of students , show marks of each subject and calculate overall percentage
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your roll number: ");
        int rollno = sc.nextInt();

        System.out.println("Marks of Maths: ");
        int mark1 = sc.nextInt();

        System.out.println("Marks of Physics: ");
        int mark2 = sc.nextInt();

        System.out.println("Marks of Programing methodology: ");
        int mark3 = sc.nextInt();

        System.out.println("Marks of English: ");
        int mark4 = sc.nextInt();

        System.out.println("Marks of IT: ");
        int mark5 = sc.nextInt();

       // int obtained_mark = mark1 + mark2 + mark3 + mark4 + mark5;
        float percentage = (mark1 + mark2 + mark3 + mark4 + mark5) / 5.0f;
        System.out.println("Roll number: "+ rollno);
        System.out.println("Your overall percentage is: " + percentage+"%");

       if(percentage>=40){
           System.out.println("congratulations, you passed the exam !!");
       } else if(percentage<40){
           System.out.println("you failed the exam");
       }
    }
}
