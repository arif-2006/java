package projecti;
import java.util.Scanner;
public class Claculater {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Hesap makinesine hosgeldiniz...");
        String q1 = "Lutfen yapmak istediginiz islemi numarasi ile seciniz:  \n  1. Toplama  \n  2. Carpma  \n  3. Bolme  \n  4. Cikarma ";
        System.out.println(q1);
        int tercih = input.nextInt();
        switch (tercih){
            case 1:
                String v1 = "lutfen 1. sayiyi giriniz:";
                System.out.print(v1);
                float deger1 = input.nextFloat();
                String  v2 = "lutfen 2. sayiyi giriniz:";
                System.out.print(v2);
                float deger2 =input.nextFloat();
                float conclision1 = deger1+deger2;
                System.out.println("bu iki sayinin toplami: "+conclision1);
                break;

            case 2:
                String v3 = "lutfen 1. sayiyi giriniz";
                System.out.println(v3);
                float deger3 = input.nextFloat();
                String v4 = "lutfene 2. sayiyi giriniz:";
                System.out.println(v4);
                float deger4 = input.nextFloat();
                float conclision2=deger3*deger4;
                System.out.println(conclision2);
                break;

            case 3:
                String v5 = "lutfen 1. sayiyi giriniz";
                System.out.println(v5);
                float deger5 = input.nextFloat();
                String v6 = "lutfene 2. sayiyi giriniz:";
                System.out.println(v6);
                float deger6 = input.nextFloat();
                float conclision3=deger5/deger6;
                System.out.println(conclision3);
                break;
            case 4:
                String v7 = "lutfen 1. sayiyi giriniz";
                System.out.println(v7);
                float deger7 = input.nextFloat();
                String v8 = "lutfene 2. sayiyi giriniz:";
                System.out.println(v8);
                float deger8 = input.nextFloat();
                float conclision4=deger7-deger8;
                System.out.println(conclision4);
                break;
        }
    }
}
