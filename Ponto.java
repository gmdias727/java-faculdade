public class Ponto {
    private double x, y;

    public Ponto() {
        x = 0;
        y = 0;
    }

    public Ponto(double vX, double vY) {
        x = vX;
        y = vY;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double newX, double newY) {
        x = newX;
        y = newY;
    }

    public void assign(Ponto pt) {
        x = pt.x;
        y = pt.y;
    }

    public double deltaX(double vX) {
        return vX - x;
    }

    public double deltaY(double vY) {
        return vY - y;
    }

    public double distance(double posX, double posY) {
        double dx = deltaX(posX);
        double dy = deltaY(posY);
        return Math.sqrt(dx * dx + dy * dy);
    }

    public void escale(double factor) {
        x *= factor;
        y *= factor;

        System.out.format("\n%.2f", x);
        System.out.format("\n%.2f", y);
    }

    public void desloc(double dX, double dY) {
        x *= dX;
        y *= dY;

        System.out.format("\n%.2f", x);
        System.out.format("\n%.2f", y);
    }
}
