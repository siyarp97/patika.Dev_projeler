package ProjelerVeOdevler;
import java.util.Scanner;
public class ManavOdevi {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

            //Fiyat
        double af, ef, df, mf, pf;

                 System.out.print("Armut Kilo : ");
                      af = inp.nextDouble();
                 System.out.println(af);

                 System.out.print("Elma Kilo : " );
                      ef = inp.nextDouble();
                    System.out.println(ef);

                 System.out.print("Muz Kilo : ");
                    mf = inp.nextDouble();
                    System.out.println(mf);

                 System.out.print("Patlican Kilo : " );
                    pf = inp.nextDouble();
                    System.out.println(pf);
                 System.out.print("Domates Kilo : " );
                    df = inp.nextDouble();
                    System.out.println(df);

        double a, e, d, m, p, fiyat;
        a = 2.14;  e = 3.67; d = 1.11; m = 0.95; p = 5.0;


        fiyat = (a * af) + (e * ef) + (d * df) + (m * mf) + (p * pf);
        System.out.println("Odemeniz Gereken Tutar : " + fiyat + "TL");

        System.out.println(" ");
        System.out.println("Yine Bekleriz!");
    }

}
