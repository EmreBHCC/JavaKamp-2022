import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Mükemmel Sayilar
        System.out.println("Sayi giriniz : ");
        Scanner klavye = new Scanner(System.in);
        int mukkemmel = klavye.nextInt();
        int toplam = 0;
        for (int i = 1; i < mukkemmel; i++) {
            if (mukkemmel % i == 0) {
                toplam += i;
            }
        }
        if (toplam == mukkemmel) {
            System.out.println("Sayi mukemmeldir");
        } else {
            System.out.println("Sayi mukemmel değildir");
        }
    }
}
//Engin Hocanın çözümü
/*
public class Main {
    public static void main(String[] args) {
        //6 -->1,2,3
        //28-->1,2,4,7,14
        int number = 5;
        int total = 0;

        for (int i = 1; i < number; i++) {
            if (number == 0) {
                total = total + i;
            }
            if (total == number) {
                System.out.println("Mükemmel sayıdır");
            } else {
            }
            System.out.println("Mükemmel sayı değildir");
        }
    }
}
*/