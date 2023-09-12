import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00, armutKilo, elmaKilo, domatesKilo,
                muzKilo, patlicanKilo, toplam;
        Scanner input = new Scanner(System.in);
        System.out.println("Armut kaç kilo?");
        armutKilo = input.nextDouble();
        System.out.println("Elma kaç kilo?");
        elmaKilo = input.nextDouble();
        System.out.println("Domates kaç kilo?");
        domatesKilo = input.nextDouble();
        System.out.println("Muz kaç kilo?");
        muzKilo = input.nextDouble();
        System.out.println("Patlıcan kaç kilo?");
        patlicanKilo = input.nextDouble();

        toplam = (armut * armutKilo) + (elma * elmaKilo) + (domates * domatesKilo) + (muz * muzKilo)
                + (patlican * patlicanKilo);
        System.out.println("Toplam tutar :" + toplam);

    }
}