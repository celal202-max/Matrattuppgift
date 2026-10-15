import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Matratt> lunchmeny = new ArrayList<>();

        lunchmeny.add(new Matratt("Vegansk Sallad", 110.0, Mattyp.VEGANSK, 450));
        lunchmeny.add(new Matratt("Köttbullar med potatis",125.0, Mattyp.KÖTT , 750));
        lunchmeny.add(new Matratt("Falafelrulle", 95.0, Mattyp.VEGANSK, 650));

        System.out.println("=== DAGENS LUNCHMENY ===");
        for (Matratt m : lunchmeny) {
            System.out.println(m);

        }
    }
}