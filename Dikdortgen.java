// Dikdortgen.java
public class Dikdortgen implements GeometrikSekil {
    private double uzunluk;
    private double genislik;

    public Dikdortgen(double uzunluk, double genislik) {
        this.uzunluk = uzunluk;
        this.genislik = genislik;
    }

    @Override
    public double getAlan() {
        return uzunluk * genislik;
    }

    @Override
    public double getCevre() {
        return 2 * (uzunluk + genislik);
    }
}
