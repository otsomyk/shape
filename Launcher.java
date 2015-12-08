package shapes;

public class Launcher {

	public static void main(String[] args) {
		Shape sh = new Shape();
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		
		sh.draw();
		c.draw();
		r.draw();
		t.draw();

	}

}
