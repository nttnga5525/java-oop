package lab2;

import java.util.Scanner;

public class exercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a number: ");
        int number = scanner.nextInt();
        if(number%2 == 0){
            System.out.println("It's an even");
        }else {
            System.out.println("It's an odd");

        }
    }
}
