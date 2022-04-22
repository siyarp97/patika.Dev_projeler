package ProjelerVeOdevler;
import java.util.Scanner;
public class DaireAlanOdevi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi, yaricap, merkezaci, alan;

                pi = 3.14;
        System.out.println("Pi Sayısı : " + pi);

        System.out.print ("Yaricapi Giriniz : ");
            yaricap = input.nextDouble();
        System.out.println(yaricap);

        System.out.print("Merkez Aciyi Giriniz : ");
            merkezaci = input.nextDouble();
        System.out.println(merkezaci);

        System.out.print("Dairenin Alani : ");
            alan = ((pi * (yaricap * yaricap) * merkezaci) / 360);
        System.out.println(alan);

    }
    }

