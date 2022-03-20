package lab6;

public class exercise04 {
    public static void main(String[] args) {
        String url = "https://google.com";
        if (url.startsWith("https")){
            System.out.println("Url is https");
        } else {
            System.out.println("Url is http");
        }
        System.out.println("Domain: " + url.substring(url.indexOf(".")));
    }
}
