public class Matratt {
    private String namn;
    private double pris;
    private Mattyp typ;
    private int antalKalorier;

    public Matratt(String namn, double pris, Mattyp typ, int antalKalorier) {
        this.namn = namn;
        this.pris = pris;
        this.typ = typ;
        this.antalKalorier = antalKalorier;
    }

    public String getNamn() {
        return namn;
    }

    public double getPris() {
        return pris;
    }

    public Mattyp getTyp() {
        return typ;
    }

    public int getAntalKalorier() {
        return antalKalorier;
    }

    public String toString() {
        return namn + " (" + typ + ") - " + pris + " kr, " + antalKalorier + " kcal";
    }
}


