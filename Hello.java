import java.util.Scanner;

public class Hello {
    public static void main(String [] args) {
        Scanner type = new Scanner(System.in);

        System.out.print("Hello. What is your name? ");

        String name = type.next();

        System.out.print("It's nice to meet you, " + name + ". How old are you? ");

        String age = type.next();

        System.out.println("I see that you are still quite young at only " + age + ". ");

        System.out.print("Where do you live? ");

        String location = type.next();

        System.out.print("Wow! I've always wanted to go to " + location + ". Thanks for chatting with me. Bye! ");







    }
}


