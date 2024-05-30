// Cember.java
public class Cember implements GeometrikSekil {
    private double yaricap;

    public Cember(double yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    public double getAlan() {
        return Math.PI * yaricap * yaricap;
    }

    @Override
    public double getCevre() {
        return 2 * Math.PI * yaricap;
    }
}
