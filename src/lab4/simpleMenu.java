package lab4;

import java.util.*;

public class simpleMenu {
    public static void main(String[] args) {
        boolean isContinuing = true;
        List<Integer> arrayList = new ArrayList<>();
        while (isContinuing) {
            // Display menu
            System.out.println();
            System.out.println("=====Menu=====");
            System.out.println("1. Add number into ArrayList");
            System.out.println("2. Print numbers");
            System.out.println("3. Get maximum number");
            System.out.println("4. Get minimum number");
            System.out.println("5. Find number");
            System.out.println("0. Exit");
            //Input option
            Scanner scanner = new Scanner(System.in);
            System.out.print("Choose an option, please: ");
            int userInput = scanner.nextInt();
            //
            if (userInput == 0) {
                isContinuing = false;
                System.out.println("Goodbye!!");
            } else if (userInput == 1) {
                System.out.print("Please input a number: ");
                int num = scanner.nextInt();
                arrayList.add(num);
            } else if (arrayList.size() > 0) {
                if (userInput == 2) {
                    for (int value : arrayList) {
                        System.out.print(value + " ");
                    }
                } else if (userInput == 3) {
                    int max = arrayList.get(0);
                    for (int index = 1; index < arrayList.size(); index++) {
                        if (arrayList.get(index) > max) {
                            max = arrayList.get(index);
                        }
                    }
                    System.out.println("Maximum number: " + max);
                } else if (userInput == 4) {
                    int min = arrayList.get(0);
                    for (int index = 1; index < arrayList.size(); index++) {
                        if (arrayList.get(index) < min) {
                            min = arrayList.get(index);
                        }
                    }
                    System.out.println("Minimum number: " + min);
                } else if (userInput == 5) {
                    System.out.print("Please input a number: ");
                    int num = scanner.nextInt();
                    boolean hasNumber = false;
                    for (int index = 0; index < arrayList.size(); index++) {
                        if (arrayList.get(index) == num) {
                            hasNumber = true;
                            System.out.println("Index of number: " + index);
                        }
                    }
                    if (!hasNumber) {
                        System.out.print("This number doesn't have in array");
                    }
                } else {
                    System.out.print("This option is not available");
                }
            } else {
                System.out.println("There is no number in array");
            }
        }

    }
}
