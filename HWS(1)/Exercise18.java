package Workshop;
import java.util.*;
public class Exercise18 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the amount of numbers you want to enter:");
        int num=Integer.parseInt(scanner.nextLine());
        int[]x=new int[num];
        int i,j,temp;
        for(i=0;i<num;i++){
            System.out.println("Enter a number:");
            x[i]=Integer.parseInt(scanner.nextLine());
        }
        for(i=0;i<num;i++){
            for(j=0;j<num-1;j++){
                if(x[j]>x[j+1]){
                    temp=x[j];
                    x[j]=x[j+1];
                    x[j+1]=temp;
                }
            }
        }
        for(i=0;i<num;i++){
            System.out.println((i+1)+"-"+x[i]);
        }
    }
}
