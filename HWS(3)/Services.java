import java.util.Scanner;

public class Services{
    Scanner scanner=new Scanner(System.in);
    public int SMS(){
        System.out.println("Write down the SMS number you have sent:");
        return Integer.parseInt(scanner.nextLine());
    }
    public int inCallsInLine(){
        System.out.println("Write down how many minutes you have talked with your cooperator mobile number:");
        return Integer.parseInt(scanner.nextLine());
    }
    public int inCallsOutLine(){
        System.out.println("Write down how many minutes you have talked with different operator mobile number:");
        return Integer.parseInt(scanner.nextLine());
    }
    public int outCalls(){
        System.out.println("Write down how many minutes of foreign did you have:");
        return Integer.parseInt(scanner.nextLine());
    }
    public int gigaBytes(){
        System.out.println("How many gigabytes have you consumed:");
        return Integer.parseInt(scanner.nextLine());
    }
}
