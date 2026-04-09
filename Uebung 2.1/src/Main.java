import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Circle[]circles = new Circle[3];
        Circle biggest;
        for(int i = 0; i < circles.length; i++){
            circles[i]=new Circle((i+1)*1.0,(i+1)*2.0,(i+1)*1.5);
        }

        for(Circle c: circles){
            c.move( c.new Point(1,2));
        }
        biggest = Circle.maxRadius(circles);
        System.out.println(
                "M: ("+biggest.getCenterX()+","+biggest.getCenterY()+") "+
                "r: "+biggest.getRadius()+" "+
                "U: "+biggest.circum()+" "+
                "F: "+biggest.area());
    }

}
