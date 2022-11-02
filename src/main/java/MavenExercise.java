import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class MavenExercise {
    public static String whetherIsNumber(String userInput){
        if(StringUtils.isNumeric(userInput)){
            return "You entered a String";
        }
        return "You entered a number";
    }
    public static String flipCase(String userInput){
        return StringUtils.swapCase(userInput);
    }
    public static String reverse(String input){
        return StringUtils.reverse(input);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter something...");
        String userInput = sc.nextLine();

        System.out.println(whetherIsNumber(userInput));
        System.out.println(reverse(userInput));
        System.out.println(flipCase(userInput));


    }
}
