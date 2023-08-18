
public class Main {
    public static void main(String[] args) {
        // Object Oriented(Nesne Yönelimli ) ATM Programı
        
        // Login Class'ı Kullanıcı Girişini Kontrol Edecek.
        
        // Hesap Class'ı Hesap İşlemlerini Yapacak.
        
        // ATM ise atmmizi çalıştıracak.
        
        ATM atm = new ATM();
        
        ABank_Hesap ABankHesap = new ABank_Hesap("Mustafa Murat","12345", 2000);
        
        atm.calis(ABankHesap);
        System.out.println("Programdan Çıkılıyor...");

    }
}
