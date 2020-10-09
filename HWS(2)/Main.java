import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter row and column for the numeric matrix you want to enter:");
        int num1=Integer.parseInt(scanner.nextLine());
        int num2=Integer.parseInt(scanner.nextLine());
        int [][] x=new int[num1][num2];
        int i,j,max=0;
        System.out.println("Enter "+num1*num2+" numbers:");
        for(i=0;i<num1;i++){
            for (j=0;j<num2;j++){
                x[i][j]=Integer.parseInt(scanner.nextLine());
                if(max<x[i][j]){
                    max=x[i][j];
                }
            }
        }
        System.out.println("The maximum number you entered is:"+max);
    }
}
