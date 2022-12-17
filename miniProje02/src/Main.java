public class Main {
    public static void main(String[] args) {
        char harf = 'e';
        char[] kalinSesliHarfler = new char[]{'a', 'o', 'u', 'ı'};
        char[] inceSesliHarfler = new char[]{'e', 'ö', 'ü', 'i'};
        for (char ch : kalinSesliHarfler) {
            if (harf == ch) {
                System.out.println("Kalın Sesli Harf");
            }
        }
        for (char c : inceSesliHarfler) {
            if (harf == c) {
                System.out.println("İnce Sesli Harf");
            }
        }

    }
}
//Engin Hocanın çözümü
/*
public class Main {

    public static void main(String[] args) {
        char harf = 'E';
        switch (harf) {
            case 'A':
            case 'I':
            case '0':
            case 'U':
                System.out.println("Kalın sesli harf");
                break;
            default:
                System.out.println("Înce sesli harf");
        }
    }
}
*/