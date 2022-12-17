import java.util.Scanner;

public class Main {
    public static void as(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = klavye.nextInt();
        int kalan = sayi % 2;
        boolean asalMi;
        if (sayi <= 0) {
            asalMi = false;
            System.out.println("Sayi 0 veya negatif olamaz");
        } else if (sayi == 1) {
            asalMi = false;
            System.out.println("1 Şartları sağlamasına rağmen bir asal sayı değildir");
        } else {
            asalMi = asal.kontrol(sayi);
        }

    }

    static class asal {
        public static boolean kontrol(int kontrolSayisi) {
            int kontrolDegiskeni = 0;
            for (int i = 1; i < kontrolSayisi; i++) {
                if (kontrolSayisi % i == 0) {
                    kontrolDegiskeni += 1;
                }
            }
            if (kontrolDegiskeni > 2) {
                System.out.println("Sayiniz : " + kontrolSayisi);
                System.out.println("Sayi asal değildir");
                return false;
            } else {
                System.out.println("Sayiniz : " + kontrolSayisi);
                System.out.println("Sayi asaldır");
                return true;
            }
        }

    }
}

//Engin Hocanın çözümü
/*
class AsalKontrol {
    public static void asalKontrol(String[] args) {
        int number = 21;
        int remainder = number % 2;
        // System.out.println(remainder);
        boolean isPrime = true;

        if (number == 1) {
            System.out.println("Sayi asal değildir");
            return;
        }
        if (number < 1) {
            System.out.println("Geçersiz sayi");
            return;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println("Sayi asaldır");
        } else {
            System.out.println("Sayi asal değildir");
        }

    }
}
*/
