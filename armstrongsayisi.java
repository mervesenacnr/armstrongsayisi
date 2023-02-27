
import java.util.Scanner;

public class armstrongsayisi {

    // armstrong sayısına örnek : 9474 -> 9*4 + 4*4 + 7*4 + 4*4 = 9474 (4 basamak sayısıdır)
    
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Armstrong sayı hesaplama programına hoş geldiniz...");
        
        System.out.print("Sayı giriniz:");
        int sayi = scanner.nextInt();
        System.out.print("Basamak sayısı:");
        int basamak_sayisi= scanner.nextInt();
        
        int gecici_sayi = sayi;
        int toplam = 0;
        
        do {      
            
            int basamak_degeri = gecici_sayi %10;
            gecici_sayi /= 10;
            toplam += Math.pow(basamak_degeri, basamak_sayisi);
            
        } while (gecici_sayi>0);
     
        if (sayi==toplam) {
            
            System.out.println(sayi + " armstrong sayısıdır.");
        }
        else{
            System.out.println(sayi + " armstrong sayısı değildir.");
        }
        
    }
    
}
