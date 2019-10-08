//#1 (java source codes)NÝSA NUR YÜMLÜ 150201008

import java.util.Scanner;
public class LeayYear {
 
    public static void main(String[] args) {

      Scanner input=new Scanner (System.in);
        int value=input.nextInt();

        if( ((value/4==0 || (value/400==0))  && (value/100!=0))  {
        System.out.println(value +" is Leap Year ");
        } 
           else {
              System.out.println(value + " is not Leap Year ");
        }
    }
}
















