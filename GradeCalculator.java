import java.util.*;


public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from user
        System.out.print("Enter your marks: ");
        int marks = scanner.nextInt();
        
        // Using switch-case for grading
        switch (marks / 10) {
            case 10:
            case 9:
                System.out.println("Your Grade is A");
                break;
            case 8:
                System.out.println("Your Grade is B");
                break;
            case 7:
                System.out.println("Your Grade is C");
                break;
            case 6:
                System.out.println("Your Grade is D");
                break;
            case 5:
                System.out.println("Your Grade is Fail");
                break;
           default:
                System.out.println("You Entered wrong Information");
               
        
        scanner.close();
    }
}
}
