
public class ABank_Hesap {
    
    private String kullanici_adi;
    private String parola;
    private int bakiye;


    // file
        // code
            // generate
                    // constructor
     public ABank_Hesap(String kullanici_adi, String parola, int bakiye) {
        this.kullanici_adi = kullanici_adi;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    // file
        // code
            // generate
                    // getter and setter
    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    // paraYatir adında method oluşturuldu.
     public void paraYatir(int tutar) {
        
        bakiye += tutar;
        System.out.println("Yeni Bakiyeniz: " + bakiye+"$");
    }

    // paraCek adında method oluşturuldu
     public void paraCek(int tutar) {

        if ((bakiye - tutar) <  0) {
            System.out.println("Yeterli Bakiyeniz Yok...");
            
        } else {
            bakiye -= tutar;
            System.out.println("Yeni Bakiyeniz : " + bakiye+"$");
        }
    }
}
