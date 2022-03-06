package lab5;

import java.util.*;

public class simpleMenu {
    public static void main(String[] args) {
        boolean isContinuing = true;
        Map<Integer,String> student = new HashMap<>();
        while (isContinuing){
            // Display menu
            System.out.println("=====Menu=====");
            System.out.println("1. Input student info");
            System.out.println("2. Find Student by ID");
            System.out.println("0. Exit!");
            //Input option
            Scanner scanner = new Scanner(System.in);
            System.out.print("Choose an option, please: ");
            int userInput = scanner.nextInt();
            //
            if( userInput == 0){
                isContinuing = false;
                System.out.println("Goodbye!!");
            }else {
                if (userInput == 1){
                    System.out.print("Student Name: ");
                    String studentName = scanner.next();
                    System.out.print("Student ID: ");
                    int studentID = scanner.nextInt();
                    student.put(studentID, studentName);
                }
                if (userInput == 2){
                    System.out.print("Input student ID: ");
                    int studentID = scanner.nextInt();
                    if (studentID >= 0 & student.get(studentID)!= null){
                        System.out.println("Student ID: " + student.get(studentID));
                    }else {
                        System.out.println("There is no student");
                    }
                }
            }

        }
    }
}
