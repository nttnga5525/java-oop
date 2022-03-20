package lab6;

public class exercise01 {
    public static void main(String[] args) {
        String time = "12hrs and 35 minutes";
        time = time.replaceAll(" ", "");
        String tempString = "";
        int total = 0;
        char[] timeCharacters = time.toCharArray();
        for (int i = 0; i < timeCharacters.length; i++) {
            if (Character.isDigit(timeCharacters[i])) {
                tempString = tempString.concat(timeCharacters[i] + "");
            } else if (Character.isLetter(timeCharacters[i])) {
                if (i == time.indexOf("hrs")) {
                    total = total + Integer.parseInt(tempString) * 60;
                    tempString = "";
                } else if (i == time.indexOf("minutes")) {
                    total = total + Integer.parseInt(tempString);
                    tempString = "";
                }
            }

        }
        System.out.println("Total " + total + " minutes");
    }
}
