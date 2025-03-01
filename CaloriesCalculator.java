import java.util.Scanner;

public class CaloriesCalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name;
        int min;
        
        System.out.print("Enter the Activity name : ");
        name=sc.nextLine();
        System.out.print("Enter the duration in minutes :");
        min=sc.nextInt();
        
        switch (name.toLowerCase()) {
            case "running":
                System.out.println("Burned Calories : "+(min*10.0));
                break;
            case "cycling":
                System.out.println("Burned Calories : "+(min*8.0));
                break;
            case "swimming":
                System.out.println("Burned Calories : "+(min*9.8));
                break;
            case "weightlifting":
                System.out.println("Burned Calories : "+(min*3.5));
                break;
            case "yoga":
                System.out.println("Burned Calories : "+(min*2.5));
                break;
            case "jump rope":
                System.out.println("Burned Calories : "+(min*12.0));
                break;
            case "walking":
                System.out.println("Burned Calories : "+(min*3.3));
                break;
            case "hiit":
                System.out.println("Burned Calories : "+(min*11.0));
                break;
            case "Dancing":
                System.out.println("Burned Calories : "+(min*5.0));
                break;
            case "Basketball":
                System.out.println("Burned Calories : "+(min*8.0));
                break;
            case "pilates":
                System.out.println("Burned Calories : "+(min*3.0));
                break;
            case "rock climbing":
                System.out.println("Burned Calories : "+(min*7.5));
                break;
            case "hiking":
                System.out.println("Burned Calories : "+(min*6.5));
                break;
            case "kickboxing":
                System.out.println("Burned Calories : "+(min*7.0));
                break;
            case "rowing":
                System.out.println("Burned Calories : "+(min*7.5));
                break;
            case "elliptical training":
                System.out.println("Burned Calories : "+(min*7.0));
                break;
            case "zumba":
                System.out.println("Burned Calories : "+(min*6.5));
                break;
            default:
                System.out.println("Unable to calculate");
                break;
        }

        
    }
    
}
