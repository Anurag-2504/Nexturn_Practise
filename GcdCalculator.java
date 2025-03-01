import java.util.*;

public class GcdCalculator {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter two numbers : ");
        int x=sc.nextInt();
        int y=sc.nextInt();

        int gcd=1;

        for(int i=1;i<=x;i++){
            if(x%i==0 && y%i==0){
                gcd=i;
            }
        }
        System.out.println("Greatest Common Divisor of "+x+" and "+y+" is : "+gcd);
        
    }
}

