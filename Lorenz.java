import java.awt.Color;

public class Lorenz { 
    private double x, y, z;
    private Color color;

    public Lorenz(double x, double y, double z, Color color) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.color = color;
    }

    public void update(double dt) {
        double xnew = x + dx(x, y, z) * dt;
        double ynew = y + dy(x, y, z) * dt;
        double znew = z + dz(x, y, z) * dt;
        x = xnew;
        y = ynew;
        z = znew;
    }

    public void draw() {
        StdDraw3D.setPenColor(color);
        StdDraw3D.point(x, y, z);
    }


    public static double dx(double x, double y, double z) {
        return -10*(x - y);
    }

    public static double dy(double x, double y, double z) {
        return -x*z + 28*x - y;
    }

    public static double dz(double x, double y, double z) {
        return x*y - 8*z/3;
    }


    public static void main(String[] args) {
        //StdDraw.clear(StdDraw.LIGHT_GRAY);
        StdDraw3D.setScale(0,50);
        Lorenz lorenz1 = new Lorenz(0.01, 20.00, 25.0, StdDraw3D.BLUE);
        Lorenz lorenz2 = new Lorenz(0.01, 20.01, 25.0, StdDraw3D.MAGENTA);
        StdDraw3D.clear(StdDraw3D.BLACK);

        // Use Euler's method to numerically solve ODE
        double dt = 0.001;
        for (int i = 0; i < 50000; i++) {
            lorenz1.update(dt);
            lorenz2.update(dt);
            lorenz1.draw();
            lorenz2.draw();
            StdDraw3D.show3D();
            StdDraw3D.pause(10);
        }
    }

}