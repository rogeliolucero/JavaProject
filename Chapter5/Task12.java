package Chapter5;

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.println("(" + x + ", " + y + ")");
    }

    // Your code goes here
    /**
     * Scales the point's coordinates (x, y) by 0.5,
     * effectively moving it halfway toward the origin (0, 0).
     */
    public void scale() {
        this.x = this.x * 0.5; // Halve the x-coordinate
        this.y = this.y * 0.5; // Halve the y-coordinate
    }
}

public class Tasksheet24 {
    public static void main(String[] args) {
        Point p = new Point(32, 32);

        // The loop will apply the scale method 5 times
        for (int i = 0; i < 5; i++) {
            p.scale();
            p.print();
        }
    }
}