import java.util.*;

public class PalindromeKelime
{
   public static void main(String args[])
   {
      String normal, ters = "";
// ters degişkeninni string oldugunu belirttik.
      Scanner sc = new Scanner(System.in);
 
      System.out.println("Bir kelime girin ");
      normal= sc.nextLine();
 
      int uzunluk= normal.length();
 
      for ( int i = uzunluk - 1; i >= 0; i-- )
         ters = ters + normal.charAt(i);
 
      if (normal.equals(ters))
         System.out.println("Girdiğiniz kelime palindrome.");
      else
         System.out.println("Girdiğiniz kelime palindrome degil");
 
   }
}	