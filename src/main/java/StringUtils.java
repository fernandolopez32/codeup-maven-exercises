import java.util.Scanner;

public class StringUtils {

    public static org.apache.commons.lang3.StringUtils su = new org.apache.commons.lang3.StringUtils();

    public static String wetherIsNumber(String userInput){
        if(!su.isNumeric(userInput)){
            return "You entered a String";
        }
        return "You entered a number";
    }

    public static String flipCase(String userInput){
        return su.swapCase(userInput);
    }

    public static String reverse(String input){
        return su.reverse(input);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter a number");
        String userInput = sc.nextLine();

        System.out.println(wetherIsNumber(userInput));
        System.out.println(reverse(userInput));
        System.out.println(flipCase(userInput));


    }

}
