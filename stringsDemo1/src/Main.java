public class Main {
    public static void main(String[] args) {
        String mesaj = "Kendini geliştirmenin en iyi yolu kod yazmaktan geçer.";

        System.out.println(mesaj);

        // Cümle veya kelime içinde harf değişimi için kullnılır
        System.out.println(mesaj.replace('i','o').replace('a','o').replace('e','o'));
        // Fonksiyonlar kalıcı olarak değişiklik yapmaz
        System.out.println(mesaj);
        // Kalıcı olarak değiştirmek için
        String yeniMesaj = mesaj.replace(' ','_');
        System.out.println(yeniMesaj);

        // Cümle kesme
        System.out.println(mesaj.substring(2));
        System.out.println(mesaj.substring(8,15));

        // Alt alta yazmak için yazılan bir for
        for ( String kelime : mesaj.split(" ")) {
            System.out.println(kelime);
        }

        // Büyük ve küçük yazmak için kullanılır
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());

        String mesaj01 = "          Başı ve Sonu Boş olan bir veri           ";
        System.out.println(mesaj01);
        System.out.println(mesaj01.trim());


    }
}