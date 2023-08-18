
import java.util.Scanner;


public class ABank_Login {
    
    public  boolean login(ABank_Hesap ABankHesap){
        
        Scanner scanner = new Scanner(System.in);
        String kullanici_adi;
        String parola;
        
        System.out.print("Kullanıcı Adı : ");
        kullanici_adi = scanner.nextLine();

        System.out.print("Parola : ");
        parola = scanner.nextLine();
        
        if (ABankHesap.getKullanici_adi().equals(kullanici_adi) && ABankHesap.getParola().equals(parola)){
            return true;
            
        } else {
            return false;
        }
    }
}
