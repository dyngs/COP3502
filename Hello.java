import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {

        Scanner scanner=new Scanner (System.in); // recalls the imported scanner
        String response1; // Defines Strings to be later used as as three input variables
        String response2;
        String response3;

        System.out.print("Hello. What is your name? ");
        response1=scanner.next(); //uses variable response 1 to read the name of the user and saves it
        System.out.print("It's nice to meet you, " + response1 + ". How old are you? "); //prints out text with response 1
        response2=scanner.next();
        System.out.println("I see that you are still quite young at only "+response2+".");  //prints in a new line using saved response 2
        System.out.print("Where do you live? ");
        response3=scanner.next();
        System.out.println("Wow! I've always wanted to go to "+response3+". Thanks for chatting with me. Bye!");
        //GitHub comment

    }
}

