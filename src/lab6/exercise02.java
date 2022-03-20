package lab6;

import java.util.Scanner;

public class exercise02 {
    public static void main(String[] args) {
        String myPassword = "password123";
        int times = 0;
        while (times<4){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter your password: ");
            String password = scanner.next();
            if (password.endsWith(myPassword)){
                System.out.println("You entered the correct password.");
                break;
            } else {
                times++;
                if(times != 3){
                    System.out.println("Wrong password. Please re-enter!");
                }else {
                    System.out.println("You have entered the wrong password 3 times!");
                    break;
                }
            }

        }
    }
}
