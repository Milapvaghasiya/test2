import java.nio.charset.StandardCharsets;

public class RiyaClass {
    static String name ="Rajesh Patel's home number 0751254698 £50.00 Java & Selenium ***";
    public static void main(String[]args){
        //01Remove space from given string
        System.out.println(name.replaceAll("\\s",""));
        //02Remove Digit from given string
        System.out.println(name.replaceAll("0751254698",""));
        //03Extract number from given string
        System.out.println(name.replaceAll("[^0-9]",""));
        //04Remove Word Java from given string
        System.out.println(name.replaceAll("Java",""));
        //10Remove word Patel's from given string
        System.out.println(name.replaceAll("patel's",""));
        //05 Remove Special character from given string
        System.out.println(name.replaceAll("[^a-zA-Z0-9]",""));
        //06Convert to uppercase given string
        System.out.println(name.toUpperCase());
        //07 convert to lowercase from given string
        System.out.println(name.toLowerCase());
        //08 Find length of string
        System.out.println(name.length());
        // 09 Find index of p given string
        System.out.println(name.indexOf("p"));





}
}