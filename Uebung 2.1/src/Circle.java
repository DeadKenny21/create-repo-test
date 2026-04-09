public class Circle {
    private Point center;
    private double radius;
    private static final double pi = 3.1415926;
    public class Point {

        private double x;
        private double y;
        public void move(double x, double y){
            this.x += x;
            this.y += y;
        }
        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
        public Point(){
            this(0,0);
        }
        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }
    }
    public Circle(){
        this(0,0,1);
    }
    public Circle(double x, double y, double radius) {
        this.center = new Point(x,y);
        if (radius > 0)
            this.radius = radius;
        else
            this.radius = 0;
    }
    public static Circle maxRadius(Circle[] fld){
        Circle max = new Circle(0,0,0);
        for(Circle c: fld)
            if(c.radius>max.radius) max =c;
        return max;
    }
    public void move (Point pnt){
        center.move(pnt.getX(), pnt.getY());
    }


    public double getCenterX() {
        return center.getX();
    }
    public double getCenterY() {
        return center.getY();
    }
    public double getRadius() {
        return radius;
    }
    public double circum(){
        return 2*pi*radius;
    }
    public double area(){
        return pi*radius*radius;
    }
}
