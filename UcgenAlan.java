package projecti;
import java.util.Scanner;
public class UcgenAlan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //1. veri alındı
        String q1 = "lutfen taban kenari giriniz:";
        System.out.print(q1);
        float taban = input.nextFloat();


        //2. veri alındı
        String q2 = "lutfen yukseklik kenarini giriniz : ";
        System.out.print(q2);
        float yukseklik = input.nextFloat();

        //hipotenüs hesaplama

        float HipostenusCalculate=((taban * taban)+(yukseklik * yukseklik ));
        float Hipotenus = (float) Math.sqrt(HipostenusCalculate);

        //Alana hespalama bölümü
        float AlanCalculate = ((taban * yukseklik)/2);
        String Acıklama = ("Ucgeninizin alani: " + AlanCalculate + " -------------> hipotenusu: "+ Hipotenus );
        System.out.println(Acıklama);




    }
}
