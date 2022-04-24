package ProjelerVeOdevler;

import java.util.Scanner;

public class HesapMakinesiOdevi {
    public static void main(String[] args) {
        int n1, n2, islem, sifir;
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci Sayiyi Giriniz : ");
        n1 = input.nextInt();
        //System.out.println(n1);

        System.out.print("Ikinci Sayiyi Giriniz : ");
        n2 = input.nextInt();
        //System.out.println(n2);

        System.out.println("1- Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.print("Yapilacak Islemi Seciniz : ");
        islem = input.nextInt();

        switch (islem) {
            case 1:
                System.out.println(n1 + n2);
                break;
            case 2:
                System.out.println(n1 - n2);
                break;
            case 3:
                System.out.println(n1 * n2);
                break;
            case 4:
                switch (n2){
                    case 0:
                        System.out.println("Bir Sayi Sifira Bolunemez");
                        break;

                        default: System.out.println(n1 / n2);
                        break;

                    }
                break;

            default:
                System.out.println("Yanlis deger tusladiniz");
                break;

        }

    }

}

