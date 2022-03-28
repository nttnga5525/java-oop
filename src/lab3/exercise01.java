package lab3;

public class exercise01 {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        int evenNumbers = 0;
        int oddNumbers = 0;
        for (int i : intArr) {
            if (i%2 == 0){
                evenNumbers = evenNumbers +1;
            }else {
                oddNumbers = oddNumbers +1;
            }
        }
        System.out.println("Even numbers: "+evenNumbers);
        System.out.println("Odd numbers: "+oddNumbers);
    }
}
