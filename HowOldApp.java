import java.util.Scanner;
public class HowOldApp {


static Scanner userinput = new Scanner(System.in);

public static void main(String[] args) {

            

    String s;
    int x;
    boolean n;
                        
    System.out.print("How old are you? ");

    s = userinput.nextLine();
    x = Integer.parseInt(s);

    x = x + 5;

    System.out.println("In 5 years you will be " + x + " years old.");


    n = ((x-5) < 20)&&((x-5) > 12);
    System.out.println("It is " + n +" that you are a teenager.");

    System.out.println("I am such a smart computer.");
}}


