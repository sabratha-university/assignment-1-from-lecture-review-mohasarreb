public class Circle extends Shape implements Moveable, Adjustable {
    private double radius;

    public double getRadius() { return radius; }
    public void setRadius(double r) { radius = r; }
    @Override public void draw() { /* رسم الدائرة */ }
    @Override public void move(int dx, int dy) { x += dx; y += dy; }
    @Override public void resize(double factor) { radius *= factor; }
}