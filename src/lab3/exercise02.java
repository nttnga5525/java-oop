package lab3;

public class exercise02 {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        int minimum = intArr[0];
        int maximum = intArr[0];
        for (int i : intArr) {
            if (i < minimum) {
                minimum = i;
            }
            if (i > maximum) {
                maximum = i;
            }
        }
        System.out.println("Minimum: " + minimum);
        System.out.println("Maximum: " + maximum);
    }
}
