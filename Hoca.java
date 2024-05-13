public class Hoca extends Insan {
    String name = "ahmet";

    public void notVerdi() {
        System.out.println(this.name + " " + "Hoca notunu verdi");
    }

    @Override
    /*
     * Ezme işlemi=Override
     *
     *bir alt sınıfın      ------->üst sınıfın
     *                 veya
     *                     ------->arayüzün ( ** Interface'lerin ** ) metodlarını
     *
     *               Üzerine yazdığı veya Geçersiz kıldığı
     *
     *                        Anlamına gelir.
     *
     *
     * */
    public void konus() {
        System.out.println(this.name + " " + " Hoca derste konuştu");
    }

    public void odevVerdi() {
        System.out.println(this.name + "hoca ödev verdi.");
    }
}
