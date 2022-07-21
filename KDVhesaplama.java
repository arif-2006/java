package projecti;
import java.io.StringReader;
import java.util.Scanner;
public class KDVhesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String FiyatAlim = "Lutfen urun fiyatini girniz";
        System.out.println(FiyatAlim);
        int alim =input.nextInt();
        String Settings = (alim >= 1000) ? "KDV orani %8":"KDV orani %18";
        System.out.println(Settings);
        int Calculate = (alim >=1000) ? ((alim +(alim/((alim*8)/100)))) : (alim+(alim/((alim*8)/100)));
        System.out.println("KDV'li fiyati "+Calculate);

    }
}
