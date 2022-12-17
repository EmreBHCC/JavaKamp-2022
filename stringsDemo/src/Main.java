public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün Hava Çok Güzel";
        // Gibi düşünülebilir //char [] = String mesaj  ;
        System.out.println(mesaj);

        // Eleman sayısı verir
        System.out.println("Eleman sayısı : " + mesaj.length());

        // Metin içinden harf seçmekte kullanılır
        System.out.println("5. elemanı : " + mesaj.charAt(4));

        // Cümle veya kelime birleştirmekte kullanılır
        System.out.println(mesaj.concat(" Yaşasın !!!"));

        //Seçilen Harf ile başlayıp başlamadığı kontrol edilir
        System.out.println(mesaj.startsWith("A"));
        System.out.println(mesaj.startsWith("B"));

        //Seçilen Harf ile bitip bitmediği kontrol edilir
        System.out.println(mesaj.endsWith("."));
        System.out.println(mesaj.endsWith("l"));

        //bir cümle veya kelimeden char array e atama yapma
        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);

        // Bir karakterin veya kelimenin kaçıncı eleman olduğunu bulmaya yarar
        // İlk karakter de durur
        System.out.println(mesaj.indexOf('a'));
        System.out.println(mesaj.indexOf("ok"));

        // Sondan başlayarak arar
        System.out.println(mesaj.lastIndexOf('a'));
    }
}