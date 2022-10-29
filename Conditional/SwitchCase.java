import java.util.Scanner;


public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("Enter a Number of the day : ");
        Scanner in = new Scanner(System.in);

        int day = in.nextInt();
        switch (day) {
            case 1:
                System.out.println("Day "+day+ " is Monday");
                break;
            case 2:
                System.out.println("Day "+day+ " is Tuesday");
                break;
            case 3:
                System.out.println("Day "+day+ " is Wednesday");
                break;
            case 4:    
                System.out.println("Day "+day+ " is Thursday");
                break;
            case 5:    
                System.out.println("Day "+day+ " is Friday");
                break;
            case 6:
                System.out.println("Day "+day+ " is Saturday");
                break;
            case 7:
                System.out.println("Day "+day+ " is Sunday");
                break;
            default:
                System.out.println("Enter a valid Number for day.");
            // break;
        }
 

            // switch (day) {
            //     case 1 -> System.out.println("Day "+day+ " is Monday");
            //     case 2 -> System.out.println("Day "+day+ " is Tuesday");
            //     case 3 -> System.out.println("Day "+day+ " is Wednesday");
            //     case 4 -> System.out.println("Day "+day+ " is Thrusday");
            //     case 5 -> System.out.println("Day "+day+ " is Friday ");
            //     case 6 -> System.out.println("Day "+day+ " is Saturday!");
            //     case 7 -> System.out.println("Day "+day+ " is Sunday");
            //     default -> System.out.println("Invalid !!!");
            // }

            
            // switch (day) {
            //         case 1 :
            //         case 2 :
            //         case 3 :
            //         case 4 :
            //         case 5 : System.out.println("WeekDays");
            //                 break;
            //         case 6 :
            //         case 7 : System.out.println("WeekEnd");
            //                 break;
            //         default:
            //             System.out.println("Enter a valid Number for day.");
            //             // break;
        // }        
    
    }
}