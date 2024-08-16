import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First Number");
        int a=sc.nextInt();
         System.out.println("Enter Second Number");
        int b=sc.nextInt();

        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for Division");
        System.out.println("Press 4 for Multiplication");
        int n= sc.nextInt();
        switch(n){
            case 1:
                System.out.println("Addition of "+a+" and "+b+ "is :- "+(a+b));
                break;
            case 2:
                System.out.println("Subtraction of "+a+" and "+b+ "is :- "+(a-b));
                break;

            case 3:
                System.out.println("Division of "+a+" and "+b+ "is :- "+(a/b));
                break;
            case 4:
                System.out.println("Multiplication of "+a+" and "+b+ "is :- "+(a*b));
                break;  
            default: 
                System.out.println("No option");          
        }
       
    }
}