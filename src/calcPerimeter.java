import java.lang.Math;

class perimFuncs {
    float radius;
    float side;
    float height;
    float width;

    public float circlePerim() {
        return 2 * (float) Math.PI * this.radius;
    }

    public float rectPerim() {
        return 2 * (this.height + this.width);
    }

    public float sqPerim() {
        return 4 * this.side;
    }

    perimFuncs(float radius, float side, float height, float width) {
        this.radius = radius;
        this.side = side;
        this.height = height;
        this.width = width;
    }
}

public class calcPerimeter {
    public static void main(String[] args) {
        if (args.length < 4) {
            System.out.println("Usage: java calcPerimeter <radius> <side> <height> <width>");
            System.exit(0);
        } else {
            float radius = Float.parseFloat(args[0]);
            float side = Float.parseFloat(args[1]);
            float height = Float.parseFloat(args[2]);
            float width = Float.parseFloat(args[3]);
            perimFuncs perim = new perimFuncs(radius, side, height, width);
            float perimCirc = perim.circlePerim();
            float perimRect = perim.rectPerim();
            float perimSq = perim.sqPerim();
            System.out.println("Perimeter of circle: " + Float.toString(perimCirc));
            System.out.println("Perimeter of Rectangle: " + Float.toString(perimRect));
            System.out.println("Perimeter of Square: " + Float.toString(perimSq));
        }
    }
}