public abstract class Shape {
    protected int x;
    protected int y;
    protected String color;

    public abstract void draw();
    public void moveTo(int x, int y) { this.x = x; this.y = y; }
}