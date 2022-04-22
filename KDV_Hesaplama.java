package ProjelerVeOdevler;
import com.sun.jdi.Value;

import java.util.Scanner;
        public class KDV_Hesaplama {
            public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

                double paradegeri, kdv1, kdv2, kdvli, kdvtutar;

                System.out.print("Tutari Giriniz: ");
                paradegeri = input.nextDouble();
                System.out.println(paradegeri);

                kdv1 = 0.18;
                kdv2 = 0.08;

               /* System.out.print("KDV'li Fiyat : " );
                kdvli = (paradegeri * kdv1) + paradegeri;
                System.out.println(kdvli);

                System.out.print("KDV Tutari : " );
                kdvtutar = kdvli - paradegeri;
                System.out.println(kdvtutar);*/

                boolean sb = paradegeri <= 1000;
                 double odev = (sb) ? (paradegeri * kdv1) + paradegeri : (paradegeri * kdv2) + paradegeri;
                System.out.println("KDV'li Fiyat =" + odev);

                System.out.print("KDV Tutari : ");
                kdvtutar = odev - paradegeri;
                System.out.println(kdvtutar);

                boolean kdvorani = paradegeri <= 1000;
                double oran = (kdvorani) ? kdv1 : kdv2;
                    System.out.println("Kdv Orani : " + oran);



    }


}
