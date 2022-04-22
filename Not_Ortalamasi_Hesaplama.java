//Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

package ProjelerVeOdevler;
import java.util.Scanner;
public class Not_Ortalamasi_Hesaplama {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notu : ");
        mat = input.nextInt();
        //System.out.println(mat);

        System.out.print("Fizik Notu : ");
        fizik = input.nextInt();
        //System.out.println(fizik);

        System.out.print("Kimya Notu : ");
        kimya = input.nextInt();
        //System.out.println(kimya);

        System.out.print("Turkce Notu : ");
        turkce = input.nextInt();
        //System.out.println(turkce);

        System.out.print("Tarih Notu : ");
        tarih = input.nextInt();
        //System.out.println(tarih);

        System.out.print("Muzik Notu : ");
        muzik = input.nextInt();
        //System.out.println(muzik);

        int toplam = (mat + fizik + tarih + muzik + kimya + turkce);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalama : " + sonuc);

        boolean gecti = sonuc >= 60;

        String gectikaldi = (gecti) ? "GECTINIZ" : "KALDINIZ";
        System.out.println(gectikaldi);

    }
}
