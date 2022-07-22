package projecti;
import java.util.Scanner;
public class VucutEndeks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //güzellik katması için:)
        String Gırıs = "vucut kitle endeksi hesaplama programina hosgeldiniz";

        //Burada verileri alıyoruz
        System.out.println(Gırıs);
        String weight = "Lutfen kilonuzu giriniz: ";
        System.out.print(weight);
        float kilo = input.nextFloat();
        String height = "Lutfen boyunuzu metre cinsinden giriniz: ";
        System.out.print(height);
        float boy = input.nextFloat();

        //hesaplama bölümü
        float İndex = (kilo / (boy*boy));
        String endeks = ("vucut kutle endeksiniz: "+ İndex);
        System.out.println(endeks);

    }
}
