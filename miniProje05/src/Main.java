public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1, 2, 3, 7, 9};
        int aranacak = 6;

        for (int s : sayilar) {
            if (s == aranacak) {
                System.out.println("Aranacak sayi dizide bulundu");
                return;
            }
        }
        System.out.println("Arnacak sayı dizide bulunamadı");
    }
}
//Engin Hocanın Çözümü
/*
public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 6;
        boolean varMi = false;
        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
                if (varMi) {
                    System.out.println("Sayı mevcuttur");
                } else {
                    System.out.println("Sayı mevcut değildir");
                }
            }
        }
    }
}
*/