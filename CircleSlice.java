
import java.util.Scanner;
public class CircleSlice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //yarıçapımızı alıp pi değerini 3,14 olarak atıyoruz.
        float pi = (float) 3.14;
        String q1 = " Lutfen yaricapi giriniz: ";
        System.out.print(q1);
        float yaricap = input.nextFloat();

        //dilim hesplamak istersek
        String Degree = ("Eger var ise lutfen dilim derecenizi giriniz yok ise 0 degerini giriniz: ");
        System.out.print(Degree);
        float sliceDegree = input.nextFloat();



        //Hesaplama bölümü
        float CircleArea = (pi * (yaricap*yaricap));
        float CircleEn = (2*pi*yaricap);
        float SliceArea = ((pi * (yaricap*yaricap)*sliceDegree)/360);
        String explanation =("ucgeninizin alani: "+ CircleArea + " cevresi: " +   CircleEn + " eger dilim degeri girdiyseniz dilim alani: "+ SliceArea + "\n pi degeri 3.14 uzerinden alinmistir. ");
        System.out.println(explanation);

    }
}
