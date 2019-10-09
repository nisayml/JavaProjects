package nisa;
import java.util.scanner;
class PrimeNumber
{
      public static void main(String args[] )
      {
          int temp;
          boolean ÝsNumberPrime=true;
          Scanner scan=new Scanner(System.in);
          System.out.println("Enter any number:");
          int num=scan.nextInt();
          for(int i=2; 1<=num/2; i++)
          {
             temp=num%i;
             if(temp==0)
             {
                 isNumberPrime=False;
                 break;
             }
          }
      System.out.println(isNumberPrime? num+" is a prime number" : num+" is not a prime number");
     }
}