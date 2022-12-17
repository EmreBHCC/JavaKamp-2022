import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);

        System.out.println("Arkadaş Sayı bulma");
        System.out.println("------------------");
        System.out.println("İlk sayiyi girin : ");
        int ilkSayi = klavye.nextInt();

        System.out.println("İkinci sayiyi girin : ");
        int ikinciSayi = klavye.nextInt();
        int ilkToplam = 0;
        int ikinciToplam = 0;
        for (int i = 1; i <= ilkSayi; i++) {
            if (ilkSayi % i == 0) {
                ilkToplam += i;
            }
        }
        for (int i = 1; i <= ikinciSayi; i++) {
            if (ikinciSayi % i == 0) {
                ikinciToplam += i;
            }
        }
        if (ilkToplam == ikinciToplam) {
            System.out.println("Sayilar arkadaştır");
        } else {
            System.out.println("Sayilar arkadaş değildir");
        }
    }
}

//Engin Hocanın Çözümü
/*
public class Main {
    public static void main(String[] args) {
        //220-284
        int sayi1 = 220;
        int sayi2 = 284;
        int toplam1 = 0;
        int toplam2 = 0;
        for (
                int i = 1; i < sayi1; i++) {
            if (sayi1 == 0) {
            }
            toplam1 = toplam1 + i;
            for (int i = 1; i < sayi2; i++) {
                if (sayi2 == 0) {
                } else {
                    toplam2 = toplam2 + i;
                    if (sayi1 == toplam2 && sayi2 == toplam1) {
                        System.out.println("bu iki sayı arkadaş değildir");
                    } else
                        System.out.println("bu iki sayı arkadaştır");
                }
            }
        }
    }
}
*/