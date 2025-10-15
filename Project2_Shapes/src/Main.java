
public class Main {
    public static void main(String[] args) {
    
        Circle circle = new Circle();

    
        circle.setRadius(10.0);
        circle.moveTo(5, 7);

    
        System.out.println("🟢 معلومات الدائرة:");
        System.out.println("الموقع: (" + circle.x + ", " + circle.y + ")");
        System.out.println("نصف القطر: " + circle.getRadius());

        
        circle.move(3, 2);
        System.out.println("بعد التحريك: (" + circle.x + ", " + circle.y + ")");

    
        circle.resize(1.5);
        System.out.println("بعد التكبير: نصف القطر = " + circle.getRadius());

        
        circle.draw();
    }
}

