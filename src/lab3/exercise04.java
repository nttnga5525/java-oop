package lab3;

public class exercise04 {
    public static void main(String[] args) {
        int[] intArr1 = {1, 12, 16, 28, 34};
        int[] intArr2 = {1, 13, 16, 27, 99};
        int[] intMerge = new int[intArr1.length + intArr2.length - 1];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < intArr1.length && j < intArr2.length) {
            if (intArr1[i] < intArr2[j]) {
                intMerge[k] = intArr1[i];
                i++;
            } else {
                intMerge[k] = intArr2[j];
                j++;
            }
            k++;

        }
        for (int in : intMerge) {
            System.out.print(in + " ");
        }
    }
}
