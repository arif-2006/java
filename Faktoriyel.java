package projecti;
import java.util.Scanner;

import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 1;
        System.out.println("lutfen bir sayi giriniz:");
        int nFaktoriyel = sc.nextInt();
        for (int i = 1; i <= nFaktoriyel; i++) {
            total = total * i;

        }
        System.out.println(nFaktoriyel + " yazdiginiz sayinin faktoriyeli: " + nFaktoriyel);
        int rFaktoriyel;
        System.out.print("lutfen r faktoriyel derecesini gririniz:");
        rFaktoriyel = sc.nextInt();
        int total2;
        total2 = 1;
        for (int s = 1; s <= rFaktoriyel; s++) {
            total2 =total2*s;

        }
        System.out.println("r faktoriyel:"+total2);
        int combination = (total /(total2*(total-total2)));
        System.out.println("kombinasyon:" + combination);
    }
}