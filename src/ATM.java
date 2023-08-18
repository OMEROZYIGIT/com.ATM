
import java.util.Scanner;


public class ATM {

    // calis adında method oluşturuldu
    public void calis(ABank_Hesap ABankHesap) {


        ABank_Login ABank01Login = new ABank_Login();

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bankamıza Hoşgeldiniz....");
        System.out.println("****************************");
        System.out.println("Kullanıcı Girişi");
        System.out.println("****************************");

        int giris_hakki = 3;
        
        while (true) {
            if (ABank01Login.login(ABankHesap)) {
                System.out.println("Giriş Başarılı...");
                break;

            } else {
                System.out.println("Giriş Başarısız...");
                giris_hakki -= 1;
                System.out.println("Kalan Giriş Hakkı : " + giris_hakki);
            }

            if (giris_hakki == 0 ){
                System.out.println("Giriş Hakkınız Bitti...");
                
                return;
            }
        }
        
        System.out.println("*********************************");
        String islemler = "1. Bakiye Görüntüle\n"
                          + "2. Para Yatırma\n"
                          + "3. Para Çekme\n"
                          + "Çıkış için q'ya basın";
        System.out.println(islemler);
        System.out.println("**********************************");

        while (true) {
            System.out.println("İşlemi Seçiniz : ");
            String islem = scanner.nextLine();
            
            if (islem.equals("q")){
                
                break;

            } else if (islem.equals("1")){
                System.out.println("Bakiyeniz : " + ABankHesap.getBakiye());

            } else if (islem.equals("2")){
                System.out.print("Yatırmak istediğiniz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                ABankHesap.paraYatir(tutar);
                
            } else if (islem.equals("3")) {
                System.out.print("Çekmek istediğiniz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                ABankHesap.paraCek(tutar);
                
            } else {
                System.out.println("Geçersiz İşlem....");

            }
        }
    }
}
