import javax.crypto.spec.PSource;

public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Emre" ;
        String ogrenci2 = "Burak" ;
        String ogrenci3 = "Engin" ;
        String ogrenci4 = "Levent" ;

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("----------------");

        String[] ogrenciler = new String[6];
        ogrenciler[0] = "Emre" ;
        ogrenciler[1] = "Burak" ;
        ogrenciler[2] = "Engin" ;
        ogrenciler[3] = "Levent" ;
        ogrenciler[4] = "Burçin" ;
        ogrenciler[5] = "Emirhan" ;

    for ( int i = 0 ; i < ogrenciler.length ; i++ ) {
        System.out.println(ogrenciler[i]);
    }
        System.out.println("----------------");
    for ( String ogrenci : ogrenciler )
        System.out.println(ogrenci);
    }
}