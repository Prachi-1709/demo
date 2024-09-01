import java.util.Scanner;
class NumberRange
{
  public static void main(String aargs[]){
  Scanner s= new Scanner(System.in);
  int n;
 
  System.out.println("Enter a number");
  n=s.nextInt();
  if(n>0)
       System.out.println("Number is positive");
  else if(n<0)
       System.out.println("Number is negative");
  else
       System.out.println("Number is zero");
}
}