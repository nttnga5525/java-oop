package lab2;

import java.util.Scanner;

public class exercise01 {
    public static void main(String[] args) {
        //Input option
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input height(m): ");
        float height = scanner.nextFloat();
        System.out.print("Please input weight(kg): ");
        int weight = scanner.nextInt();

        float BMI;
        BMI = weight / (height * 2);
        if (BMI < 18.5) {
            System.out.format("Underweight. You should increase %.1f (kg)", 18.5 - BMI);
        }
        if (BMI >= 18.5 && BMI < 25) {
            System.out.print("Normal weight");
        }
        if (BMI >= 25 && BMI < 30) {
            System.out.format("Over weight. You should decrease %.1f (kg)", BMI - 18.5);
        }
        if (BMI >= 30) {
            System.out.format("Obesity.You should decrease %.1f (kg)", BMI - 18.5);
        }

    }
}
