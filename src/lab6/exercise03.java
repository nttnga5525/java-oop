package lab6;

public class exercise03 {
    public static void main(String[] args) {
        String myStr = "100 minutes 123";
        myStr = myStr.replaceAll(" ", "");
        String result = "";
        char[] character = myStr.toCharArray();
        for (char c : character) {
            if (Character.isDigit(c)){
                result = result.concat(c+"");
            }
        }
        System.out.println("Result: "+result);
    }
}
