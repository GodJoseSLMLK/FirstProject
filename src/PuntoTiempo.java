public class PuntoTiempo extends Punto {
    private int t;

    public PuntoTiempo() {
        this(0, 0, 0);
    }
    public PuntoTiempo(int x, int y, int t) {
        super(x, y);
        this.t = t;
    }
}
