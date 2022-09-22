import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int adet, sayi, min = 0, max = 0;

        System.out.print("Kaç Sayı Girmek İstiyorsunuz: ");
        adet = scan.nextInt();

        for (int i = 1; i <= adet; i++) {
            System.out.print(i + ". Sayınızı Giriniz: ");
            sayi = scan.nextInt();

            if (i == 1) {
                max = sayi;
                min = sayi;
            } else if (sayi > max) {
                max = sayi;
            } else if (sayi < min) {
                min = sayi;
            }
        }

        System.out.println("Girdiğiniz Sayılardan En Büyüğü: " + max);
        System.out.println("Girdiğiniz Sayılardan En Küçüğü: " + min);
    }
}
