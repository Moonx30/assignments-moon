import java.util.Scanner;

public class Q8 {

    public static void main(String[]arg){
    Scanner input =new Scanner(System.in);
    System.out.println("Enter your name:");
    input.nextLine();
    System.out.println("Enter your age:");
    input.nextInt();
    System.out.println("Enter your ID:");
    input.nextShort();
    System.out.println("Enter your number of card");
    input.nextLong();
    System.out.println("Enter your avg:");
    input.nextFloat();
    System.out.println("Enter your salary:");
    input.nextDouble();
    System.out.println("true if you manger,false if you student");
    input.nextBoolean();
    System.out.println("1 true, 0false");
    input.nextBoolean();
    }
}
