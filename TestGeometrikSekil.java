public class TestGeometrikSekil {
    public static void main(String[] args) {
        GeometrikSekil geoNesne1 = new Cember(5);
        GeometrikSekil geoNesne2 = new Dikdortgen(5,3);


        System.out.println("iki nesne esit alana mı sahip? "+esitAlan(geoNesne1,geoNesne2));



        gosterGeometrikSekil(geoNesne1);
        gosterGeometrikSekil(geoNesne2);
    }

    public static boolean esitAlan(GeometrikSekil nesne1, GeometrikSekil nesne2) {
        return nesne1.getAlan() == nesne2.getAlan();
    }

    public static void gosterGeometrikSekil(GeometrikSekil nesne) {
        System.out.println();
        System.out.println("Alan: " + nesne.getAlan());
        System.out.println("Cevre : " + nesne.getCevre());
    }

}

