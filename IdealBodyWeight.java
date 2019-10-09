package Odev;
import java.util.scanner;

public class IBM {
       int kilo;
       int boy;
    static int meter2Feet(int boy)
        int meters=boy*32/10;
        return meters;
   }    
       static void idealbodyweightforfemale(int kilo, int boy) {
          int idw1=kilo+ 2*meter2feet(boy);
    
     system.out.println("IBW FOR FEMALE is" idw1);
     
       }
       static void idealbodyweightformale(int kilo, int boy)  {
           int idw2=kilo+ 2*meter2feet(boy);
     
     system.out.println("IBW FOR MALE is" idw2);
     }
     
        public static void main(string[] args)  }

           Scanner input = new Scanner(System.in);
           char gender = 'o ';
           System.out.print("are you female or male?( 'f' or 'm' ) ")
           gender = input.next().charAt(0);

           if(gender=='f') { 

                    System.out.println("Boyunuzu girin:");
                    int boy = input.nextInt();
                    System.out.print("kilonuzu girin:");
                    int kilo = input.nextInt();
                    idealbodyweightforfemale(boy,kilo);
           
           } else if (gender=='m') {
           
                   
                    System.out.println("Boyunuzu girin:");
                    int boy = input.nextInt();
                    System.out.print("kilonuzu girin:");
                    int kilo = input.nextInt();
                    idealbodyweightformale(boy,kilo);

          }
   }
           
                    
                      
