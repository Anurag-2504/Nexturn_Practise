import java.util.*;

public class TempConverter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int temp;
        System.out.print("Enter current tempereatur in Celcius : ");
        temp=sc.nextInt();

        if(temp>30){
            System.out.println("Today's weather is Hot");
        }else if(temp>=20 && temp<=30){
            System.out.println("Today's weather is Warm");
        }else if(temp>=10 && temp<20){
            System.out.println("Today's weather is Moderate");
        }else{
            System.out.println("Today's weather is Cold");
        }

    }
    
}
