package pruebaCirculo;
public class Circle implements IFiguraGeometrica {

    private int x;
    private int y;
    private double radio;
    private static final double CERO = 0.0;

    public Circle(int x, int y, double radio) {
        this.x = x;
        this.y = y;
        this.radio = (radio < CERO ? CERO : radio);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = (radio < CERO ? CERO : radio);
    }

    public double getDiametro() {
        return 2 * radio;
    }

    public double getCircunferencia() {
        return Math.PI * getDiametro();
    }

    public double getArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public String toString() {
        return "Centro = [" + x + ", " + y + "]; Radio = " + radio;
    }
}