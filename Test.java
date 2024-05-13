public class Test {
    public static void main(String[] args) {

        Insan ınsan = new Insan();
        ınsan.konus();
        System.out.println("------------------");

        ınsan = new Hoca();
        ınsan.konus();
        /*
         * Type casting(TİP DÖNÜŞÜMÜ)
         * ınsan değişkeni Hoca sınıfındaki
         * Nesneye atanıyor
         * bu nesnenin metodlarına ulaşıyoruz.
         * */
        ((Hoca) ınsan).notVerdi();
        ((Hoca) ınsan).odevVerdi();
        System.out.println("-----------------");


        ınsan = new Ogrencı();
        ınsan.konus();
        ((Ogrencı)ınsan).kustu();



    }
}