public class Main {
    public static void main(String[] args) {
        // FOR Döngüleri
       for ( int i = 1 ; i < 10 ; i++ ) {
           System.out.println(i);
       }
        System.out.println("Döngü bitti");

       // iki iki artan
        for ( int i = 1 ; i < 10 ; i+=2 ) {
            System.out.println(i);
        }
        System.out.println("FOR Tek Döngüsü bitti");

        // çift yazdıran
        for ( int i = 2 ; i < 10 ; i+=2 ) {
            System.out.println(i);
        }
        System.out.println("FOR Çift Döngüsü bitti");

        //While Dögüleri
        int i = 0;
        while (i<10) {
            System.out.println(i);
            i++;
            System.out.println(i);
        }
        System.out.println("WHİLE Döngü bitti");

        // Do while
        int j = 1;
        do {
            System.out.println(j);
            j  += 2 ;
        } while ( j<10 );
        System.out.println("DO-WHİLE Çift Döngüsü bitti");
    }
}