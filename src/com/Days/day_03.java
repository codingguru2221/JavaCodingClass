import java.util.Scanner;
class Example{
    static void Example(){
        int a ;
    }

    static void exp(){


    }


}

public class day_03 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the day");
        int opration= sc.nextInt();
        System.out.println("you entered  "+opration);
        switch (opration){
            case 1:
                System.out.println("sunday");
            break;
            case 2:
                System.out.println("monday");
            break;
            case 3:
                System.out.println("tuesday");
            break;
            case 4:
                System.out.println("wednesday");
            break;
            case 5:
                System.out.println("thursday");
            break;
            case 6:
                System.out.println("friday");
            break;
            case 7:
                System.out.println("saturday");
            break;
            default:
                System.out.println("invalid input");
            break;
        }


    }
}
