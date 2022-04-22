package ProjelerVeOdevler;
import java.util.Scanner;
public class VucutKitleEndeksiOdevi {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
            double kilo, boy, endeks;

        System.out.print("Lutfen Kilonuzu Giriniz :" );
            kilo = inp.nextDouble();
        System.out.println(kilo);

        System.out.print("Lutfen boyunuzu Metre Cinsinden Giriniz : ");
            boy = inp.nextDouble();
        System.out.println(boy);

        System.out.print("Vucut Kitle Endeksiniz : ");
            endeks = kilo / (boy * boy) ;
        System.out.println(endeks);
    }

}
