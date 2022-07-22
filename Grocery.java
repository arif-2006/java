package projecti;
import javax.security.sasl.SaslClient;
import java.util.Scanner;
public class Grocery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Fiyatları tanımlıyoruz
        float priceApple = (float) 3.67;
        float pricePear = (float) 2.14;
        float priceBanana = (float) 0.95;
        float priceTomato = (float) 1.11;
        float priceAubergine = (float) 5.00;

        String Giris = "Manava hosgeliniz urun fiyatlarimiz su sekildedir: \n 1.Elma: 3,67 \n 2.Armut: 2.14 \n 3.Muz: 0.95 \n 4.Domates: 1.11 \n 5.Patlican: 5.00 ";
        System.out.println(Giris);
        System.out.println("Almak istediginiz urunleri kacar kilo oldugunu yaziniz almak istemediklerinize sifir yaziniz.");

        //Giriş bölümü bitti.Şimdi alacağı kilo değerlerini yazacağız.

        System.out.print("Elmadan ne kadar alacaksiniz: ");
        float ApWeight = input.nextFloat();
        System.out.print("Armuttan ne kada alacaksiniz: ");
        float PWeight = input.nextFloat();
        System.out.print("Muzdan ne kadar alacaksiniz: ");
        float BWeight = input.nextFloat();
        System.out.print("Domatesten ne kadar alacaksiniz: ");
        float TWeight = input.nextFloat();
        System.out.print("Patlicandan ne kadar alacaksiniz");
        float AWeight = input.nextFloat();

        //Hesaplama bölümü
        float Total = ((priceApple*ApWeight)+(pricePear*PWeight)+(priceBanana*BWeight)+(priceTomato*TWeight)+(priceAubergine*AWeight));
        System.out.println("Toplam odegeceginiz miktar:"+Total +" TL'dir ");

    }
}
