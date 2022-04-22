package ProjelerVeOdevler;
import java.util.Scanner;
public class Hipotenus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            double kisakenar, uzunkenar, hipotenus, u, cevre, alan;

            System.out.print("Kisa Kenar : ");
                kisakenar = input.nextDouble();
            System.out.println(kisakenar);

            System.out.print("Uzun Kenar : " );
                uzunkenar = input.nextDouble();
             System.out.println(uzunkenar);

            System.out.print("Hipotenus : " );
                hipotenus = input.nextDouble();
            System.out.println(hipotenus);

            u = (kisakenar + uzunkenar + hipotenus) /2;
                 System.out.print("Cevre : ");
            cevre = 2 * u;
                 System.out.println(cevre);

                System.out.print("Alan : ");
            alan =Math.sqrt(u * (u-kisakenar) * (u-uzunkenar) * (u-hipotenus));
                 System.out.println(alan);




    }
}
