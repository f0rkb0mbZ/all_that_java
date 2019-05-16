import java.io.*;
import java.lang.Math;

class areaFuncs {
    float radius;
    float side;
    float height;
    float width;

    public float circleArea() {
        return ((float) Math.PI * this.radius * this.radius);
    }

    public float rectArea() {
        return (this.height * this.width);
    }

    public float sqArea() {
        return (this.side * this.side);
    }

    areaFuncs(float radius, float side, float height, float width) {
        this.radius = radius;
        this.side = side;
        this.height = height;
        this.width = width;
    }
}

public class calcAreaBuff {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the radius: ");
        float radius = Float.parseFloat(br.readLine());
        System.out.print("Enter the side: ");
        float side = Float.parseFloat(br.readLine());
        System.out.print("Enter the height: ");
        float height = Float.parseFloat(br.readLine());
        System.out.print("Enter the width: ");
        float width = Float.parseFloat(br.readLine());
        areaFuncs area = new areaFuncs(radius, side, height, width);
        float areaCirc = area.circleArea();
        float areaRect = area.rectArea();
        float areaSq = area.sqArea();
        System.out.println("Area of circle: " + areaCirc);
        System.out.println("Area of Rectangle: " + areaRect);
        System.out.println("Area of Square: " + areaSq);
    }
}