

package projecti;
// burası kullanıcıdan veri alabilmemiz için gerekli olan Scanner kütüphanesi
import java.util.Scanner;

public class OrtalamaHesapla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Buradada kullanıcadan veri almak için kullanacağımız anbahtar kelimeyi Scaneer sistemine atıyoruz.Ben input seçtim.
        String q1 = ("Lutfen matematik 1. ve 2. yazili notunuzu giriniz:");
        System.out.print(q1);
        int Note1 = input.nextInt();
        int Note2 = input.nextInt();
        float MathCalculate = ((Note1 + Note2) / 2);
        System.out.println("matamtik ortalamaniz ");
        System.out.println(MathCalculate);
        // Burada matematk  dersi için olan hespalama bitti.

        String q2 = ("Lutfen turkce 1. ve 2. yazili notlarinizi giriniz:");
        System.out.print(q2);
        int Note3 = input.nextInt();
        int Note4 = input.nextInt();
        float TurkishCalculate = ((Note3 + Note4) / 2);
        System.out.print("turkce not ortalamaniz");
        System.out.println(TurkishCalculate);
        //Burada türkçe dersi için olan hesaplama bitti.

        String q3 = ("Lutfen fizik 1. ve 2. yazili notlarinizi giriniz:");
        System.out.println(q3);
        int Note5 = input.nextInt();
        int Note6 = input.nextInt();
        float PhysicsCalculate = ((Note5 + Note6)/2);
        System.out.println("Fizik not ortalamaniz:");
        System.out.println(PhysicsCalculate);
        //Burada fizik dersi için olan hesaplama bitti.

        String GenelOrtalama = ("Genel ortalamanız :");
        System.out.println(GenelOrtalama);
        float GenelO = ((MathCalculate + TurkishCalculate + PhysicsCalculate)/3);
        System.out.println(GenelO);
        String control = GenelO >=60 ? "sinifi gecti":"sinifta kaldi";
        System.out.println(control);

    }
}
