package lab3;

public class exercise03 {
    public static void main(String[] args) {
        int[] intArr = {12, 34, 1, 16, 28};
        for (int i = 1; i < intArr.length; i++) {
            for (int j = 0; j < i; j++){
                if(intArr[i]< intArr[j]){
                    int temp;
                    temp = intArr[j];
                    intArr[j] = intArr[i];
                    intArr[i] = temp;
                }
            }
        }
        for (int in : intArr) {
            System.out.print(in + " ");
        }
    }
}
