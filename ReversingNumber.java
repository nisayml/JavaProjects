import java.util.*

public class SayýnýnTersi{

    public static void main(String[] args) {

        int sayý ;
		int tersi = 0;
        Scanner scan=new Scanner (System.in) ;
		System.out.println("bir tam sayi giriniz");
		sayi=scan.nextInt();
        while(sayi != 0) {
            int kalan = sayi % 10;
            tersi = tersi * 10 + kalan;
            sayi /= 10;
        }

        System.out.println("Ters sayi " + tersi);
    }
}